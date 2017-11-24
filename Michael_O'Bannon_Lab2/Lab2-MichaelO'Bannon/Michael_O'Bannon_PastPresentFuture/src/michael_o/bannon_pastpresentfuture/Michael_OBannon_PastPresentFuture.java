/*Application that prompts user for a month, day, and year. Display a message that
specifies whether the entered date is(1) not this year,(2) in an earlier month this year,
(3) in a later month this year, or(4) this month.*/


package michael_o.bannon_pastpresentfuture;

import java.util.Calendar;
import java.util.Scanner;
public class Michael_OBannon_PastPresentFuture {

   
    public static void main(String[] args) {Calendar now = Calendar.getInstance();
        
        int thisYear = now.get(Calendar.YEAR);
        int thisMonth = now.get(Calendar.MONTH) +1;
        int thisDay = now.get(Calendar.DAY_OF_MONTH);
        
        int year, month, day;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        year = scanner.nextInt();
        
        System.out.println("Enter month:");
        month = scanner.nextInt();
        
        System.out.println("Enter day:");
        day = scanner.nextInt();
        
        System.out.println("User Input Data:");
        
        System.out.println("MM/DD/YYYY:" + month + "/" + day + "/" + year);
        
        if (year < thisYear || year > thisYear){
            System.out.println("Not this year");
        }
        
        else if (year == thisYear){
            if (month < thisMonth){
                System.out.println("In an earlier" + "month this year");
            }
            else if (month > thisMonth){
                System.out.println("In an later" + "month this year");
            }
            else
                System.out.println("This month");
       
        }
    
   
    

