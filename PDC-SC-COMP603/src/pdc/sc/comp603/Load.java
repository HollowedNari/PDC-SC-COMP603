package pdc.sc.comp603;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Whitt
 */
public class Load {
    public String fileName;
    
    
    public Load(String loadFileName){
        this.fileName = loadFileName;
    }
    
    public String ReadFile(){
        try{
        File myObj = new File(fileName);
        Scanner myReader = new Scanner(myObj);
        String data = "";
        while (myReader.hasNextLine()) {
                String currentData = myReader.nextLine();
                data = data+currentData;
        }
        return data;
        }catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
            return "null";
        }
    }

    
}
