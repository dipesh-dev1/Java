import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Dipesh.txt");
            fw.write("Hello I'm Dipesh.");
            fw.write("This is content written in file.");
            System.out.println("Content written successfully!");
        }catch (Exception e){
            System.out.println("Error writing content!.");
        }
    }
}
