package org.alexanderrr;

public class Main {
    public static void main(String[] args) {
        Car sportCar = new Car.Builder().setChassis("sport").setBody("sport").setPaint("Red").setInterior("sport").build();
        Car ClassicCar = new Car.Builder().setChassis("old").setBody("classic").setPaint("white").setInterior("vintage").build();
    }
}