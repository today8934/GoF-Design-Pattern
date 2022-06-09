package com.example.gofdesignpattern.factorymethod;

public class WhiteshipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
