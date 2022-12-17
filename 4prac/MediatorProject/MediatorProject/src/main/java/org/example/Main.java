package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        concreteMediator.add(new ConcreteColleague(concreteMediator));
        concreteMediator.add(new ConcreteColleague(concreteMediator));
        ConcreteColleague concreteColleague = new ConcreteColleague(concreteMediator);
        concreteMediator.add(concreteColleague);
        concreteColleague.changeStatus();
    }
}

interface Mediator {
    void requestAll(Colleague colleague);
}

class ConcreteMediator implements Mediator{
    List<Colleague> colleagues = new ArrayList<>();
    void add(Colleague colleague){
        colleagues.add(colleague);
    }
    @Override
    public void requestAll(Colleague colleague) {
        colleague.setTrue();
        for (Colleague collegue : colleagues){
            if(colleague != collegue){
                collegue.setFalse();
            }
        }
    }
}

interface Colleague{
    void setFalse();
    void setTrue();
    void changeStatus();
}

class ConcreteColleague implements Colleague{
    boolean status;
    Mediator mediator;

    public ConcreteColleague(Mediator mediator){
        this.mediator = mediator;
    }
    @Override
    public void setFalse() {
    status = false;
        System.out.println("Changed status to false");
    }

    @Override
    public void setTrue() {
        System.out.println("Changed status to true");
    }

    @Override
    public void changeStatus() {
        mediator.requestAll(this);
    }
}