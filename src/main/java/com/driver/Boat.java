package com.driver;
public class Boat implements WaterVehicle{
    public String name;
    public int capacity;
    public Boat(String name,int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    public int getVehicleCapacity() {
        return capacity;
    }
    public String getVehicleName(){
        return name;
    }
}

