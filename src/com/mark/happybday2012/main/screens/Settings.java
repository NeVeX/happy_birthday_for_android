package com.mark.happybday2012.main.screens;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

import com.mark.happybday2012.main.R;
import com.mark.happybday2012.main.control.Options;
import com.mark.happybday2012.main.music.MusicManager;

public class Settings extends Activity {

	private static String logID = Settings.class.getName();
	private static Boolean continueMusic;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);      
		setUpSettingsOptions();
		Log.d(logID, "Activity Created");
		continueMusic = false;
    }

	private void setUpSettingsOptions() {
		CheckBox cb = (CheckBox) findViewById(R.id.soundOnOffCheckBox);
		cb.setChecked(Options.getCanPlaySounds());
		CheckBox cbOpt = (CheckBox) findViewById(R.id.correctAnswerDialogBoxCheckBox);
		cbOpt.setChecked(Options.shouldShowCorrectAnswerDialogBox);
//		CheckBox debugCB = (CheckBox) findViewById(R.id.debugModeCheckBox);
//		debugCB.setChecked(Options.debugMode);
	}

	public void soundOnOffCheckBoxClicked(View v) 
	{
		Log.d(logID, "Sound Check Box On/Off Selected.");
		CheckBox cb = (CheckBox) findViewById(R.id.soundOnOffCheckBox);
		Options.setCanPlaySounds(cb.isChecked());
	}
	
	@Override
	public void onBackPressed() {
		continueMusic = true;
		this.finish();
	}
	
	public void shouldShowCorrectAnswerDialogBoxClick(View v)
	{
		CheckBox cb = (CheckBox) findViewById(R.id.correctAnswerDialogBoxCheckBox);
		Options.shouldShowCorrectAnswerDialogBox = cb.isChecked();
		
	}
	public void debugModeCheckBoxClick(View v)
	{
//		CheckBox cb = (CheckBox) findViewById(R.id.debugModeCheckBox);
//		Options.debugMode = cb.isChecked();
		
	}
	
	@Override
	public void onResume() {
		Log.d(logID, "Resuming Music");
		super.onResume();
		MusicManager.resumeAllMusic();
		continueMusic = false;
	}
	
	@Override
	public void onStop() {
		super.onStop();
		if ( !continueMusic ) {
			MusicManager.pauseAllMusic();
		}
	}
	
}
