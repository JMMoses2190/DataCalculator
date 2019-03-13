import static java.lang.Math.log;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.math.*;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    //Reads data from Data.txt, edit data in file to current data set
    File file = new File("Data.txt");
    Scanner scan = new Scanner(file);

    while (scan.hasNext()) {
      //Reads next data point
      double data = scan.nextDouble();
      System.out.print(" " + data);
      //Edit operations to preform equation needed for assignment
      //double ans = data - 22;
      double ans = log(data);
      System.out.println(" " + ans);
    }
  }
}
