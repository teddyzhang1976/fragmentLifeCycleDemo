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

/*
life cycle 1: normally installed and start without Fragment1 layout declaration in activity_main.
1. this.onCreate(){
	1.1 here, we set fragment layout from xml on setContentView
	1.2 we create fragment object.
	1.3 we connect the object to fragment layout container we set in 1.1 by issuing transaction.
	1.4 How about when we assign an class in fragment layout xml in 1.1?
}
2. this.onStart（）{
	2.1. Fragment1.onAttach
		3.1
	2.2. this.onAttachFragment
	2.3. Fragment1.onCreate()
	2.4. Fragment1.onCreateView()
	2.5. Fragment1.onActivityCreated
	2.6. Fragment1.onStart();
}

3. this.onResume();
4. Fragment1.onResume();
5. this.onPause(){
	5.1 Fragment1.onPause
}
6. this.onStop(){
	6.1. Fragment1.onStop
}
7. this.onRestart
8. this.onStart(){
	8.1. Fragment1.onStart
}
9. this.onResume
10. Fragment1.onResume

11. Goto 5.
*/

/*
life cycle 2: normally installed and start with Fragment1 layout declaration in activity_main.
1. this.onCreate(){
//by issuing setContentView with fragment layout in it. System will immediately create an object of the fragment and call its callback function step by step.
	1.1. Fragment1.onInflate
	1.2. Fragment1.onAttach
		1.2
	1.3. this.onAttachFragment
	1.4. Fragment1.onCreate()
	1.5. Fragment1.onCreateView()
}
2. this.onStart（）{
	2.1. Fragment1.onActivityCreated
	2.2. Fragment1.onStart();
}

3. this.onResume();
4. Fragment1.onResume();
5. this.onPause(){
	5.1 Fragment1.onPause
}
6. this.onStop(){
	6.1. Fragment1.onStop
}
7. this.onRestart
8. this.onStart(){
	8.1. Fragment1.onStart
}
9. this.onResume
10. Fragment1.onResume

11. Goto 5.
*/


@SuppressLint("Recycle")
public class MainActivity extends FragmentActivity {

	private static final String TAG = "TeddyMainActivity";
	private Fragment1 fragment1;
	private Fragment2 fragment2;

	/**
	 *
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "onCreate");
		super.onCreate(savedInstanceState);
		/**
		 * here, activity_main contained a fragment element declaration, so when we call setContentView , the system immediately create an object of fragment1 and call its onInflate() call back.
		 * The object is now locked in the layout. And onAttach(),onCreate .... callbacks are conscequently called as normal.
		 */
		setContentView(R.layout.activity_main);

		/*
		fragment1 = new Fragment1(); //Seems no callback is called on this step!
		fragment2 = new Fragment2();
		Bundle args = new Bundle();
		args.putString("hello", "Hello Fragment1");
		fragment1.setArguments(args);//Here args is set to a private variable of fragment1
		Log.i(TAG, "create Fragment1");
		FragmentTransaction transaction = getSupportFragmentManager()
				.beginTransaction();
		transaction.replace(R.id.main, fragment1);
		transaction.addToBackStack(null);
		transaction.commit();
		*/
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
		Log.i(TAG, "onCreate End");
	}

	@Override
	public void onAttachFragment(Fragment fragment) {
		Log.i(TAG, "onAttachFragment");
		super.onAttachFragment(fragment);
		Log.i(TAG, "onAttachFragment End");
	}

	@Override
	protected void onDestroy() {
		Log.i(TAG, "onDestroy");
		super.onDestroy();
		Log.i(TAG, "onDestroy End");
	}

	@Override
	protected void onPause() {
		Log.i(TAG, "onPause");
		super.onPause();
		Log.i(TAG, "onPause End");
	}

	@Override
	protected void onResume() {
		Log.i(TAG, "onResume");
		super.onResume();
		Log.i(TAG, "onResume End");
	}

	@Override
	protected void onStart() {
		Log.i(TAG, "onStart");
		super.onStart();
		Log.i(TAG,"onStart End");
	}

	@Override
	protected void onStop() {
		Log.i(TAG, "onStop");
		super.onStop();
		Log.i(TAG, "onStop End");
	}

	@Override
	protected void onRestart() {
		Log.i(TAG, "onRestart");
		super.onRestart();
		Log.i(TAG, "onRestart End");
	}
}
