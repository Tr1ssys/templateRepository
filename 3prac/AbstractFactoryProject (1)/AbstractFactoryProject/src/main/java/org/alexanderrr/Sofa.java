package org.alexanderrr;

public interface Sofa {
     void typeOfSofa();
}

class ViktorianSofa implements Sofa{

    @Override
    public void typeOfSofa() {
        System.out.println("Это викторианский диван");
    }
}

class ModernSofa implements Sofa{

    @Override
    public void typeOfSofa() {
        System.out.println("Это модерн диван");
    }
}