package com.example.gofdesignpattern;

import com.example.gofdesignpattern.singleton.Settings;
import org.springframework.boot.SpringApplication;
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
        Settings settings = Settings.getInstance();
        Settings settings1 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("strings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("strings.obj"))) {
            settings1 = (Settings) in.readObject();
        }

        System.out.println(settings1 == settings);
    }

}
