import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class Main {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("stu_201952221_fib.txt");
      myWriter.write("one factorial is equal to 1 2 factorial is equal to 2 3 factorial is equal to 6 4 factorial is equal to 24 5 factorial is equal to 120"
      );
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}