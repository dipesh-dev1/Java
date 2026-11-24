import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File f = new File("Dipesh.txt");
        try{
            if(f.createNewFile()){
                    System.out.println("File created succesfully!");
                }else{
                    System.out.println("File already exist.");
                }
            } catch (IOException e){
            System.out.println("Error creating file.");
        }
        try {
            FileWriter fw = new FileWriter("Dipesh.txt",true);
            fw.write("Hello I'm Dipesh.");
            fw.write("This is content written in file.");
            System.out.println("Content written successfully!");
        }catch (Exception e){
            System.out.println("Error writing content!.");
        }
                try{
                    FileReader fr = new FileReader("Dipesh.txt");
                    System.out.println("File read successfully.");
                }catch (IOException e){
                    System.out.println("Error reading file.");
                }
            }
        }