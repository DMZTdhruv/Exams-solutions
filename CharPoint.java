public class CharPoint {
  public static void main(String[] args) {
    String string = "myString";
    System.out.println(string);
    String reversedString = reverseString(string);
    System.out.println(reversedString);
  }

  public static String reverseString(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
  }
}