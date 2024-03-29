package mx.edu.unistmo.informatica.twi.p3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.api.TwitterApi;
import com.twitter.clientlib.model.*;

/*
 * Sample code to demonstrate the use of the v2 User Tweet timeline endpoint
 * */
public class TwitterApiExample {
  public static void main(String[] args) {
    /**
     * Set the credentials for the required APIs.
     * The Java SDK supports TwitterCredentialsOAuth2 & TwitterCredentialsBearer.
     * Check the 'security' tag of the required APIs in https://api.twitter.com/2/openapi.json in order
     * to use the right credential object.
     */
    TwitterApi apiInstance = new TwitterApi(new TwitterCredentialsOAuth2(
          System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
          System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
          System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
          System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN")));

    Set<String> tweetFields = new HashSet<>();
    tweetFields.add("author_id");
    tweetFields.add("id");
    tweetFields.add("created_at");

    try {
      // findTweetById
      Get2TweetsIdResponse result = apiInstance.tweets().findTweetById("20")
        .tweetFields(tweetFields)
        .execute();
      List<Problem> errors = result.getErrors();

      if(errors == null || errors.size() <= 0) {
        System.out.println("findTweetById - Tweet Text: " + result.toString());
      } else {
        System.out.println("Error:");

        errors.forEach(e -> {
          System.out.println(e.toString());
          if (e instanceof ResourceUnauthorizedProblem) {
            System.out.println(((ResourceUnauthorizedProblem) e).getTitle() + " " + ((ResourceUnauthorizedProblem) e).getDetail());
          }
        });
      }
    } catch (ApiException e) {
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
