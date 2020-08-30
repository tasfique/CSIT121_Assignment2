//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 18/05/2019
//Purpose of this file- RentalItem abstract Class
package assignment2;

public abstract class RentalItem { //abstract class
    int id;
    double ratePerDay;
    int numOfDays;
    double rentalCalculation;
    
    public RentalItem () { //default constructor
        id= 0;
        ratePerDay = 0;
        numOfDays = 0;
    }
    public RentalItem (int id, double ratePerDay, int numOfDays) { //non default constructor
        this.id = id;
        this.ratePerDay = ratePerDay;
        this.numOfDays = numOfDays;
    }

    public int getId() { //getter for ID
        return id;
    }

    public void setId(int id) { //setter for ID
        this.id = id;
    }

    public double getRatePerDay() { //getter for Rate per day
        return ratePerDay;
    }

    public void setRatePerDay(double ratePerDay) { //setter for rate per day
        this.ratePerDay = ratePerDay;
    }

    public int getNumOfDays() { //getter for number of days
        return numOfDays;
    }

    public void setNumOfDays(int numOfDays) { //setter for number of days
        this.numOfDays = numOfDays;
    }
    
    
    public abstract double calculateRental(); //abstract method for calculating the total
    
    
    
    
}
