package com.driver;

public interface WaterVehicle {
    public String getVehicleName();
    public int getVehicleCapacity();
}
class Boat implements WaterVehicle{
    String name;
    int capacity;
    public Boat(String name,int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getVehicleCapacity() {
        return capacity;
    }
    public String getVehicleName(){
        return name;
    }
}
