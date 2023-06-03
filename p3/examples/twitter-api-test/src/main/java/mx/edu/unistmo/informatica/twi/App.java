package mx.edu.unistmo.informatica.twi;

import java.util.List;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.v1.Status;
import twitter4j.v1.User;

public class App {
    public static void main(String[] args) throws TwitterException {
        Twitter twitter = Twitter.getInstance();

        User user = twitter.v1().users().verifyCredentials();

        System.out.println("Loged as: " + user.getScreenName());
        System.out.println("Username: " + user.getName());
        System.out.println("Access level: " + user.getAccessLevel().name());

        List<Status> statuses = twitter.v1().timelines().getHomeTimeline();

        System.out.println("Showing home timeline...");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ": " + status.getText());
        }
    }
}
