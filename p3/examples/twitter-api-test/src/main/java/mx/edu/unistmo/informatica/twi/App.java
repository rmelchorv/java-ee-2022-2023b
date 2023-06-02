package mx.edu.unistmo.informatica.twi;

import twitter4j.*;

public class App {
    public static void main(String[] args) throws TwitterException {
        var twitter = Twitter.newBuilder()
            .oAuthConsumer("xKoTnZomFI42Zr3n8UIpaTlfI",
                           "IXhvRIvV6gA6HorX2222ncolWfedlW1S8FrX2UgbPwvnLQKtdp")
            .oAuthAccessToken("79032852-23ltfLT4VTslUKDxTFWf9CDHejN3lCensTjO1rhNM",
                              "7BwhwNkQAdvLu6LnnFwTletdLqcFeVvqqiHCpYDsN5GjJ")
            .build();
        //twitter.v1().tweets().showStatus(0);
        twitter.v1().tweets().updateStatus("Hello Twitter API!");

        //OAuth 2.0 Client ID and Client Secret
        //Client ID         dFNwT01qYzVlWUcxbmltRUlBU3E6MTpjaQ
        //Clinet Secret     gUzHo64ATTHBIcsw2rPfY32AkqjTqnS53oCi8yYvH03eLi22pc
    }
}
