package pdc.sc.comp603;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Whitt
 */
public class Save {
    private  String saveFileName;
    
    public Save(String fileName, String data, boolean Overwrite){
        saveFileName = fileName;
        WriteFile(data, Overwrite);
    }
    
    public void WriteFile(String data, boolean alreadyExists){
         try{
        if(alreadyExists)
        {
            
        }else{
        File myObj = new File(saveFileName);
        }
         FileWriter myWriter = new FileWriter(saveFileName);
        myWriter.write(data);
        myWriter.close();
        }catch(IOException e){
            
        }
    }
}
