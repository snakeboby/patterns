package org.example;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class App {
    public static void main( String[] args ) throws NoSuchAlgorithmException {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);
        KeyPair pair = generator.generateKeyPair();
        List<StringData> list = new SecureList<>(new StringData(""), pair);

        list.add(new StringData("Hello"));
        list.add(new StringData("World"));

        for (var data : list) {
            System.out.println(data);
        }
    }
}
