package org.alexanderrr;

abstract class Car {
    private Drivable drivable;

    public void setDrivable(Drivable drivable){
        this.drivable = drivable;
    }
    public void startDriving(){
        drivable.drive();
    }
}
