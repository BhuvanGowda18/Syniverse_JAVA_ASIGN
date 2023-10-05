import java.util.Scanner;

public class StringRecursion
{
    public static String back(final String alpha) {
       
        if (alpha == null || alpha.length() == 1) {
            return alpha;
        }
        return String.valueOf(back(alpha.substring(1))) + alpha.charAt(0);
    }
    
    public static void main(final String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
			System.out.println("enter the string");
			final String alpha = obj.nextLine();
			System.out.print(back(alpha));
		}
    }
}
