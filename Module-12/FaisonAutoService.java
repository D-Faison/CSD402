//DeJanae Faison M12
//Yearly Auto Service Fees

public class FaisonAutoService {

    //Fees and Charges
    //Final- not changeable 
    static final double STANDARD_CHARGE = 150.25;
    static final double OIL_CHANGE = 75.25;
    static final double TIRE_ROTATION = 50;
    static final double FACTORY_COUPON = 5;

    //No Parameters, return just service charge
    public static double yearlyService(){
        return STANDARD_CHARGE;
    }

    //Yearly Service charge + Oil Change
    public static double yearlyService(double OIL_CHANGE){
        //Adding the two services
        double oilService = STANDARD_CHARGE + OIL_CHANGE;
        return oilService;
    }

    //Yearly Service + Oil Charge + Tire Rotation
    public static double yearlyService(double OIL_CHANGE, double TIRE_ROTATION){
        //Add the three services
        double oilTire = STANDARD_CHARGE + OIL_CHANGE + TIRE_ROTATION;
        return oilTire;
    }

    //Yearly Service + Oil Charge + Tire Rotation - Coupon
    public static double yearlyService(double OIL_CHANGE, double TIRE_ROTATION, double COUPON){
        //Add the three services
        double oilTire = STANDARD_CHARGE + OIL_CHANGE + TIRE_ROTATION;
        return oilTire - COUPON;
    }


    public static void main(String[] args) {
        //Charge for standard
        System.out.println("Standard Service Charge: $"+yearlyService());
        System.out.println("Standard Service Charge: $"+yearlyService()+"\n");

        //Standard and Oil Change
        System.out.println("Oil and Service Charge: $"+yearlyService(OIL_CHANGE));
        System.out.println("Oil and Service Charge: $"+yearlyService(40.75)+"\n");

        //Standard,Oil Change and Tire Rotation
        System.out.println("Tire Rotation, Oil and Service Charge: $"+yearlyService(OIL_CHANGE,TIRE_ROTATION));
        System.out.println("Tire Rotation, Oil and Service Charge: $"+yearlyService(40.75,25.50)+"\n");

        //Standard,Oil, Tire and Coupon
        System.out.println("Tire Rotation, Oil and Service Charge with Coupon: $"+yearlyService(OIL_CHANGE,TIRE_ROTATION,FACTORY_COUPON));
        System.out.println("Tire Rotation, Oil and Service Charge with Coupon: $"+yearlyService(40.75,25.50,15)+"\n");
    }
}


