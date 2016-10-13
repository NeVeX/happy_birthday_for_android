package com.mark.happybday2012.main.screens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.mark.happybday2012.main.LevelManager;
import com.mark.happybday2012.main.MainMenu;
import com.mark.happybday2012.main.R;

public class StartGameScreen extends ScreenManager {

	private static String logID = StartGameScreen.class.getName();
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_intro);      
		Log.d(logID, "Activity Created");
		super.shouldContinueMusic = false;
    }
	
	@Override
	public void onBackPressed() {
		super.shouldContinueMusic = true;
		Log.d(logID, "Returning To Main Menu");
		// go to the main menu
		Intent i = new Intent(getApplicationContext(), MainMenu.class);
		startActivity(i);
		Log.d(logID, "Launched new MainMenu Activity. Destroying this activity.");
		this.finish();
	}

	
	public void LevelIntroClick(View v)
	{
		Intent i = new Intent(getApplicationContext(), LevelManager.class);
		startActivity(i);
		super.shouldContinueMusic = true;
		Log.d(logID, "Launched LevelManager Activity. Destroying this activity.");
		this.finish();
	}

}
