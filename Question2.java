import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    Scanner in1 = new Scanner(System.in);
    
    System.out.println("Enter Height");
    double height = in1.nextDouble();
    
    System.out.println("Enter Weight");
    double Weight = in1.nextDouble();

    double BMI = Weight / (height * height);
    System.out.println("Your BMI is: " + BMI);
    
  }
}
