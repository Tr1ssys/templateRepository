package org.alexanderrr;

public class Car {
    private String chassis;
    private String body;
    private String paint;
    private String interior;
    protected Car(Builder builder){
        this.chassis = builder.chassis;
        this.body = builder.body;
        this.paint = builder.paint;
        this.interior = builder.interior;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "chassis='" + chassis + '\'' +
                ", body='" + body + '\'' +
                ", paint='" + paint + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }

    static class Builder{
        private String chassis;
        private String body;
        private String paint;
        private String interior;


        public Builder setChassis(String chassis) {
            this.chassis = chassis;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setPaint(String paint) {
            this.paint = paint;
            return this;
        }

        public Builder setInterior(String interior) {
            this.interior = interior;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }
}
