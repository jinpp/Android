package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

/**
 * 
 * @ClassName: SecondActivity
 * @Description: TODO(�ڶ����)
 * @author jinpp
 * @date 2016-10-25 ����1:58:52
 * 
 */
public class SecondActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		/*
		 * Intent intent=getIntent(); String
		 * data=intent.getStringExtra("Extra_data"); Log.d("data", data);
		 */
		Button button2 = (Button) findViewById(R.id.button_2);
		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Intent intent = new Intent();
				// intent.putExtra("data_return", "���������һ��activity");
				// setResult(RESULT_OK, intent);
				// finish();
				Intent intent = new Intent(SecondActivity.this,
						ThirdActivity.class);
				startActivity(intent);
			}
		});

	}

	@Override
	public void onBackPressed() {
		// ��Żؼ���ʱ�����Ķ���
		Intent intent = new Intent();
		intent.putExtra("data_return", "���������һ��activity");
		setResult(RESULT_OK, intent);
		finish();

	}

}