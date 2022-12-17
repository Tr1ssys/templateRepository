package org.alexanderrr;

public interface CoffeeTable {
     void typeOfCoffeeTable();
}

class ViktorianCoffeeTable implements CoffeeTable{

    @Override
    public void typeOfCoffeeTable() {
        System.out.println("Это викторианский кофейный столик");
    }
}

class ModernCoffeeTable implements CoffeeTable{

    @Override
    public void typeOfCoffeeTable() {
        System.out.println("Это модерн кофейный столик");
    }
}