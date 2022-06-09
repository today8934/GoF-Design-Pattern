package com.example.gofdesignpattern.singleton;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @DisplayName("SimpleSingleton Test")
    @Test
    void simpleSingletonTest() {
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();

        Assertions.assertEquals(simpleSingleton, simpleSingleton1);
    }

    @DisplayName("EagerInitializationSingleton Test")
    @Test
    void eagerInitializationSingletonTest() {
        EagerInitializationSingleton eagerInitializationSingleton = EagerInitializationSingleton.INSTANCE;
        EagerInitializationSingleton eagerInitializationSingleton1 = EagerInitializationSingleton.INSTANCE;

        Assertions.assertEquals(eagerInitializationSingleton, eagerInitializationSingleton1);
    }

    @Test
    void test() {
        Runnable singletonThread1 = new SingletonThread("1");
        Runnable singletonThread2 = new SingletonThread("2");
        Runnable singletonThread3 = new SingletonThread("3");
        Runnable singletonThread4 = new SingletonThread("4");
        Runnable singletonThread5 = new SingletonThread("5");
        Runnable singletonThread6 = new SingletonThread("6");
        Runnable singletonThread7 = new SingletonThread("7");
        Runnable singletonThread8 = new SingletonThread("8");

        Thread thread1 = new Thread(singletonThread1);
        Thread thread2 = new Thread(singletonThread2);
        Thread thread3 = new Thread(singletonThread3);
        Thread thread4 = new Thread(singletonThread4);
        Thread thread5 = new Thread(singletonThread5);
        Thread thread6 = new Thread(singletonThread6);
        Thread thread7 = new Thread(singletonThread7);
        Thread thread8 = new Thread(singletonThread8);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
    }
}
