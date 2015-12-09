package com.example.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentdemo.R;

public class Fragment1 extends Fragment {

	private static final String TAG = "TeddyFragment1";

	public interface OnArticleSelectedListener {
		 void onArticleSelected(int result);
	}

	/**
	 * 1. First callback when create object from Activity.setContentView().
	 * What can we do here?
	 */
	@Override
	public void onInflate(Activity activity, AttributeSet attrs,Bundle savedInstanceState){
		Log.v(TAG, "Fragment1 onInflate");
		super.onInflate(activity,attrs,savedInstanceState);
		//super.onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState);
	}

	/**
	 * 2. Second callback when first time associated to an activity. no longer called later.
	 * What can we do here?
	 */
	@Override
	public void onAttach(Activity activity) {
		Log.v(TAG, "Fragment1 onAttach");
		Bundle args = getArguments();//is this can be called when we need it? ,I think it is.
		if (null != args) {
			/*
			 * ���������ǿ��Խ���Acivity�յ������ݱ���������������ʾ��Fragment���С�
			 */
			Log.d(TAG,
					"Fragment1 Get data from activity "
							+ args.getString("hello"));
		}
		super.onAttach(activity);
	}

	/**
	 * 3. 3rd callback. after onAttach()
	 * what can we do here?
	 * we got a savedInstanceState here , so the function is used to restore saved args for the fragment. Just like activity.onCreate().
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.v(TAG, "Fragment1 onCreate");
		super.onCreate(savedInstanceState);
	}

	/**
	 * 4. 4th callback
	 * what can we do here? return a view(group) to system that will connect it to it's container.
	 * System will call this when it's time to connect fragment's layout to activity's container
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		Log.v(TAG, "Fragment1 onCreateView");
		return inflater.inflate(R.layout.fragment1, container, false);
	}

	/**
	 *
	 */
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState){
		Log.v(TAG, "Fragment1 onViewCreated");
		super.onViewCreated(view,savedInstanceState);
	}

	/**
	 * 5. 5th callback. When system call activity.onStart, it will call it inside this function.
	 * what can we do here.
	 * This called means activity has finished the windows creation, we can process input controller here from now on.
	 */
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.v(TAG, "Fragment1 onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	/**
	 * 6. 6th callback. in activity.onStart()
	 */
	@Override
	public void onStart() {
		Log.v(TAG, "Fragment1 onStart");
		super.onStart();
	}

	/**
	 * 7. 7th callback. in activity.onResume(). Last callback when fragment is shown to user. Now, fragment is ready to work~~~
	 */
	@Override
	public void onResume() {
		Log.v(TAG, "Fragment1 onResume");
		super.onResume();
	}

	/**
	 * 8. 8th callback. after activity.onPause()
	 */
	@Override
	public void onPause() {
		Log.v(TAG, "Fragment1 onPause");
		super.onPause();
	}

	/**
	 * 9. 9th callback, fragment windows will disapear from screen.
	 */
	@Override
	public void onStop() {
		Log.v(TAG, "Fragment1 onStop");
		super.onStop();
	}

	/**
	 * 10. 10th callback
	 */
	@Override
	public void onDestroyView() {
		Log.v(TAG, "Fragment1 onDestroyView");
		super.onDestroyView();
	}

	/**
	 * 11. 11th callback
	 */
	@Override
	public void onDestroy() {
		Log.v(TAG, "Fragment1 onDestroy");
		super.onDestroy();
	}

	/**
	 * 12. 12th callback
	 */
	@Override
	public void onDetach() {
		Log.v(TAG, "Fragment1 onDetach");
		super.onDetach();
	}
}
