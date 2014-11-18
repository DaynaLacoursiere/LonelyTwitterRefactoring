package ca.ualberta.cs.lonelytwitter.manager;

import java.util.List;

import ca.ualberta.cs.lonelytwitter.data.LonelyTweet;

public interface TweetsManager {

	@SuppressWarnings("unchecked")
	public abstract List<LonelyTweet> loadTweets();

	public abstract void saveTweets(List<LonelyTweet> tweets);

}