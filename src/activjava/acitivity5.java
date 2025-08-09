
package activjava;


import java.util.Scanner;

import banking.bankApp;

public class acitivity5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            
            case 1:
                bankApp bApp[] = new bankApp[10];
                bApp[0] = new bankApp();
                
                int len = bApp.length;
                int response;
                do{
                System.out.println("1. Register Account");
                System.out.println("2. Sign Account");
                System.out.println("3. View All Accounts");
                System.out.println("");
                System.out.print("Enter Selection: ");
                int action = sc.nextInt();
                
                switch(action){
                    case 1:
                        
                        System.out.print("Enter Account Number: ");
                        bApp[0].setAccNo(sc.nextInt());
                        System.out.print("Set Account Pin: ");
                        bApp[0].setPin(sc.nextInt());
                        
                    break;
                    case 2:
                        
                        System.out.println("Enter Account No.: ");
                        int accout = sc.nextInt();
                        System.out.println("Enter Pin No.: ");
                        int pin = sc.nextInt();
                        
                        bankApp bapp = new bankApp();
                        int attempt = 3;
                        while(!(bapp.verifyAccount (accout, pin))){
                            if(attempt == 1){
                                System.out.println("ATTEMPT LIMIT REACHED!");
                                System.exit(0);
                            }
                            attempt--;
                            System.out.println("Invalid Account!");
                            System.out.println("Attempt Left " + attempt);
                            System.out.println("Enter Account No.: ");
                            accout = sc.nextInt();
                            System.out.println("Enter Pin No.: ");
                            pin = sc.nextInt();
                            
                        }
                            
                    break;
                    case 3:
                
                        for(int i = 0; i <=1; i++){

                                System.out.println("Account " + (i+1) + ": "+bApp[i].getAccNo());

                        }
                        
                    break;    
                }
                    System.out.println("Continue(1/0); ");
                    response = sc.nextInt();
                    
                }while (response == 1);
                
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


