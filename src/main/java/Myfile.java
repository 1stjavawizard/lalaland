import java.io.File;
import java.io.IOException;

public class Myfile {

    public void createMyFile(String filename){
        File file = new File(filename);
        try {
            if(file.exists()){
                System.out.println("We cannot create this file now because it already exist");
            }
            else{
                if(file.createNewFile()){
                    System.out.println("File is successfully created...");
                }
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
