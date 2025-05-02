//DeJanae Faison M10 5.4.25
public class InternationalDivision extends Division {

    //International requires a language and country
    String iDcountry;
    String iDlanguage;
    
    //Constructor using Superclass and additional fields
    public InternationalDivision(String divisionName,int accountNumber,String iDcountry,String iDlanguage){
        //pull from super
        super(divisionName, accountNumber);
        this.iDcountry = iDcountry;
        this.iDlanguage = iDlanguage;
    }

    //Override blank display function
    @Override
    public void display() {
        // Display International Info including info from super class
        System.out.println("===| International Division |===");
        System.out.println("-----------------------------");
        System.out.println("Company Name: "+divisionName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Country: "+iDcountry);
        System.out.println("Language: "+iDlanguage+"\n");
    }
}
