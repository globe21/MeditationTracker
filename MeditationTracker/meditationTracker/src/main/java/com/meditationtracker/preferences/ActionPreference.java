package com.meditationtracker.preferences;

import com.meditationtracker.R;
import com.meditationtracker.R.styleable;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;
import android.widget.Toast;

public class ActionPreference extends Preference {
	public interface IActor {
		void act(Preference preference, String param);
	}

	private final String actorClass;
	private final String actionParam;
	
	public ActionPreference(Context context, AttributeSet attrs) {
		super(context, attrs);

		TypedArray a=getContext().obtainStyledAttributes(attrs, styleable.Attributes);
		actorClass = a.getString(styleable.Attributes_actor);
		actionParam = a.getString(styleable.Attributes_param);
	}

	@Override
	protected void onClick() {
		try {
			Class<?> actor = Class.forName(actorClass);
			Object newInstance = actor.getConstructor((Class[])null).newInstance((Object[])null);
			
			((IActor)newInstance).act(this, actionParam);
		} catch (Exception e) {
			Toast.makeText(getContext(), "Failed acting with class " + actorClass + "\n"+e, Toast.LENGTH_LONG).show();
		} 	}

	
}
