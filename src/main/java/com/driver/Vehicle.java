package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
<<<<<<< HEAD
        this.name=name;
=======
        setName(name);
>>>>>>> 739f0d95062fcd4271d864e5e96af015786cb382
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }
    public int getCurrentSpeed(){
        return this.currentSpeed;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
<<<<<<< HEAD
        this.currentDirection += direction;
=======
        this.currentDirection = direction;
>>>>>>> 739f0d95062fcd4271d864e5e96af015786cb382
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
<<<<<<< HEAD
        this.currentSpeed = speed;
        this.currentDirection = direction;
=======
        speed = this.currentSpeed;
        direction = this.currentDirection;
>>>>>>> 739f0d95062fcd4271d864e5e96af015786cb382
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }
    public String getName(){
        return this.name;
    }
    public int getCurrentDirection(){
        return this.currentDirection;
    }

}
