package com.driver;

public class boat implements WaterVehicle {
    public String name;
    public int capacity;

    public boat(String name,int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    public String getVehicleName(){
        return name;
    }
    public int getVehicleCapacity(){
        return capacity;
    }
}