import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Fileeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "fileoperations.txt";
        boolean exit = false;

        while (!exit) {
            System.out.println("\n==== File Operations Menu ====");
            System.out.println("1. Create and Write Initial Content");
            System.out.println("2. Read File Content");
            System.out.println("3. Append Updated Content");
            System.out.println("4. Delete File");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    try (FileWriter writer = new FileWriter(filename)) {
                        writer.write("Initial Content\n");
                        System.out.println("File created and initial content written.");
                    } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    if (!Files.exists(Paths.get(filename))) {
                        System.out.println("File not found. Create it first!");
                        break;
                    }

                    System.out.println("\n=== Reading file content ===");
                    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        System.out.println("Error reading: " + e.getMessage());
                    }
                    break;

                case 3:
                    try (FileWriter writer = new FileWriter(filename, true)) {
                        writer.write("Updated Content Added\n");
                        System.out.println("Content appended successfully.");
                    } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        if (Files.deleteIfExists(Paths.get(filename))) {
                            System.out.println("File deleted successfully");
                        } else {
                            System.out.println("File does not exist");
                        }
                    } catch (IOException e) {
                        System.out.println("Error deleting file: " + e.getMessage());
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        sc.close();
    }
}
