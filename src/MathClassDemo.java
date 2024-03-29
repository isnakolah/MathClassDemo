/*
* Created by Nakolah Daniel Oladidi
* */

public class MathClassDemo {
  public static void main(String[] args) {
    // Pythagorean theorem. c = square root of a squared plus b squared
    int a = 5;
    int b = 10;

    double aSq = Math.pow(a, 2);
    double bSq = Math.pow(b, 3);
    double c = Math.sqrt(aSq + bSq);
    double roundedC = Math.round(c);
    double ceilC = Math.ceil(2.1);

    System.out.println("c = " + c + " which when rounded is: " + roundedC);
    System.out.println("The ceil of 2.1 is;" + ceilC);

  }
}
