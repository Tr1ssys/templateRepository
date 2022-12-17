package org.alexanderrr;

public class Main {
    public static void main(String[] args) {
        Car tesla = new Tesla();
        Car bmw = new BmwX6();
        tesla.startDriving();
        bmw.startDriving();
        tesla.setDrivable(new RearWheelDrive());
        tesla.startDriving();
    }
}