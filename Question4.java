import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Integer");
    int INT = in.nextInt();
    while (INT > 0)
    {
      for (int i = 0; i < INT; i++) 
      {
        System.out.println("*");
      }
      INT=INT-1;
    
  }
}
