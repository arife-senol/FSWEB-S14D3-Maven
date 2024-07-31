package org.example.company;

public class Car {
    private boolean engine=true;
    private int cylinders;
    private String name;
    private int wheels=4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + "  starting");
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName() + "  accelerating");
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName()+"brake");
        return  "the car is braking";
    }
    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
         Car car = (Car)obj;
        return this.cylinders == car.cylinders && this.name.equals(car.name);
    }
}
