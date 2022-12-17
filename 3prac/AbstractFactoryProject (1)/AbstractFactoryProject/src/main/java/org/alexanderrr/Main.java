package org.alexanderrr;

public class Main {
    public static void main(String[] args) {
       Test test = new Test();
       test.factoryTest("Viktorian");
       test.factoryTest("Modern");
    }
}
class Test{
    void factoryTest(String type){
       Factory factory = new AbstractFactory().createFactory(type);
       Sofa sofa = factory.createSofa();
       Chair chair = factory.createChair();
       CoffeeTable coffeeTable = factory.createCoffeeTable();
       sofa.typeOfSofa();
       chair.typeOfChair();
       coffeeTable.typeOfCoffeeTable();
    }
}
