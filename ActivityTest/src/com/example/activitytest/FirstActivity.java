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
 * @Description: TODO(������)
 * @author jinpp
 * @date 2016-10-25 ����10:41:19
 * 
 */
public class FirstActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// TODO jinpp ���ڻ����ʾ������
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
		Log.d("data", "��������������������");
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO jinpp �����ťʱ���Ķ���
				// Toast.makeText(FirstActivity.this, "�����˰�ť�",
				// Toast.LENGTH_SHORT).show();
				// �����ť���� ��ͷ��ص�Ч��һ��
				// finish();
				// ���button1��button2����ʾintent
				// Intent intent = new Intent(FirstActivity.this,
				// SecondActivity.class);
				// startActivity(intent);
				// intent ��ʽ
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
				 * String data = "������"; intent.putExtra("Extra_data", data);
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
	 * ��ʾ�˵���
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO jinpp �˵���
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/**
	 * ѡ�в˵���Ķ���
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO jinpp �˵���ѡ��
		switch (item.getItemId()) {
		case R.id.add_item:
			Toast.makeText(this, "������������", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this, "������ɾ����", Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
	}
}