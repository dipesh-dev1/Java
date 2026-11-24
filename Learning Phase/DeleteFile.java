import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        File f = new File("Create.txt"); // the file you want to delete

        if (f.delete()){
            System.out.println("File deleted successfully!");
        }else{
            System.out.println("Failed to delete the file.");
        }
    }
    
}
