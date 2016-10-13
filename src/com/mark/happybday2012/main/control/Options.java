package com.mark.happybday2012.main.control;

import com.mark.happybday2012.main.music.MusicManager;

import android.util.Log;

public class Options {
	private static String logID = Options.class.getName();
	public static Boolean shouldShowCorrectAnswerDialogBox = true;
	public static Boolean debugMode = false;
	private static Boolean canPlaySounds = true;
	
	public static Boolean getCanPlaySounds() {
		return canPlaySounds;
	}

	public static void setCanPlaySounds(Boolean allowedToPlay) {
		canPlaySounds = allowedToPlay;
		Log.d(logID, "canPlaySounds changed to: "+ canPlaySounds);
		if ( !canPlaySounds ) 
		{
			MusicManager.stopAllMusic(false);
		}
	}
	
}
