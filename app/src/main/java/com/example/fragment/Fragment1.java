package com.example.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentdemo.R;

public class Fragment1 extends Fragment {

	private static final String TAG = "FragmentDemo";

	public interface OnArticleSelectedListener {
		public void onArticleSelected(int result);
	}

	@Override
	public void onAttach(Activity activity) {
		Log.v(TAG, "Fragment1 onAttach");
		Bundle args = getArguments();
		if (null != args) {
			/*
			 * 在这里我们可以将从Acivity收到的数据保存起来，并且显示到Fragment当中。
			 */
			Log.d(TAG,
					"Fragment1 Get data from activity "
							+ args.getString("hello"));
		}
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.v(TAG, "Fragment1 onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onDestroy() {
		Log.v(TAG, "Fragment1 onDestroy");
		super.onDestroy();
	}

	@Override
	public void onResume() {
		Log.v(TAG, "Fragment1 onResume");
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.v(TAG, "Fragment1 onStart");
		super.onStart();
	}

	@Override
	public void onDetach() {
		Log.v(TAG, "Fragment1 onDetach");
		super.onDetach();
	}

	@Override
	public void onPause() {
		Log.v(TAG, "Fragment1 onPause");
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.v(TAG, "Fragment1 onStop");
		super.onStop();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.v(TAG, "Fragment1 onCreateView");
		return inflater.inflate(R.layout.fragment1, container, false);
	}

	@Override
	public void onDestroyView() {
		Log.v(TAG, "Fragment1 onDestroyView");
		super.onDestroyView();
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.v(TAG, "Fragment1 onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

}
