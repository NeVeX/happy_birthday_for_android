package com.mark.happybday2012.main.screens;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.mark.happybday2012.main.LevelManager;
import com.mark.happybday2012.main.MainMenu;
import com.mark.happybday2012.main.R;

public class EndGameScreen extends ScreenManager {

	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_end);      
		Log.d(logID, "Activity Created");
		super.shouldContinueMusic = false;
    }

	
	public void EndGameButtonClick(View v)
	{
		Log.d(logID, "End Game Button Clicked");
		this.returnToMainMenu();
	}
	
	@Override
	public void onBackPressed() {
//		this.returnToMainMenu();
		// do nothing
	}

	private void returnToMainMenu()
	{
		super.shouldContinueMusic = true;
		Log.d(logID, "Returning To Main Menu");
		// go to the main menu
		Intent i = new Intent(getApplicationContext(), MainMenu.class);
		startActivity(i);
		Log.d(logID, "Launched new MainMenu Activity. Destroying this activity.");
		this.finish();
	}
	
	
}
