//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 18/05/2019
//Purpose of this file- Customer Class
package assignment2;


public class Customer { //declariing of attributes.
    private String name;
    private String contactNo;
    
    public Customer(String name, String contactNo) { //non default constructor.
        this.name = name;
        this.contactNo = contactNo;
    }

    public String getName() { //getter
        return name;
    }

    public void setName(String name) { //setter
        this.name = name;
    }

    public String getContactNo() { //getter
        return contactNo;
    }

    public void setContactNo(String contactNo) { //setter
        this.contactNo = contactNo;
    }
    
    @Override
    public String toString () { //to string to display
        String str;
        System.out.println("");
          str = "\nThe Name of Customer is \n"+getName()+"\n"+
                "Contact Number "+getContactNo()+"\n";
        return str;
    }
    
    
}
