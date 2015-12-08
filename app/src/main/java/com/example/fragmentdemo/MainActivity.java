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
		//before onResume
		// next step is Fragment1.onAttach
		// then this.onAttachFragment
		// then Fragment1.onCreate()
		// then Fragment1.onCreateView()
		// then Fragment1.onActivityCreated
		// then Fragment1.onStart();
		// then this.onResume();
		// then Fragment1.onResume();
		// 1. When stitched out or screen is locked off....
		// this.onPause
		// Fragment1.onPause
		// this.onStop
		// Fragment1.onStop
		// this.onRestart
		// this.onStart
		// Fragment1.onStart
		// this.onResume
		// Fragment1.onResume
		// Goto 1.

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
