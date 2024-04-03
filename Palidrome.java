import java.util.Scanner;

public class Palidrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your string: ");
    String str = sc.nextLine();

    if(checkPalidrome(str)){
      System.out.println("Is a palidrome");
    } else {
      System.out.println("Is not a palidrome");
    }

    sc.close();
  }


  public static boolean checkPalidrome(String str) {
    StringBuilder sb = new StringBuilder(str);
    String reversedString = sb.reverse().toString();
    return str.equals(reversedString);
  }
}
