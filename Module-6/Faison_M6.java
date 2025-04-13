//DeJanae Faison M6 4.13.25
class Fan {
    
    //Fan Speeds
    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST=3;
    private int speed;

    //Size of fan
    double radius;

    //On or Off
    private boolean on;

    //Fan color
    String color;


    //no arguements
    //default value
    public Fan(){
        this.speed = STOPPED;
        //fan by default is off
        this.on=false;
        this.radius=6;
        this.color="white";
    }

    //With arguements
    public Fan(int speed,boolean on,double radius, String color){
        this.speed = speed;
        this.on=on;
        this.radius = radius;
        this.color = color;
    }

    //Getters and Setters
    //Speed
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    //Is on
    public boolean getOn(){
        return on;
    }
    private  void setOn(boolean on){
        this.on=on;
    }

    //radius
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    //color
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
   //passes the variable SPEED through cases
   @Override
   public String toString(){
    return speedString(speed);
   }

   //toString that returns the Fans state
   public String speedString(int speed){
        switch(speed){
            case SLOW -> {
                return "SLOW";
            }
            case MEDIUM ->{
                return "MEDIUM";
            }
            case FAST ->{
                return "FAST";
            }
            default -> {
                return "STOPPED";
            }
        }
   }
 
        
   
    public static void main (String[]args){
        //Fan with default settings
        Fan defaultFan = new Fan();
        System.out.println("Default Fan:");
        //GET IF FAN IS ON AND PRINT IT READABLY
        if(defaultFan.getOn()){
            System.out.println("FAN ON");
        }
        else{
            System.out.println("FAN OFF");
        }
        System.out.println("Speed: "+defaultFan+"\nRADIUS: "+defaultFan.radius+"\nCOLOR: "+defaultFan.color);


        System.out.println("");
        //Fan with custom settings
        Fan customFan = new Fan();
        customFan.setSpeed(3);
        customFan.setOn(true);
        customFan.setRadius(8.8);
        customFan.setColor("blue");

        System.out.println("Custom Fan:");
        if(customFan.getOn()){
            System.out.println("FAN ON");
        }
        else{
            System.out.println("FAN OFF");
        }
        System.out.println("Speed: "+customFan+"\nRADIUS: "+customFan.radius+"\nCOLOR: "+customFan.color);
    }
}
