import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1 = 0;
    int n2 = 1;
    
    int count = sc.nextInt();

    System.out.println("Fibonnci series: " );
    System.out.print(n1 + " " + n2 + " ");
    for(int i=2;i<count; i++) {
      int nextTerm = n1 + n2;
      System.out.print(nextTerm + " ");
      n1 = n2;
      n2 = nextTerm;
    }
    sc.close();
  }
}