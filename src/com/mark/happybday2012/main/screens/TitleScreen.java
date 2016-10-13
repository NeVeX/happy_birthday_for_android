package com.mark.happybday2012.main.screens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.mark.happybday2012.main.MainMenu;
import com.mark.happybday2012.main.R;
import com.mark.happybday2012.main.R.id;
import com.mark.happybday2012.main.R.layout;
import com.mark.happybday2012.main.R.raw;
import com.mark.happybday2012.main.music.MusicManager;

public class TitleScreen extends Activity {

	private Handler timerHandle = new Handler();
	private static String logID = TitleScreen.class.getName();
	private Boolean buttonClicked;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);
        Log.d(logID, "Activity Created.");
        MusicManager.play(this, R.raw.marx_intro, false);
        // Post delay the helper text showing on screen
		timerHandle.postDelayed(updateTitleHelpText, 5000);
		this.buttonClicked = false;
    }
	
	private Runnable updateTitleHelpText = new Runnable() {
		public void run() {
			if ( !buttonClicked ) 
			{
				TextView im = (TextView) findViewById(R.id.titleImageText);
				im.setText(R.string.TitleImageText);
				Log.d(logID, "Showing Help Text on Title Screen");
			}
		}
	};
	
	public void TitleImageClicked(View v) throws InterruptedException {
		this.buttonClicked = true;
		Thread.sleep(1000); // bad hack
		Log.d(logID, "TitleImage Clicked.");
		Intent i = new Intent(getApplicationContext(), MainMenu.class);
		startActivity(i);
		
		Log.d(logID, "MainMenu Activity Start Sent.");
	}
	
	
}