//import stuff here?
import java.text.DecimalFormat;
//Your code here
    public class Car{
    private String carName;
    private double milesDriven;
    private double gallonsUsed;
    
    public Car(){
    carName = "";
    milesDriven = 0;
    gallonsUsed = 0;
    }
    
    public Car(String name, double miles, double gallons){
        carName = name;
        milesDriven = miles;
        gallonsUsed = gallons;
    }
    public String getCar(){
        return carName; 
    }
    public double getMiles(){
        return milesDriven; 
    }
    public double getGallons(){
        return gallonsUsed; 
    }
    public void setCar(){

    }
    public void setMiles(){
         
    }
    public void setGallons(){
        
    }
    public double calculateAverage(){
        double average = gallonsUsed / milesDriven;
        average = Math.round(average * 10.0)/10.0; 
        return average;
    }
    public String toString(){
        average = average * 100;
        
        return carName + " averaged " + average + "m/g"; 
    }
}
        

//Paste console output below:
/*

Mushroom Cup Prix Racer Average Miles/Per Gallon
Royale averaged: 31.8 m/g 
Koopa King averaged: 10.3 m/g 
Pipe Frame averaged: 20.1 m/g 
Badwagon averaged: 14.6 m/g 

*/
