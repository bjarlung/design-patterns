package Structural.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(service.getTimeline("kjbds"));

        //TwitterService realService = (TwitterService)SecurityProxy.newInstance(new TwitterServiceImpl());
        //System.out.println(service.getTimeline("twitterNamn"));

        service.postToTimeline("twitterName",
                "Message that shouldn't go through");

    }
}

/*
Ladda ner bibliotek från
 http://twitter4j.org/en/index.html
\Downloads\twitter4j-4.0.7\lib
twitter4j-core-4.0.7.jar
lägg till i lib folder
+ lägg till i buildpath under project structure

Konto
dev.twitter.com
manage your apps
=> https://developer.twitter.com/en/apps
EJ KLART:
Register as a developer
Create app
=> Consumer key and secret
+ generate access token with secret
 */
