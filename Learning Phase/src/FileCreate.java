import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        // Create file
        File f = new File("Create.txt");
        try{
            if(f.createNewFile()){
                System.out.println("File created!");
            }else{
                System.out.println("File already exists.");
            }
        }catch(IOException e){
            System.out.println("Error creating file.");
        }
        }
    }