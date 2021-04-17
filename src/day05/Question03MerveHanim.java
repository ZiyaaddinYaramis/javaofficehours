package day05;

import java.util.Scanner;

public class Question03MerveHanim {

	public static void main(String[] args) {
        String kelime = "";
        String reverse="";
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
         kelime = scanner.next();
    
         for ( int i = kelime.length() - 1; i >= 0; i-- )  
             reverse = reverse + kelime.charAt(i);  
          if (kelime.equals(reverse))  
             System.out.println(" is a palindrome.");  
          else  
             System.out.println("isn't a palindrome.");   
       }  
    }  



