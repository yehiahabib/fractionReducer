import java.util.Scanner;

public class fractionReducer {
	
  public static void main(String[] args) {
	  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a numerator:");
	
    int numerator = input.nextInt();
	
    System.out.println("Enter a denominator:");
	
    int denominator = input.nextInt();
	
    input.close();
    
	if (denominator == 0) {
      System.out.println("Denominator is 0,Invalid.");
      return;
    } else if (numerator % denominator == 0) {
      System.out.println(numerator + "/" + denominator
          + " is an improper function and it can be reduced to " + numerator / denominator + ".");
    } else if (numerator / denominator > 0) {
      int remainder = numerator - (numerator / denominator) * denominator;
      System.out.println(
          numerator + " / " + denominator + " is an improper function and its mixed fraction is "
              + numerator / denominator + " + " + remainder + " / " + denominator);
    } else
      System.out.println(numerator + " / " + denominator + " is a proper fraction");
  }

}
