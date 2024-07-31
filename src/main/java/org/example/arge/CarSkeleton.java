package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String startEngine(){
        return "Engine is starting";
    }
    public String drive(){
        runEngine();
        return "Driving";
    }

    protected String runEngine(){
        return "Engine is running" ;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
