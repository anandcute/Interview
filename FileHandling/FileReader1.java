import java.io.*;
import java.util.*;

public class FileReader1 {
    public static void main(String[] args) {
        int starting = 123;
        int end = 333;
        ArrayList<String> list = new ArrayList<>();
        try{
            FileReader re = new FileReader("file.txt");
            BufferedReader b = new BufferedReader(re);
            String line ;
            while ((line = b.readLine()) !=  null) {
                if(line.matches("\\d{6}")){
                    int firstThree = Integer.parseInt(line.substring(0,3));
                
                    if((firstThree >= starting) && (firstThree <= end)){
                        list.add(line);
                    }
                }
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Filtered numbers: " + list);
    }
    
}

// import java.io.*;
// import java.util.*;

// public class FileReader1 {
//     public static void main(String[] args) {
//         // String filePath = "file.txt"; // File path
//         int startRange = 123;        // Starting range for first 3 digits
//         int endRange = 333;          // Ending range for first 3 digits

//         // List to store the filtered numbers
//         List<String> filteredNumbers = new ArrayList<>();

//         try{
//             FileReader re = new FileReader("file.txt");
//             BufferedReader br = new BufferedReader(re);
//             String line;
//             while ((line = br.readLine()) != null) {
//                 // Ensure the line contains a valid 6-digit number
//                 if (line.matches("\\d{6}")) {
//                     // Extract the first 3 digits
//                     int firstThreeDigits = Integer.parseInt(line.substring(0, 3));

//                     // Check if the number falls within the range
//                     if (firstThreeDigits >= startRange && firstThreeDigits <= endRange) {
//                         filteredNumbers.add(line); // Add to the list if valid
//                     }
//                 }
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         // Print the filtered numbers
//         System.out.println("Filtered numbers: " + filteredNumbers);
//     }
// }
