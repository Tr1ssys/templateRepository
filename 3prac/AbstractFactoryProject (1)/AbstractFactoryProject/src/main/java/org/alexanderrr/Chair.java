package org.alexanderrr;

public interface Chair {
     void typeOfChair();
}

class ViktorianChair implements Chair{

    @Override
    public void typeOfChair() {
        System.out.println("Это викторианский стул");
    }
}

class ModernChair implements Chair{

    @Override
    public void typeOfChair() {
        System.out.println("Это модерн стул");
    }
}