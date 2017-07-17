package twitterapp;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class JavaTweet {
	
	
	static String consumerKeyStr = "rPvmccEBSVYqoAQihNjyAl1na";
	static String consumerSecretStr = "rIIk9EZc4t5qBdtOtJV5h7ZEMw1xnjgwuSkXqB3pTObee3mf2i";
	static String accessTokenStr = "304334619-TfXPAGmQcPGEuvfDnfOzBXGKmCDnFm3tHTQLDsH7";
	static String accessTokenSecretStr = "1nQIIq5XDaCdjsSe9HDZNuBEnnM0yQ8CP8BSSCleUadI8";

	public static void main(String[] args) {

		try {
			Twitter twitter = new TwitterFactory().getInstance();

			twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
			AccessToken accessToken = new AccessToken(accessTokenStr,
					accessTokenSecretStr);

			twitter.setOAuthAccessToken(accessToken);

			twitter.updateStatus("Post using Twitter4J app ");
			

			System.out.println("Successfully updated the status in Twitter.");
		} catch (TwitterException te) {
			te.printStackTrace();
		}
	}
	
	

}
