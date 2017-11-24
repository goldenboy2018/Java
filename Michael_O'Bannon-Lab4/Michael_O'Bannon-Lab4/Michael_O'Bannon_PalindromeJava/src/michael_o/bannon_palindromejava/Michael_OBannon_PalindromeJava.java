

package michael_o.bannon_palindromejava;
import java.util.Scanner;


public class Michael_OBannon_PalindromeJava {
 public static void main(String[] args) {
        String revStr = "";
        String temp = "";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter palindrome check: ");
        String str = scanner.nextLine();
        
        for (int j =0; j < str.length(); j++)
        {
            if(Character.isLetter(str.charAt(j)))
            {
                temp = temp + str.charAt(j);
            }
        }
        for(int i = str.length() -1; i>=0; i--)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                revStr = revStr + str.charAt(i);
            }            
        }
    if(revStr.equalsIgnoreCase(temp))
    {
        System.out.println("It's a Palindrome");
    }
    else
    {
        System.out.println("This is not a palindrome");
    }    
}
}
    

