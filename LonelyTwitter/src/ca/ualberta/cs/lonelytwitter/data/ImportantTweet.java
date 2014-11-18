package ca.ualberta.cs.lonelytwitter.data;

import java.util.Date;


import android.util.Log;

public class ImportantTweet extends LonelyTweet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ImportantTweet() {
		
	}

	public ImportantTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}
	
	public boolean isValid() {
		//must be implemented in all subclasses
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	public String getTweetBody() {
		return "IMPORTANT: "+ tweetBody;
	}

	@Override
	public String toString() {
		String imp_tweet = "IMPORTANT: " + getTweetDate() + " | " + getTweetBody();
		Log.i("MyTag", imp_tweet);
		return imp_tweet;
	}
}
