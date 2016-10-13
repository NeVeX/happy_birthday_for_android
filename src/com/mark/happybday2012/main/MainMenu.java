package com.mark.happybday2012.main;

import com.mark.happybday2012.main.music.MusicManager;
import com.mark.happybday2012.main.screens.AboutScreen;
import com.mark.happybday2012.main.screens.Settings;
import com.mark.happybday2012.main.screens.StartGameScreen;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class MainMenu extends Activity {

	private static String logID = MainMenu.class.getName();
	private static Boolean shouldContinueMusic = false;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        playMainMenuMusic();
		Log.d(logID, "Activity Created");
    }
	
	private void playMainMenuMusic() {
		MusicManager.play(this, R.raw.music, true);
	}

	@Override
    public void onBackPressed() {
		Log.d(logID, "Back Button pressed on Phone.");
    	DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
		    public void onClick(DialogInterface dialog, int which) {
		        switch (which){
		        case DialogInterface.BUTTON_POSITIVE:
		        	Log.d(logID, "Positive Button Pressed. Application will end.");
		        	MusicManager.pauseAllMusic();
		    		MainMenu.this.finish();
		        	break;
		        case DialogInterface.BUTTON_NEGATIVE:
		        	// she wishes to quit
		        	Log.d(logID, "Negative Button Pressed. No action will be performed. Application continues.");
		            break;
		        }
		    }
		};
		Log.d(logID, "Showing Back Button Popup Dialog for application exit.");
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		TextView messageToDisplay = new TextView(this);
		messageToDisplay.setGravity(Gravity.CENTER_HORIZONTAL);
		messageToDisplay.setText("Are You Sure You Wish To Quit Babe?");
		builder.setView(messageToDisplay)
		.setPositiveButton("(High Pitched) Yeah!!!", dialogClickListener)
		.setNegativeButton("(Annoyed Tone) Noooo....", dialogClickListener).show();
    }
	
	@Override
	public void onStop() {
		Log.d(logID, "Pausing Music");
		super.onStop();
		if ( !shouldContinueMusic ) 
		{
			MusicManager.pauseAllMusic();
		}
	}
	
	@Override
	public void onDestroy()
	{
		Log.d(logID, "Activity is being destroyed. Stopping Music.");
		super.onDestroy();
		if ( !shouldContinueMusic ) {
			MusicManager.stopAllMusic();
		}
	}
	
	@Override
	public void onResume() {
		Log.d(logID, "Resuming Music");
		super.onResume();
		playMainMenuMusic();
		shouldContinueMusic = false;
	}
	
	public void SettingsButtonClick(View v)
	{
		Log.d(logID, "Settings Button Click");
		Intent i = new Intent(getApplicationContext(), Settings.class);
		startActivity(i);
		shouldContinueMusic = true;
		Log.d(logID, "Launched Settings Activity.");
	}

	
	public void BeginButtonClick(View v)
	{
		Log.d(logID, "Begin Button Click");
		Intent i = new Intent(getApplicationContext(), StartGameScreen.class);
		startActivity(i);
		shouldContinueMusic = true;
		Log.d(logID, "Launched LevelManager Activity. Destroying this activity.");
		this.finish();
	}
	
	public void AboutButtonClick(View v)
	{
		Log.d(logID, "About Button Click");
		Intent i = new Intent(getApplicationContext(), AboutScreen.class);
		startActivity(i);
		shouldContinueMusic = true;
		Log.d(logID, "Launched About Activity.");
	}
	
}
