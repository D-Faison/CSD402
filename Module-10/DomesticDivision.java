//DeJanae Faison M10 5.4.25

public class DomesticDivision extends Division {
    //Require State from domestic class
    String state;

    public DomesticDivision(String divisionName,int accountNumber,String state){
        //Pull from Division Super class
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display(){
        // Display Domestic Info including info from super class
        System.out.println("===| Domestic Division |===");
        System.out.println("-----------------------------");
        System.out.println("Company Name: "+divisionName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("State: "+state+"\n");
    }
}
