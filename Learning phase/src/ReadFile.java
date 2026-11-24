import java.io.FileReader;
import java.io.IOException;
public class ReadFile {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("Dipesh.txt");
            System.out.println("File read successfully.");
        }catch (IOException e){
            System.out.println("Error reading file.");
        }
    }
}
