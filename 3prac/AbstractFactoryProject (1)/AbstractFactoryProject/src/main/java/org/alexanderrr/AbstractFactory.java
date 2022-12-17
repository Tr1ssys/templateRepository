package org.alexanderrr;

public class AbstractFactory {
    Factory createFactory(String type){
        return switch (type) {
            case "Viktorian" -> new ViktorianFactory();
            case "Modern" -> new ModernFactory();
            default -> throw new IllegalArgumentException("Unexpected value");
        };
    }
}
