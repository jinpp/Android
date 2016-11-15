package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * 
 * @ClassName: FirstActivity
 * @Description: TODO(主界面活动)
 * @author jinpp
 * @date 2016-10-25 上午10:41:19
 * 
 */
public class FirstActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// TODO jinpp 不在活动中显示标题栏
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
		Log.d("data", "看不到看不到看不到。");
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO jinpp 点击按钮时做的动作
				// Toast.makeText(FirstActivity.this, "你点击了按钮额。",
				// Toast.LENGTH_SHORT).show();
				// 点击按钮销毁 活动和返回的效果一样
				// finish();
				// 点击button1打开button2，显示intent
				// Intent intent = new Intent(FirstActivity.this,
				// SecondActivity.class);
				// startActivity(intent);
				// intent 隐式
				// Intent intent =new
				// Intent("com.example.activitytest.ACTION_START");
				// intent.addCategory("com.example.activitytest.MY_CATEGORY");
				// startActivity(intent);
				/*
				 * Intent intent =new Intent(Intent.ACTION_VIEW); //
				 * intent.setData(Uri.parse("http://www.baidu.com/"));
				 * intent.setData(Uri.parse("tel:10010"));
				 * startActivity(intent);
				 */
				Intent intent = new Intent(FirstActivity.this,
						SecondActivity.class);
				startActivity(intent);
				/*
				 * String data = "啦啦啦"; intent.putExtra("Extra_data", data);
				 * startActivity(intent);
				 */
				/*startActivityForResult(intent, 1);
*/
			}
		});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		switch (requestCode) {
		case 1:
			if (resultCode == RESULT_OK) {
				String resultdata = data.getStringExtra("data_return");
				Log.d("data2", resultdata);
			}
			break;
		default:
		}
		// TODO Auto-generated method stub
//		super.onActivityResult(requestCode, resultCode, data);
	}

	/**
	 * 显示菜单项
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO jinpp 菜单项
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/**
	 * 选中菜单项的动作
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO jinpp 菜单项选择
		switch (item.getItemId()) {
		case R.id.add_item:
			Toast.makeText(this, "你点击了新增。", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this, "你点击了删除。", Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
	}
}
