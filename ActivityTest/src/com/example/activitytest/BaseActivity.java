package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

/**
 * 
 * @ClassName: BaseActivity
 * @Description: TODO(������һ�仰��������������)
 * @author jinpp
 * @date 2016-11-15 ����9:20:29
 * 
 */
public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		ActivityCollector.addActivity(this);
		Log.d("BaseActivity", getClass().getSimpleName());
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		ActivityCollector.removeActivity(this);
	}

}
