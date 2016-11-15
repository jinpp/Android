package com.example.activitytest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

/**
 * 
 * @ClassName: ActivityCollector
 * @Description: TODO(������һ�仰��������������)
 * @author jinpp
 * @date 2016-11-15 ����10:06:37
 * 
 */
public class ActivityCollector {
	public static List<Activity> activities = new ArrayList<Activity>();

	public static void addActivity(Activity activity) {
		activities.add(activity);
	}

	public static void removeActivity(Activity activity) {
		activities.remove(activity);
	}

	public static void finishAll() {
		for (Activity activity : activities) {
			if (!activity.isFinishing()) {
				activity.finish();
			}
		}
	}
}