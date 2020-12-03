import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        System.out.print("Enter word to search for: ");
        String searchTerm = sc.nextLine();
        System.out.print("Enter filename: ");
        String fileName = sc.nextLine();

        ArrayList<String> stringArray = new ArrayList<String>();

        // read file demo.txt
        try {
            File myObj = new File(fileName + ".txt");
            Scanner myReader = new Scanner(myObj);
            int lineCount = 1;
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String words[] = line.split(" ");
                for (int k = 0; k < words.length; k++) {
                    if (searchTerm.equals(words[k].toLowerCase()))
                        System.out.println("Found on line: " + lineCount);
                };
                lineCount += lineCount;
            };
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        sc.close();
    }
}
