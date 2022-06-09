package com.example.gofdesignpattern.singleton;

public class EagerInitializationSingleton {

    public static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {}

    /*
    이른 초기화(Eager Initialization)
    미리 만들어 놓는다는 것 자체가 단점이 될 수 있다.(만들어놓고 안쓸 수 있음. 리소스 낭비)
     */
    public static EagerInitializationSingleton getInstance() {
        return INSTANCE;
    }

}
