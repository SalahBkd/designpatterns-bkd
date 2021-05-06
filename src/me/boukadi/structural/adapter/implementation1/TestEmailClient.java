package me.boukadi.structural.adapter.implementation1;


import me.boukadi.structural.adapter.implementation1.Gmail.GmailClient;

public class TestEmailClient {
    public static void main(String[] args) {
        EmailClient client = new EmailClient();
        client.addProvider(new GmailAdapter(new GmailClient()));
        client.downloadEmails();

    }
}
