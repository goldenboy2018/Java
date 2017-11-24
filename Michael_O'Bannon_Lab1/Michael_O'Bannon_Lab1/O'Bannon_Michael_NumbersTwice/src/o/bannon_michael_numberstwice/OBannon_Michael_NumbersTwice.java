/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package o.bannon_michael_numberstwice;

/**
 *
 * @author Moraldus
 */
public class OBannon_Michael_NumbersTwice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 14, num2 = 42;
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }
     public static void displayTwiceTheNumber(int n)
     {
         final int FACTOR = 2;
         System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
     }
        public static void displayNumberPlusFive(int n)
     {
         final int FACTOR = 5;
         System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
     }
           public static void displayNumberSquared(int n)
     {
         System.out.println(n + " squared is " + (n * n));
     }
     
     
    }
    

