//import stuff here?
import java.text.DecimalFormat;
import java.util.Scanner;
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
        double average = milesDriven / gallonsUsed;
        average = Math.round(average * 10.0)/10.0; 
        return average;
    }
    public String toString(){
        return carName + " averaged " + calculateAverage() + "m/g"; 
    }
}

        

//Paste console output below:
/*

Please enter the car's name: 
honda civic
Please enter cars miles: 
234
Please enter cars gallons: 
100
honda civic averaged 2.3m/g
------NEXT CAR-------------------------------------------
Please enter the car's name: 
Toad Mobile
Please enter cars miles: 
13
Please enter cars gallons: 
7
Toad Mobile averaged 1.9m/g

*/
