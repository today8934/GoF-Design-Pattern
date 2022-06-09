package com.example.gofdesignpattern.singleton;

public class SimpleSingleton implements Singleton{
    private static SimpleSingleton instance;
    private SimpleSingleton() {}

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }

        return instance;
    }
}
