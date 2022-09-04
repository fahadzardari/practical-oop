public class Exceptions {

  public static void main(String[] args) {
    try {
      int x = 5 / 0;
      System.out.println(x);
    } catch (ArithmeticException e) {
      System.out.println(e);
    }
    try {
      int[] arr = { 12, 2 };
      System.out.println(arr[3]);
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
    try {
      String n = null  ;
      System.out.println(n.charAt(5));
    } catch (NullPointerException n) {
      System.out.println(n);
    }
  }
}
