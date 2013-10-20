package P8_6;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/18/13
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    private double fuelEff;
    private double fuelLevel;

    //Constructor, make sure the fuel efficiency is positive.
    public Car(double mpg){
        if (mpg <= 0) {
            throw new IllegalArgumentException("Fuel Efficiency must be positive.");
        }
        fuelEff = mpg;
    }

    //Drive will attempt to drive the car x miles and the return the amount of gas remaining, or 0 if the car is empty.
    public void drive(double miles){
        fuelLevel = Math.max(0 , fuelLevel - miles/fuelEff);
    }

    //Add gas to the fuel level.
    public void addGas(float gasToAdd){
        fuelLevel += gasToAdd;
    }

    //Get gas level.
    public double getGasLevel(){
        return fuelLevel;
    }
}
