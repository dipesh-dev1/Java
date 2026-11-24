import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
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

        // Write initial content
        try{
            FileWriter fw = new FileWriter("Create.txt");
            fw.write("Hello Everyone!\n");
            fw.write("I'm Dipesh and this content is written in the file.");
            fw.close();
            System.out.println("Writing done!"); 
        }catch(IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }

         // Append new content to the file
        try{
            FileWriter fw = new FileWriter("Create.txt",true);
            fw.write("\n5 + 4 = 9\n");
            fw.write("10 * 2 = 20\n");
            fw.close();
            System.out.println("Text appended successfully! \n");
        }catch(IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Read file
         try{
            FileReader fr = new FileReader("Create.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("=== File Content === \n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                
            }
            br.close();
            fr.close();
                
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

       

        // Delete file
     /*    File file = new File("Create.txt"); // the file you want to delete

           if (file.delete()){
               System.out.println("File deleted successfully!");
           }else{
            System.out.println("Failed to delete the file.");
    */
        }
    }