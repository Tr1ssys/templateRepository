package org.alexanderrr;

public class Tesla extends Car{
    public Tesla(){
        setDrivable(new FullWheelDrive());
    }
}
