package com.example.gofdesignpattern.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton() {}

    /*
    가장 간단한 방법의 Thread-Safe 싱글톤.
    synchronized 키워드를 이용하여 동시에 하나의 스레드만 해당 메소드에 접근할 수 있게 된다.
    (하나의 스레드 접근 시 lock이 걸림)
    하지만 동시에 하나의 스레드만 접근이 가능하므로 성능에 이슈가 있을 수 있음.
     */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }
}

