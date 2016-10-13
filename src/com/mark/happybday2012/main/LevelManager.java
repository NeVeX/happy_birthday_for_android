package com.mark.happybday2012.main;

import com.mark.happybday2012.main.control.Options;
import com.mark.happybday2012.main.music.MusicManager;
import com.mark.happybday2012.main.quiz.QandA;
import com.mark.happybday2012.main.screens.EndGameScreen;
import com.mark.happybday2012.main.screens.Settings;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LevelManager extends Activity {
	
	private int currentLevel;
	private static String logID = LevelManager.class.getName();
	private Boolean manualKillingActivity = false;
	private static int questionsWrongLimit = 3;
	private int questionsGottenWrong;
//	private Button answerButtonA, answerButtonB, answerButtonC, answerButtonD;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		Log.d(logID, "Activity Created. Setup of Initial Levels Beginning.");
        super.onCreate(savedInstanceState);
//        getButtonDefintions();
		Log.d(logID, "Now Loading Questions.");
        // Load the First level
        new QandA();
        this.currentLevel = -1;
        this.questionsGottenWrong = 0;
        Log.d(logID, "Setting up first level");
        showLevel();
    }
	
	private void setButtonsEnabled(boolean b) {
		Log.d(logID, "Answer Buttons are enabled? : "+ b);
		Button answerButtonA = (Button) findViewById(R.id.Answer1aButton);
		answerButtonA.setEnabled(true);
		Button answerButtonB = (Button) findViewById(R.id.Answer1bButton);
		answerButtonB.setEnabled(true);
		Button answerButtonC = (Button) findViewById(R.id.Answer1cButton);
		answerButtonC.setEnabled(true);
		Button answerButtonD = (Button) findViewById(R.id.Answer1dButton);
		answerButtonD.setEnabled(true);
	}

	@Override
	public void onStop() {
		super.onStop();
		if ( !manualKillingActivity ) {
			MusicManager.pauseAllMusic();
		}
	}
	
	@Override
	public void onDestroy()
	{
		super.onDestroy();
		if ( !manualKillingActivity ) {
			MusicManager.stopAllMusic();
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		MusicManager.resumeAllMusic();
		manualKillingActivity = false;
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		Log.d(logID, "Inflating the menu button options Menu.");
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.layout.control_menu, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Log.d(logID, "Menu Popup option selected.");
	    // Handle item selection
	    switch (item.getItemId()) {
	        case R.id.popupSettingsItem:
	        	Log.d(logID, "Menu Popup option selected is Settings.");
	    		Intent i = new Intent(getApplicationContext(), Settings.class);
	    		startActivity(i);
	    		manualKillingActivity = true;
	    		Log.d(logID, "Launched Settings Activity.");
	            return true;
	         default:
	         	return true;
	    }
	}
	
    @Override
    public void onBackPressed() {
    	Log.d(logID, "Back Button pressed on Phone.");
    	DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
		    public void onClick(DialogInterface dialog, int which) {
		        switch (which){
		        case DialogInterface.BUTTON_POSITIVE:
		        	Log.d(logID, "Positive Button Pressed. No action will be performed. Continues.");
		        	break;

		        case DialogInterface.BUTTON_NEGATIVE:
		        	// they wish to quit
		        	Log.d(logID, "Negative Button Pressed. Game will end.");
		        	LevelManager.this.gameOver();
		            break;
		        }
		    }
		};
		Log.d(logID, "Showing Back Button Popup Dialog.");
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		TextView messageToDisplay = new TextView(this);
		messageToDisplay.setGravity(Gravity.CENTER_HORIZONTAL);
		messageToDisplay.setText("Are You Sure You Want To Quit Adriana? (This will return to the main menu and all progress up to now, will be lost)");
		builder.setView(messageToDisplay)
		.setPositiveButton("MARKY - Let Me Keep Playing!", dialogClickListener)
		.setNegativeButton("MARKY - I'm Tired - Let Me Go Home!", dialogClickListener).show();
    }
	


	private void showLevel() {
		
		if ( Options.debugMode )
		{
			Log.d(logID, "Debug Mode: Ending game.");
			this.userCompletedGame();
			return;
		}
		
		
		this.currentLevel++; // go to next level
		Log.d(logID, "Setting up Level - " + this.currentLevel);
		if ( this.currentLevel > ( QandA.questionsList.length - 1) )
		{
			this.userCompletedGame();
		}
		else 
		{
			this.setContentView(R.layout.level);
			this.setupQuestionsAndAnswers();
			this.setInformationText();
			if ( this.currentLevel == ( QandA.questionsList.length - 1) )
			{
				// load special last level!
				this.setupLastLevel();
				
			}
		}
	}

	private void setupLastLevel() {
		// hide everything except button c.
		
		Button answerButtonA = (Button) findViewById(R.id.Answer1aButton);
		answerButtonA.setVisibility(View.GONE);
		Button answerButtonB = (Button) findViewById(R.id.Answer1bButton);
		answerButtonB.setVisibility(View.GONE);
//		Button answerButtonC = (Button) findViewById(R.id.Answer1cButton);
//		answerButtonC.setTextColor(R.color.markRed);
		Button answerButtonD = (Button) findViewById(R.id.Answer1dButton);
		answerButtonD.setVisibility(View.GONE);
		TextView debugText = (TextView) findViewById(R.id.TriesRemaining);
		debugText.setVisibility(View.GONE);
		
	}

	private void userCompletedGame() {
		// show the end of game text
		Log.d(logID, "User Completed the Game! Showing game end screen.");
		manualKillingActivity = true;
		// go to the main menu
		Intent i = new Intent(getApplicationContext(), EndGameScreen.class);
		startActivity(i);
		Log.d(logID, "Launched new EndGameScreen Activity. Destroying this activity.");
		this.finish();
	}

	private void showDialogBox(boolean isCorrect) {
		Log.d(logID, "Showing Dialog Box when answer selected. Selected answer is: " +isCorrect);
		DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
		    public void onClick(DialogInterface dialog, int which) {
		        switch (which){
		        case DialogInterface.BUTTON_POSITIVE:
		        	Log.d(logID, "Positive Button Pressed. Moving to next level.");
		        	LevelManager.this.showLevel();
		        	break;

		        case DialogInterface.BUTTON_NEGATIVE:
		        	Log.d(logID, "Negative Button Pressed. Exiting the game.");
		        	LevelManager.this.gameOver();
		            break;
		            
		        case DialogInterface.BUTTON_NEUTRAL:
		        	Log.d(logID, "Neutral Button Press. Player can continue with game.");
		        	LevelManager.this.setButtonsEnabled(true);
		            break;
		        }
		    }
		};
		Log.d(logID, "Showing the Incorrect/Correct Dialog Box.");
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		TextView messageToDisplay = new TextView(this);
		messageToDisplay.setGravity(Gravity.CENTER_HORIZONTAL);
		if (isCorrect) {  
			Log.d(logID, "Showing the Correct Dialog Box.");
			messageToDisplay.setText("Baby! Damn Girl! You Fine!");
			builder.setView(messageToDisplay)
			.setPositiveButton("I Rock!", dialogClickListener).show();
		}
		else { 
			Log.d(logID, "Showing the Incorrect Dialog Box.");
			// check if we incorrect answers if over allowed limit
			if ( this.questionsGottenWrong >= questionsWrongLimit ) 
			{
				Log.d(logID, "Too many wrong questions in this game! Exiting Game.");
				messageToDisplay.setText("Ah Heyeer....Leave It Out! Baby! What The Hell - SAVE ME!! :-(");
				builder.setView(messageToDisplay)
				.setNegativeButton("Feck This!", dialogClickListener).show();
			}
			else 
			{
				Log.d(logID, "Still Below limit of wrong answers");
				messageToDisplay.setText("Eek! Wrong Answer Babe! But You Have " + (questionsWrongLimit - this.questionsGottenWrong) + " Tries Remaining!");
				builder.setView(messageToDisplay)
				.setNeutralButton("MARKY!! I'm Coming Baby!!", dialogClickListener).show();
			}

		}

	}

	protected void gameOver() {
		Log.d(logID, "Ending the Game.");
		manualKillingActivity = true;
		// go to the main menu
		Intent i = new Intent(getApplicationContext(), MainMenu.class);
		startActivity(i);
		Log.d(logID, "Launched new MainMenu Activity. Destroying this activity.");
		this.finish();
	}

	private void setInformationText() {
		Log.d(logID, "Setting the debug information.");
		// TODO Auto-generated method stub
		TextView debugText = (TextView) findViewById(R.id.TriesRemaining);
		CharSequence text = "Attempts Remaining: " + (questionsWrongLimit - this.questionsGottenWrong);
		debugText.setText(text);
	}

	private void setupQuestionsAndAnswers() {
		Log.d(logID, "Setting up the Questions and Answers for the Views [Text/Buttons]");
		// set the question
		TextView questionView = (TextView) findViewById(R.id.QuestionText);
		CharSequence newQuestion = QandA.questionsList[this.currentLevel];
		questionView.setText(newQuestion);
		
		Button answerButtonA = (Button) findViewById(R.id.Answer1aButton);
		CharSequence newAnswerA = QandA.answersList[this.currentLevel][0];
		answerButtonA.setText(newAnswerA);
		answerButtonA.setEnabled(true);
		Button answerButtonB = (Button) findViewById(R.id.Answer1bButton);
		CharSequence newAnswerB = QandA.answersList[this.currentLevel][1];
		answerButtonB.setText(newAnswerB);
		answerButtonB.setEnabled(true);
		Button answerButtonC = (Button) findViewById(R.id.Answer1cButton);
		CharSequence newAnswerC = QandA.answersList[this.currentLevel][2];
		answerButtonC.setText(newAnswerC);
		answerButtonC.setEnabled(true);
		Button answerButtonD = (Button) findViewById(R.id.Answer1dButton);
		CharSequence newAnswerD = QandA.answersList[this.currentLevel][3];
		answerButtonD.setText(newAnswerD);
		answerButtonD.setEnabled(true);
		Log.d(logID, "Set up this level with regards to Questions and Anwsers Text and Behaviour.");

	}

	public void AnswerButton1aClicked(View v)
	{
		Log.d(logID, "Answer Button 1 - A Clicked");
		checkAnswer(QandA.answersList[this.currentLevel][0]);
	}

	public void AnswerButton1bClicked(View v)
	{
		Log.d(logID, "Answer Button 1 - B Clicked");
		checkAnswer(QandA.answersList[this.currentLevel][1]);
	}
	
	public void AnswerButton1cClicked(View v)
	{
		Log.d(logID, "Answer Button 1 - C Clicked");
		checkAnswer(QandA.answersList[this.currentLevel][2]);
	}
	
	public void AnswerButton1dClicked(View v)
	{
		Log.d(logID, "Answer Button 1 - D Clicked");
		checkAnswer(QandA.answersList[this.currentLevel][3]);
	}

	private void checkAnswer(CharSequence answerGiven) {
		this.setButtonsEnabled(false);
		Log.d(logID, "Checking the answer given from button selection.");
		// check the answer selected
		CharSequence correctAnswer = QandA.correctAnswer[this.currentLevel];
		if ( answerGiven.equals(correctAnswer))
		{
			Log.d(logID, "Answer [" + answerGiven + "] EQUALS correct answer [" + correctAnswer + "].");
			if ( Options.shouldShowCorrectAnswerDialogBox ) {
				this.showDialogBox(true);
			}
			else {
				this.showLevel();
			}
			
		}
		else 
		{
			this.questionsGottenWrong++;
			setInformationText();
			Log.d(logID, "Answer [" + answerGiven + "] DOES NOT EQUAL correct answer [" + correctAnswer + "].");
			this.showDialogBox(false);
		}
	}
}
