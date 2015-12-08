package com.example.fragmentdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.fragment.Fragment1;
import com.example.fragment.Fragment2;

// life cycle 1: normally installed and start
// 1. this.onCreate
	//1.1 here, we set fragment layout from xml on setContentView
	//1.2 we create fragment object.
	//1.3 we connect the object to fragment layout container we set in 1.1 by issuing transaction.
	//1.4 How about when we assign an class in fragment layout xml in 1.1?
// 2. this.onStart
// 3. then Fragment1.onAttach
// 4. then this.onAttachFragment
// 5. then Fragment1.onCreate()
// 6. then Fragment1.onCreateView()
// 7. then Fragment1.onActivityCreated
// 8. then Fragment1.onStart();
// 9. then this.onResume();
// 10. then Fragment1.onResume();
// 11. When stitched out or screen is locked off....
// 12. this.onPause
// 13. Fragment1.onPause
// 14. this.onStop
// 15. Fragment1.onStop
// 16. this.onRestart
// 17. this.onStart
// 18. Fragment1.onStart
// 19. this.onResume
// 20. Fragment1.onResume
// 21. Goto 1.


@SuppressLint("Recycle")
public class MainActivity extends FragmentActivity {

	private static final String TAG = "TeddyMainActivity";
	private Fragment1 fragment1;
	private Fragment2 fragment2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fragment1 = new Fragment1(); //Seems no callback is called on this step!
		fragment2 = new Fragment2();
		Bundle args = new Bundle();
		args.putString("hello", "Hello Fragment1");
		fragment1.setArguments(args);
		Log.i(TAG, "create Fragment1");
		FragmentTransaction transaction = getSupportFragmentManager()
				.beginTransaction();
		transaction.replace(R.id.main, fragment1);
		transaction.addToBackStack(null);
		transaction.commit();
		Log.i(TAG, "fragment1 is added to main layout, but still no call back is triggled");
		findViewById(R.id.btn).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Bundle args = new Bundle();
				args.putString("hello", "Hello Fragment2");
				fragment2.setArguments(args);
				Log.i(TAG, "create Fragment2");
				FragmentTransaction transaction = getSupportFragmentManager()
						.beginTransaction();
				transaction.replace(R.id.main, fragment2);
				transaction.addToBackStack(null);
				transaction.commit();
			}
		});
	}

	@Override
	public void onAttachFragment(Fragment fragment) {
		Log.i(TAG, "onAttachFragment");
		super.onAttachFragment(fragment);
	}

	@Override
	protected void onDestroy() {
		Log.i(TAG, "onDestroy");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.i(TAG, "onPause");
		super.onPause();
	}

	@Override
	protected void onResume() {
		Log.i(TAG, "onResume");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.i(TAG, "onStart");
		super.onStart();
		Log.i(TAG,"onStart is going outside");


	}

	@Override
	protected void onStop() {
		Log.i(TAG, "onStop");
		super.onStop();
	}

	@Override
	protected void onRestart() {
		Log.i(TAG, "onRestart");
		super.onRestart();
	}
}
