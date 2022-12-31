package com.driver;

public interface WaterVehicle {
    public String getVehicleName();
    public int getVehicleCapacity();
}
<<<<<<< HEAD

=======
>>>>>>> 739f0d95062fcd4271d864e5e96af015786cb382
class Boat implements WaterVehicle{
    public String name;
    public int capacity;
    public Boat(String name,int capacity){
        this.name = name;
        this.capacity = capacity;
    }
<<<<<<< HEAD
=======
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setName(String name){
        this.name=name;
    }
>>>>>>> 739f0d95062fcd4271d864e5e96af015786cb382
    public int getVehicleCapacity() {
        return capacity;
    }
    public String getVehicleName(){
        return name;
    }
}

