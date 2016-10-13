package com.mark.happybday2012.main.screens;

import android.app.Activity;
import android.util.Log;

import com.mark.happybday2012.main.music.MusicManager;

public class ScreenManager extends Activity {

	protected Boolean shouldContinueMusic;
	static String logID = ScreenManager.class.getName();
	
	@Override
	public void onBackPressed() {
		shouldContinueMusic = true;
		this.finish();
	}
	
	@Override
	public void onResume() {
		Log.d(logID, "Resuming Music");
		super.onResume();
		MusicManager.resumeAllMusic();
		shouldContinueMusic = false;
	}
	
	@Override
	public void onStop() {
		super.onStop();
		if ( !shouldContinueMusic ) {
			MusicManager.pauseAllMusic();
		}
	}
	
}
