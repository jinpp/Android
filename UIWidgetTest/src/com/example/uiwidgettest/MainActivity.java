package com.example.uiwidgettest;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

/**
 * 
 * @ClassName: MainActivity
 * @Description: TODO(常见控件的使用)
 * @author jinpp
 * @date 2016-11-16 下午2:09:33
 * 
 */
public class MainActivity extends Activity implements OnClickListener {
	private Button button;
	private EditText edittext;
	private ImageView imageview;
	private ProgressBar progressbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		button = (Button) findViewById(R.id.button1);
		edittext = (EditText) findViewById(R.id.edittext);
		imageview = (ImageView) findViewById(R.id.imageview);
		progressbar = (ProgressBar) findViewById(R.id.progressbar);
		button.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			ProgressDialog progressdialog = new ProgressDialog(
					MainActivity.this);
			progressdialog.setTitle("This is a progressdialog");
			progressdialog.setMessage("hehehehe");
			progressdialog.setCancelable(true);
			progressdialog.show();
			// AlertDialog.Builder dialog = new AlertDialog.Builder(
			// MainActivity.this);
			// dialog.setTitle("This is a Dialog!");
			// dialog.setMessage("This is an important message!");
			// // dialog.setCancelable(false);
			// dialog.setNegativeButton("OK",
			// new DialogInterface.OnClickListener() {
			//
			// @Override
			// public void onClick(DialogInterface dialog, int which) {
			// // TODO Auto-generated method stub
			//
			// }
			// });
			// dialog.setPositiveButton("Cancel",
			// new DialogInterface.OnClickListener() {
			//
			// @Override
			// public void onClick(DialogInterface dialog, int which) {
			// // TODO Auto-generated method stub
			//
			// }
			// });
			// dialog.show();
			/*
			 * int progress=progressbar.getProgress(); progress=progress+10;
			 * progressbar.setProgress(progress);
			 */
			// if(progressbar.getVisibility()==View.GONE){
			// progressbar.setVisibility(View.VISIBLE);
			// }else{
			// progressbar.setVisibility(View.GONE);
			// }
			/*
			 * imageview.setImageResource(R.drawable.myphone); String inputtext
			 * = edittext.getText().toString(); if (inputtext.length() > 0) {
			 * Toast.makeText(MainActivity.this, inputtext, Toast.LENGTH_SHORT)
			 * .show(); }
			 */
			break;
		default:
			break;
		}
	}
}
