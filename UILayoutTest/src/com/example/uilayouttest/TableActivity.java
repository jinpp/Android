package com.example.uilayouttest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * 
 * @ClassName: TableActivity
 * @Description: TODO(TableLayout)
 * @author jinpp
 * @date 2016-11-17 ����8:53:21
 * 
 */
public class TableActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.talblelayout);
	}

}
