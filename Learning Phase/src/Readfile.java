import java.io.BufferedReader;
import java.io.FileReader;

public class Readfile {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("Create.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("=== File Content ===");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                
            }
            br.close();
            fr.close();
                
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
