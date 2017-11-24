/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michael_o.bannon_barchartjava;

//BarChart


import java.util.Scanner;
public class Michael_OBannon_BarChartJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Create an instance of Scanner class
        
        Scanner scanner=new Scanner(System.in);
        
        //Declare integer variables to score for students
        int artScore=0;
        int bobScore=0;
        int calScore=0;
        int danScore=0;
        int eliScore=0;
        int index; 
        
        System.out.print("Enter points scored by Art>>");
        artScore = scanner.nextInt();
        
        System.out.print("Enter points scored by Bob>>");
        bobScore = scanner.nextInt();
        
        System.out.print("Enter points scored by Cal>>");
        calScore = scanner.nextInt();
        
        System.out.print("Enter points scored by Dan>>");
        danScore = scanner.nextInt();
        
        System.out.print("Enter points scored by Eli>>");
        eliScore = scanner.nextInt();
        
        System.out.println("Points for Game\n");
        
        //bar graph for players
        
        System.out.print("Art\t");
        for(index=0;index<artScore;index++)
            System.out.print("*");
        
        System.out.print("Bob\t");
        for(index=0;index<bobScore;index++)
            System.out.print("*");
        
        System.out.print("Cal\t");
        for(index=0;index<calScore;index++)
            System.out.print("*");
        
        System.out.print("Dan\t");
        for(index=0;index<danScore;index++)
            System.out.print("*");
        
        System.out.print("Eli\t");
        for(index=0;index<eliScore;index++)
            System.out.print("*");
    }
}