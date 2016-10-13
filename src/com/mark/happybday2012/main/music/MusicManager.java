package com.mark.happybday2012.main.music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.mark.happybday2012.main.control.Options;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

public class MusicManager {
		
	public static HashMap<Integer, MediaPlayer> mediaCollection = new HashMap<Integer, MediaPlayer>();
	private static ArrayList<MediaPlayer> resumedMediaCollection = new ArrayList<MediaPlayer>();

	private static String logID = MusicManager.class.getName();
	
	


	public static void stopAllMusic() {
		stopAllMusic(false);
	}
	
	public static void pauseAllMusic() {
		stopAllMusic(true);
	}
	
	public static void resumeAllMusic() {
		Log.d(logID, "Resuming all music if possible.");
		Iterator<MediaPlayer> i = resumedMediaCollection.iterator();
		while( i.hasNext() ) 
		{
			MediaPlayer m = i.next();
			if ( !m.isPlaying() ) { m.start(); }
		}
		Log.d(logID, "Resumed all valid music.");
		resumedMediaCollection.clear();
	}
	
	public static void stopAllMusic(Boolean shouldPause) {
		Log.d(logID, "Stopping/Pausing All Music.....Pausing -> " + shouldPause);
		Iterator<MediaPlayer> it = mediaCollection.values().iterator();
		while (it.hasNext())
		{
			MediaPlayer savedMedia = it.next();
			if ( savedMedia != null ) 
			{
				if ( shouldPause && savedMedia.isPlaying()) 
				{ 
					savedMedia.pause(); 
					Log.d(logID, "Saving this media object to be Resumed if needed later.");
					resumedMediaCollection.add(savedMedia);
				}
				else { 
					savedMedia.stop();
					resumedMediaCollection.remove(savedMedia);
				}
			}
		}
		if ( !shouldPause) { mediaCollection.clear(); }
		Log.d(logID, "Stopped/Paused All Music.");
	}

	public static void play(Context context, int musicID, boolean shouldLoop) {
		Log.d(logID, "Attempting to Play sound - " + musicID);
		MediaPlayer media = doesMediaExistAlready(musicID);
		if ( media == null )
		{
			Log.d(logID, "Creating new Meida Object to play sound " +musicID);
			// media doesn't exist, create it
			media = MediaPlayer.create(context, musicID);
		}

		if ( Options.getCanPlaySounds() && !media.isPlaying()) 
		{
			Log.d(logID, "Playing the sound....");
			// start playback
			media.start();
			media.setLooping(shouldLoop);
			Log.d(logID, "Adding this Media Object to collection for later retrieval.");
			mediaCollection.put(musicID, media);
		}
		else 
		{
			Log.d(logID, "Did not play sound because canPlaySounds is " + Options.getCanPlaySounds() + " and isPlaying is " + media.isPlaying());
		}
	}

	private static MediaPlayer doesMediaExistAlready(int musicID) {
		Log.d(logID, "Checking if sound exists already.");
		Iterator<Integer> it = mediaCollection.keySet().iterator();
		while (it.hasNext())
		{
			if ( musicID == it.next() ) 
			{
				// music already played before
				// is it playing though
				Log.d(logID, "Found sound in music collection: " +musicID+". Returning this object for further use.");
				return mediaCollection.get(musicID);
			}
		}
		Log.d(logID, "Sound does not exist already. Returning null.");
		return null;
	}
}
