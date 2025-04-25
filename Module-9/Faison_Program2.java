//DeJanae Faison M9 4/27/25
//File creator

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Faison_Program2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        try {

            //Create the file and check if it exists
            File fileName = new File("data.txt");
            if(fileName.createNewFile()){
                System.out.println("File created: "+ fileName.getName());
            }
            else{
                System.out.println("File already exists");
            }
            
            //Write to file
            FileWriter writer = new  FileWriter(fileName , true);

            Random randomNumber = new Random();
            for (int i = 0; i < 10; i++) {
                   int number = randomNumber.nextInt(20);
                   writer.write(number+"\n");
            }
            writer.write(System.lineSeparator());
            writer.close();

            //Open and Read the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

            reader.close();
            
        } catch (IOException e) {
            System.out.println("An error occured");
        }
    }
}

//Resource:
//W3Schools. (2020). Java Create and Write To Files. W3schools.com. https://www.w3schools.com/java/java_files_create.asp
