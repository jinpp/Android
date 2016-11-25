package com.example.uilistviewtest;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 
 * @ClassName: FruitAdapter
 * @Description: TODO(������)
 * @author jinpp
 * @date 2016-11-21 ����1:22:54
 * 
 */
public class FruitAdapter extends ArrayAdapter<Fruit> {
	private int resourceId;

	public FruitAdapter(Context context, int resource, List<Fruit> objects) {
		super(context, resource, objects);
		this.resourceId = resource;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Fruit fruit = getItem(position);
		View view;
		ViewHolder viewHolder;
		// ����
		if (convertView == null) {
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
			viewHolder = new ViewHolder();
			viewHolder.fruitImage = (ImageView) view
					.findViewById(R.id.fruit_image);
			viewHolder.fruitName = (TextView) view
					.findViewById(R.id.fruit_name);
			// ImageView fruitimage = (ImageView)
			// view.findViewById(R.id.fruit_image);
			// TextView fruitname = (TextView)
			// view.findViewById(R.id.fruit_name);
			// fruitimage.setImageResource(fruit.getImageId());
			// fruitname.setText(fruit.getName());
			view.setTag(viewHolder);
		} else {
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();
		}

		viewHolder.fruitImage.setImageResource(fruit.getImageId());
		viewHolder.fruitName.setText(fruit.getName());
		return view;
	}

}
