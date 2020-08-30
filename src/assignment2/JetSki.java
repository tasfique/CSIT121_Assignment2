//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 18/05/2019
//Purpose of this file- Jetski Class
package assignment2;


public class JetSki extends RentalItem {//subclass
    private double horsePower; //declaring of attributes.
    
    public JetSki () { //default constructor.
        super();
        horsePower = 0.0;
    }
    
    public JetSki (int id, double ratePerDay, int numOfDays, double horsePower) { //non default constructor.
        this.id = id;
        this.ratePerDay = ratePerDay;
        this.numOfDays = numOfDays;
        this.horsePower = horsePower;
        
    }

    public double getHorsePower() { //getter
        return horsePower;
    }

    public void setHorsePower(double horsePower) { //setter
        this.horsePower = horsePower;
    }
    
    @Override
    public double calculateRental () { //calculating the rental
        if(horsePower<=250) { //if the horpower is less than 250 
            super.rentalCalculation = super.ratePerDay;
        } else {
            super.rentalCalculation = super.ratePerDay * 1.5;
        }
        
        return (super.rentalCalculation * super.numOfDays);
    }
    
    @Override
    public String toString () { //toString method to display
        String str;
          str = "\nJetSki ID "+super.id+"\n"+
                  "The Rate Per Day is "+super.ratePerDay+"\n"+
                  "The Number of Days Renting "+super.numOfDays+"\n"+
                  "The HorsePower is "+getHorsePower()+"\n";
        
        return str;
    }
    
    
}
