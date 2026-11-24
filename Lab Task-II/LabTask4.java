import java.io.*;

public class LabTask4 {
    public static void readFile(String filename) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);}
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            throw e; }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("File closed successfully.");
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage()); 
                }} }}
         public static void main(String[] args) {
        try {
            readFile("sample.txt"); 
        } catch (IOException e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }
}