//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 18/05/2019
//Purpose of this file- Bicycle Class
package assignment2;

public class Bicycle extends RentalItem {//subclass
    private String type; //declaring of attributes.
    
    public Bicycle() { //default constructor 
        super();
        type = null;
    }
     
    public Bicycle (int id, double ratePerDay, int numOfDays, String type) { //non default constructor.
        this.id = id;
        this.ratePerDay = ratePerDay;
        this.numOfDays = numOfDays;
        this.type = type;
    }

    public String getType() { //getter
        return type;
    }

    public void setType(String type) { //setter
        this.type = type;
    }
    
    @Override //the method is overridden
    public double calculateRental () {
        if (type.equalsIgnoreCase("1")) { //if the user selects 1, which Mountain Bike
            super.rentalCalculation = super.ratePerDay + 10;
        }
        
        else if (type.equalsIgnoreCase("2")) { //if the user selects 2, which is Kids bike
            super.rentalCalculation = super.ratePerDay / 2;
        }
        
        else if(type.equalsIgnoreCase("3")) { // if the user selects 3, which is other bike.
            super.rentalCalculation = super.ratePerDay;
        }
        
        return (super.rentalCalculation*super.numOfDays);
        
    }
    
    @Override //the method is overridden
    public String toString () { //to string to display
        String str;
          str = "\nBicycle ID "+super.id+"\n"+
                  "The Rate Per Day is "+super.ratePerDay+"\n"+
                  "The Number of Days Renting "+super.numOfDays+"\n"+
                  "The Type is "+getType()+"\n"+
                  "\nType 1 = 'Mountain Bike' \n"+
                  "Type 2 = 'Kid's Bike' \n"+
                  "Type 3 = 'Other Bike' \n";
        
        return str;
    }
}
