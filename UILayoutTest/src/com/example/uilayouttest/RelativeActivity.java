package com.example.uilayouttest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * 
 * @ClassName: RelativeActivity
 * @Description: TODO(相对布局)
 * @author jinpp
 * @date 2016-11-16 下午3:41:49
 * 
 */
public class RelativeActivity extends Activity implements OnClickListener {
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.relativelayout);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);

	}

	// TODO jinpp 点击按钮时触发的事件
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		AlertDialog.Builder alertdialog = new AlertDialog.Builder(
				RelativeActivity.this);
		switch (v.getId()) {
		case R.id.button1:
			Toast.makeText(RelativeActivity.this, "hi,我在左上方啊。",
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.button2:
			Toast.makeText(RelativeActivity.this, "hi,我在右上方啊。",
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.button3:
			Intent intent = new Intent(RelativeActivity.this,
					TableActivity.class);
			startActivity(intent);
			/*
			 * alertdialog.setTitle("hi"); alertdialog.setMessage("huhu");
			 * alertdialog.setCancelable(true);
			 * alertdialog.setPositiveButton("OK", new
			 * DialogInterface.OnClickListener() {
			 * 
			 * @Override public void onClick(DialogInterface dialog, int which)
			 * { // TODO Auto-generated method stub
			 * 
			 * } }); alertdialog.setNegativeButton("Cancel", new
			 * DialogInterface.OnClickListener() {
			 * 
			 * @Override public void onClick(DialogInterface dialog, int which)
			 * { // TODO Auto-generated method stub
			 * 
			 * } });
			 * 
			 * alertdialog.show();
			 */
			break;

		case R.id.button4:
			Toast.makeText(RelativeActivity.this, "hi,我在左下方啊。",
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.button5:
			Toast.makeText(RelativeActivity.this, "hi,我在右下方啊。",
					Toast.LENGTH_SHORT).show();
			break;
		default:
			break;

		}
	}
}
