
package activjava;

import java.util.Scanner;
import activjava.newpackage.bankingClass;
public class acitivity5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                int attemp = 0;
                boolean  isLogIn = false;
                bankingClass bc = new bankingClass();
                while (attemp < 3  && !isLogIn){
                    
                System.out.println("Enter your Account No: ");
                int accountNo = sc.nextInt();

                System.out.println("Enter your Pin: ");
                int pin = sc.nextInt();
              
                    if(bc.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                    }else{
                        attemp++;
                        System.out.println("INVALID ACCOUNT! You have " + (3 - attemp) + " attempts remaining.");
                    }
                    if (attemp == 3){
                        System.out.println("3 attempts failed. Return after 15b minutes");
                    }
                }
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        
        }
            
    }
}
