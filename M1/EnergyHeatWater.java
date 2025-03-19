/* DeJanae Faison
 DATE
 Assignment M1 
 Description: Calculate the energy needed to heat water from an intial temp
 to a final temp */

import javax.swing.JOptionPane;

public class EnergyHeatWater {
    public static void main(String[] args) {
        
        //Variable Input and convert holding
        
        double waterMass;
        String waterMassInput;

        double intialTemp;
        String intialTempInput;

        double finalTemp;
        String finalTempInput;

        double deltaTemp;

        final int heatCapacity = 4186;

        //Request Input through displays
        waterMassInput = JOptionPane.showInputDialog(null, "Enter Mass of water in Kilograms: ",
         "Water Mass Input",JOptionPane.QUESTION_MESSAGE);
        //convert input to double
        waterMass = Double.parseDouble(waterMassInput);

        intialTempInput = JOptionPane.showInputDialog(null, "Enter Initial Temperature in C: ",
         "Initial Temp Input",JOptionPane.QUESTION_MESSAGE);
        intialTemp = Double.parseDouble(intialTempInput);

        finalTempInput = JOptionPane.showInputDialog(null, "Enter FINAL Temperature in C: ",
         "Final Temp Input",JOptionPane.QUESTION_MESSAGE);
        finalTemp = Double.parseDouble(finalTempInput);

        //Delta temp variable
        deltaTemp = finalTemp-intialTemp;
        
        JOptionPane.showMessageDialog(null, waterMass * deltaTemp * heatCapacity,"Energy Required to Heat Water: ",JOptionPane.INFORMATION_MESSAGE);
    }
}
