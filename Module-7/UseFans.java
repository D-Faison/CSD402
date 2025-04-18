
import java.util.ArrayList;

//DeJanae Faison M7 4.20.25
//Use fans from previous module

public class UseFans {

    //private static int speed;
    
    //Without toString display a single instance of fan info
    public static void displayFan(Fan fan){
        System.out.println("\nFan");
        System.out.println("On: " + fan.getOn());
        System.out.println("Speed : "+ fan);
        System.out.println("Radius: "+fan.getRadius());
        System.out.println("Color : "+ fan.getColor());


    }


    //Without String method display collection of fans
    public static void displayFans(ArrayList<Fan> fans){
        for (int i = 0; i < fans.size(); i++) {
            //For each fan fetch the single fan's information
            displayFan(fans.get(i));
        }
    }

    public static void main(String[] args) {
        //Fan Objects
        //Fan 1 carries default settings
        Fan fan_1 = new Fan();
        displayFan(fan_1);
        //Custom Fans
        Fan fan_2 = new Fan();
        fan_2.setColor("black");
        fan_2.setRadius(7);
        fan_2.setSpeed(1);
        fan_2.setOn(true);

        Fan fan_3 = new Fan();
        fan_3.setColor("purple");
        fan_3.setRadius(20);
        fan_3.setSpeed(3);
        fan_3.setOn(false);

        //Fan array
        ArrayList<Fan> fanList = new ArrayList<>();
        //add fans to list
        fanList.add(fan_1);
        fanList.add(fan_2);
        fanList.add(fan_3);
        //Display List
        displayFans(fanList);
    }
}
