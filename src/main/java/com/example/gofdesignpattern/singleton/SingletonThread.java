package com.example.gofdesignpattern.singleton;

public class SingletonThread implements Runnable{

    public String s;

    public SingletonThread(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < 10000 ; i++) {

            try {
                System.out.println(SimpleSingleton.getInstance());
                System.out.println(s);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
