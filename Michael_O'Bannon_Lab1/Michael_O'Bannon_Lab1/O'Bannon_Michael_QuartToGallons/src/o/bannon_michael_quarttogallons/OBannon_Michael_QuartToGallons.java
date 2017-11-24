/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package o.bannon_michael_quarttogallons;

import java.util.Scanner;

/**
 *
 * @author Moraldus
 */
public class OBannon_Michael_QuartToGallons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         final int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;
        int gallonsNeeded;
        int extraQuartsNeeded;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quarts needed >> ");
        quartsNeeded = input.nextInt();
        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println(" A job that needs " + quartsNeeded + " quartzs requires " +
                 gallonsNeeded + " gallons plus " + extraQuartsNeeded + " quarts. ");
    }
    
}
