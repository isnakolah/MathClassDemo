public class Recursion {
  public static void main(String[] args) {
    System.out.println("result is " + factorial(3));
  }
  public static int factorial(int n) {
    if (n == 1) { return 1; }
    return n * factorial(n -1);
  }
}
