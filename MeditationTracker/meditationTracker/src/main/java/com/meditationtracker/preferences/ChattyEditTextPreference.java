package com.meditationtracker.preferences;

import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChattyEditTextPreference extends EditTextPreference {

	public ChattyEditTextPreference(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	@Override
	protected View onCreateView(ViewGroup parent)
	{
		updateChattySummary();
		return super.onCreateView(parent);
	}

	@Override
	protected void onDialogClosed(boolean positiveResult) {
		super.onDialogClosed(positiveResult);
		updateChattySummary();
	}

	protected void updateChattySummary() {
		setSummary(getChattySummary());
	}

	protected CharSequence getChattySummary() {
		return getText();
	}
}
