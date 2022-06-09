package com.example.gofdesignpattern.singleton;

public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {}

    /*
    double checked locking
    메서드에 접근하는 모든 스레드에 대해 synchronized가 걸리는게 아니라
    if문 안에서 동기화에 걸리기 때문에 메서드에 synchronized 키워드를 붙이는 것보다 성능적으로 우위에 있을 수 있다.
    (메서드에서부터 동기화에 걸리는것이 아니라 첫번째 if문에서 instance가 null일 경우 바로 instance를 리턴해버리기때문에)
    인스턴스를 필요한 시점에 만들 수 있음.
    jdk 1.5부터 동작한다.

     */

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return instance;
    }
}
