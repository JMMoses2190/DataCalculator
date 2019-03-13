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
    Scanner opt = new Scanner(System.in);

    //Reads next data point

    System.out.println("What operation would you like to compute?");
    System.out.println("Subtract by specific integer: 1");
    System.out.println("Add by specific integer: 2");
    System.out.println("Multiply by specific integer: 3");
    System.out.println("Natural log of data: 4");
    int option = opt.nextInt();
    switch (option) {
      case (1):
        double sub;
        System.out.println("What would you like to subtract from data?");
        sub = opt.nextDouble();
        while (scan.hasNext()) {
          double data = scan.nextDouble();
          System.out.print(" " + data + " - " + sub);
          double ans = data - sub;
          System.out.println(" = " + ans);

        }
        break;
      case (2):
        double add;
        System.out.println("What would you like to add to data?");
        add = opt.nextDouble();
        while (scan.hasNext()) {
          double data = scan.nextDouble();
          System.out.print(" " + data + " + " + add);
          double ans = data + add;
          System.out.println(" = " + ans);

        }
        break;
      case (3):
        double mult;
        System.out.println("What would you like to multiply data by?");
        mult = opt.nextDouble();
        while (scan.hasNext()) {
          double data = scan.nextDouble();
          System.out.print(" " + data + " * " + mult);
          double ans = data * mult;
          System.out.println(" = " + ans);
        }

      case (4):
        while (scan.hasNext()) {
          double data = scan.nextDouble();
          System.out.print("Ln(" + data + ")");
          double ans = log(data);
          System.out.println(" = " + ans);

        }
        break;
      default:
        System.out.println("Error Invalid input");
    }


  }
}
