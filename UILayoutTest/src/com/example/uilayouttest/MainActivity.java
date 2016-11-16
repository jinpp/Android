package com.example.uilayouttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * 
 * @ClassName: MainActivity
 * @Description: TODO(线性布局)
 * @author jinpp
 * @date 2016-11-16 下午2:12:03
 * 
 */
public class MainActivity extends Activity implements OnClickListener {
	private Button send;
	private EditText edit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.linearlayout);
		send = (Button) findViewById(R.id.button1);
		edit = (EditText) findViewById(R.id.inputmess);
		send.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			Intent intent=new Intent(MainActivity.this, RelativeActivity.class);
			startActivity(intent);
			/*String editcontent = edit.getText().toString();
			if (editcontent.length() > 0) {
				Toast.makeText(MainActivity.this, editcontent,
						Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(MainActivity.this, "hello jinpp",
						Toast.LENGTH_SHORT).show();
			}*/
			break;
		default:
			break;
		}

	}

}
