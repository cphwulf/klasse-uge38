/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguess;
public class oops {
  public static void main(String[] args) {
    int a = 47, b = 42;
    int smaller = minimum(a,b);
    if (smaller == a) {
      System.out.println(a + " is the smallest!");
    } else if (smaller == b) {
      System.out.println(b + " is the smallest!");
    } else {
      System.out.println("a and b have same size");

    }
  }
  public static int minimum(int a, int b) {
  int smaller = -1;
    if (a < b) {
      smaller = a;
    } else if (a > b) {
      smaller = b;
    } 
    return smaller;
    }
  }