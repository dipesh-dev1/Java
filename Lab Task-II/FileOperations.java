import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        String filename = "fileoperations.txt";

        // 1. Create and write initial content
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Initial Content");
            System.out.println("File created and written.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // 2. Read and print content
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            System.out.println("File content: " + line);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // 3. Append updated content
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(" - Updated Content");
            System.out.println("Content appended.");
        } catch (IOException e) {
            System.out.println("Error appending file: " + e.getMessage());
        }

        // 4. Read and print updated content
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Updated file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading updated file: " + e.getMessage());
        }

        // 5. Delete the file
        File file = new File(filename);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
