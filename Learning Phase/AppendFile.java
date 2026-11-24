import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("Create.txt",true);
            fw.write("5 + 4 = 9\n");
            fw.write("10 * 2 = 20\n");
            fw.close();
            System.out.println("Text appended successfully!");
        }catch(IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
