//DeJanae Faison M10 5.4.25

public class UseDivision {
    public static void main(String[] args) {
        //Initializa Division
        DomesticDivision Oreo = new DomesticDivision("Oreo",61912,"Illinois");
        DomesticDivision TeddyGrahams = new DomesticDivision("Teddy Grahams", 41988, "New Jersey");

        InternationalDivision mariaCookies = new InternationalDivision("Goya Maria Cookies", 21907, "Spain", "Spanish");
        InternationalDivision royalFamilyMochi = new InternationalDivision("Royal Family ", 32009, "Japan", "Japanese");

        //Call their functions
        Oreo.display();
        TeddyGrahams.display();

        mariaCookies.display();
        royalFamilyMochi.display();
    }
}
