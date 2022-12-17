package org.alexanderrr;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(new TheVisitor());
        animal = new Cat();
        animal.makeSound(new TheVisitor());
    }
}

interface Animal {
    void makeSound(Visitor visitor);
    }
class Dog implements Animal{

    @Override
    public void makeSound(Visitor visitor) {
        visitor.doDog();
    }
}

class Cat implements Animal{

    @Override
    public void makeSound(Visitor visitor) {
        visitor.doCat();
    }
}

interface Visitor {
    void doDog();
    void doCat();
}
class TheVisitor implements Visitor{

    @Override
    public void doDog() {
        System.out.println("bark");
    }

    @Override
    public void doCat() {
        System.out.println("meow");
    }
}