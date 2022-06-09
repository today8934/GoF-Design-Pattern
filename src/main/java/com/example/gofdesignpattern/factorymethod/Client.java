package com.example.gofdesignpattern.factorymethod;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = new WhiteshipFactory().orderShip("Whiteship", "today8934@gmail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackshipFactory().orderShip("Blackship", "today8934@mgail.com");
        System.out.println(blackship);
    }
}
