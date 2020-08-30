//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 18/05/2019
//Purpose of this file- Boat Class
package assignment2;


public class Boat extends RentalItem {//subclass
    private int capacity; //declaring of attributes.
    
    public Boat() { //default constructor.
        super();
        capacity = 0;
    }
    
    public Boat(int id, double ratePerDay, int numOfDays, int capacity) { //non default constructor
        this.id = id;
        this.ratePerDay = ratePerDay;
        this.numOfDays = numOfDays;
        this.capacity = capacity;
    }

    public int getCapacity() { //getter
        return capacity;
    }

    public void setCapacity(int capacity) { //setter
        this.capacity = capacity;
    }
    
    @Override
    public double calculateRental() { // to do calculation of the rental for boat.
        if(capacity>10) { //if the capacity is more than 10
            super.rentalCalculation = (super.ratePerDay + 50); // rate per day will have addition of 50
        } else {
            super.rentalCalculation = super.ratePerDay; //else it will not change the rental will be same, if the capacity is less than 10.
        }
        return (super.rentalCalculation*super.numOfDays);
    }
    
    @Override
    public String toString () {//to string to display
        String str;
          str = "\nBoat ID "+super.id+"\n"+
                  "The Rate Per Day is "+super.ratePerDay+"\n"+
                  "The Number of Days Renting "+super.numOfDays+"\n"+
                  "The Capacity is "+getCapacity()+"\n";
        
        return str;
    }
    
}
