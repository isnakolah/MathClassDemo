public class StringsMethodsDemo {
  public static void main(String[] args) {
    String original = "abcde";

    for (int i = 0; i < original.length(); i++) {
      System.out.println("Character at index " + i + " is " + original.charAt(i));
    }

    System.out.println("The letter a is at index " + original.indexOf('a'));

    original = original.toUpperCase();

    System.out.println(original);

    String tester = "Daniel Oladidi Nakolah";
    String testSubstring = tester.substring(1,5);
    System.out.println(testSubstring);
  }
}
