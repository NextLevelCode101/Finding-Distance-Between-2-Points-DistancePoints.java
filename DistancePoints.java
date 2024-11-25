import java.util.Scanner;
 
public class DistancePoints
{
public static void main(String[] args)
{
      Scanner scan = new Scanner(System.in);
      double xOne;
      double yOne;
      double xTwo;
      double yTwo;
      double dist = 0;

      System.out.println("Enter x1: ");
      xOne = scan.nextDouble();
      System.out.println("Enter y1: ");
      yOne = scan.nextDouble();
      System.out.println("Enter x2: ");
      xTwo = scan.nextDouble();
      System.out.println("Enter y2: ");
      yTwo = scan.nextDouble();

      scan.close();

      dist = Math.sqrt(Math.pow(xTwo-xOne, 2) + (Math.pow(yTwo-yOne, 2)));
      System.out.println("The distance between the 2 points is: "+ dist);

      }
   }