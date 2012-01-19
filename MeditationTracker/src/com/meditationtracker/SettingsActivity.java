package com.meditationtracker;

import com.meditationtracker.sync.backup.BackupManagerWrapper;

import android.preference.PreferenceActivity;
import android.os.Bundle;

public class SettingsActivity extends PreferenceActivity
{

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
	    addPreferencesFromResource(R.xml.preferences);
	}

	@Override
	public void onPause() {
		super.onPause();
		new BackupManagerWrapper(this).dataChanged();
	}
}
