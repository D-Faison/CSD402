//DeJanae Faison M10 5.4.25

//Restricted Division Super Class
public abstract class Division {
    
    String divisionName;
    int accountNumber;

    //Constructor that requires name and number parameters
    public Division(String divisionName,int accountNumber){
        this.divisionName = divisionName;
        this.accountNumber =accountNumber;
    }

    //Customizable display method blank for subclasses
    public abstract void display();
}
