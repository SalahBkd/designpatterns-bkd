package me.boukadi.behavioral.strategy.implementation1;

public class ChatClient {
    private Algorithm encryptionAlgorithm;

    public ChatClient(Algorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send() {
        encryptionAlgorithm.encrypt();
        System.out.println("Sending the encrypted message...");
    }
}
