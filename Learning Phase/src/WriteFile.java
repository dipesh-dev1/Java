import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("Create.txt");
            fw.write("Hello Everyone!\n");
            fw.write("I'm Dipesh and this content is written in the file.");
            fw.close();
            System.out.println("Writing done!"); 
        }catch(IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
    
}
