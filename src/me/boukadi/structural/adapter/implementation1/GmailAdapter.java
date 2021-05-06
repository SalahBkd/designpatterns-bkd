package me.boukadi.structural.adapter.implementation1;


import me.boukadi.structural.adapter.implementation1.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient gmailClient;

    public GmailAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
