/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michael_o.bannon_perfectjava;

/**
 *
 * @author Moraldus
 */
//finds the perfect numbers between 1-1000
public class Michael_OBannon_PerfectJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int number, total = 0;
    final int LIMIT = 1000;
    for(number = 1; number <= LIMIT; number++)
    {
      if(total == (number - 1))
          System.out.println(number + " is a perfect number");
      total = 0;
      for(int divider = 1; divider < number; divider++)
      {
    if((number % divider) == 0)
    total += divider;
      }
    }
  }
}
        

    

