package com.example.gofdesignpattern;

import com.example.gofdesignpattern.singleton.EnumSingleton;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class GofDesignPatternApplication {

    /*
    직렬화 & 역직렬화를 이용해 싱글톤 깨기
    직렬화하여 파일로 저장 후 다시 역직렬화하여 읽어들일 때, 다시 객체를 생성하므로 동등비교 시 false가 나온다
     */
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        Constructor<EnumSingleton> constructor = EnumSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        EnumSingleton enumSingleton1 = constructor.newInstance();

        System.out.println(enumSingleton1 == enumSingleton);
    }

}
