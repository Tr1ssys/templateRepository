package org.alexanderrr;

    interface Factory {
     Chair createChair();
     CoffeeTable createCoffeeTable();
     Sofa createSofa();
}

class ViktorianFactory implements Factory{

    @Override
    public Chair createChair() {
        return new ViktorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ViktorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ViktorianSofa();
    }
}

class ModernFactory implements Factory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}