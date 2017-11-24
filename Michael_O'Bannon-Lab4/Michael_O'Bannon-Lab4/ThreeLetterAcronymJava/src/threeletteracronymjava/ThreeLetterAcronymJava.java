
package threeletteracronymjava;

import java.util.Scanner; 
public class ThreeLetterAcronymJava {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
int count = 0; 
System.out.println("Enter three words"); 
String a = scan.nextLine(); 
String b = a.toUpperCase(); 
System.out.print (b.charAt(0)); 
for(int i = 0; i<a.length()-1;i++) 
{ 
if(a.charAt(i) == 32 && count < 2) 
{ 
System.out.print(b.charAt(i+1)); 
count++; 
} 
} 
       
    
    

