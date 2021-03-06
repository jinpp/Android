package android.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.uicustomviews.R;

/**
 * 
 * @ClassName: TitleLayout
 * @Description: TODO(创建自定义控件)
 * @author jinpp
 * @date 2016-11-17 下午1:40:53
 * 
 */
public class TitleLayout extends LinearLayout implements OnClickListener {

	public TitleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.title, this);
		Button breturn = (Button) findViewById(R.id.rbutton);
		Button ereturn = (Button) findViewById(R.id.ebutton);
		breturn.setOnClickListener(this);
		ereturn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.rbutton:
			((Activity) getContext()).finish();
			break;
		case R.id.ebutton:
			Toast.makeText(getContext(), "提示", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
	}

}
