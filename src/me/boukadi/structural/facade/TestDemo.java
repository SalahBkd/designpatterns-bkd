package me.boukadi.structural.facade;

public class TestDemo {
    public static void main(String[] args) {
        var demo = new TwitterAPI("appKey", "secret");
        var tweets = demo.getRecendTweets();
    }
}
