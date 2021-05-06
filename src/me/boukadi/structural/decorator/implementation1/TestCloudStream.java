package me.boukadi.structural.decorator.implementation1;

public class TestCloudStream {
    public static void main(String[] args) {
        Stream stream = new EncryptedStream(new CloudStream());
        stream.write("some data to be stored....");
    }
}
