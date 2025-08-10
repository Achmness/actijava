
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
                int accCount = 0;
                do{
                System.out.println("1. Register Account");
                System.out.println("2. Sign Account");
                System.out.println("3. View All Accounts");
                System.out.println("");
                System.out.print("Enter Selection: ");
                int action = sc.nextInt();
                
                switch(action){
                    case 1:
                    if(accCount < bApp.length){
                        bApp[accCount] = new bankApp();
                        System.out.print("Enter Account Number: ");
                        int accNo = sc.nextInt();
                        System.out.print("Set Account Pin: ");
                        int pin = sc.nextInt();
                        
                        bApp[accCount].setAccNo(accNo);
                        bApp[accCount].setPin(pin);
                        accCount++;
                        
                    }
                    break;
                    case 2:
                    int attempt = 3; 
                    boolean logIn = false;
                    while(attempt > 0 && !logIn){
                    System.out.print("Enter Account Number: ");
                    int accSign = sc.nextInt();
                    System.out.print("Enter Pin Number: ");
                    int pinSign = sc.nextInt();
                        
                        for(int i = 0; i < accCount; i++){
                            if(bApp[i].verifyAccount(accSign, pinSign)){
                                System.out.println("LOG IN SUCCESSFUL!");  
                                logIn = true;
                                break;
                            }
                        }
                    
                        if(!logIn){
                            attempt--;
                            System.out.println("Invalid Account");
                            System.out.println("Attempt Left; "+ attempt);   
                        }
                        if(attempt == 1){
                            System.out.println("ATTEMPT LIMIT REACHED");
                            System.exit(0);
                        }
                    }
                    if(logIn == true){
                        int bankMenu;
                    do{    
                        System.out.println("\n--- Transactions Menu ---");
                        System.out.println("1. Deposit");
                        System.out.println("2. Withdraw");
                        System.out.println("3. View Balance");
                        System.out.println("4. Logout");
                        System.out.print("Enter choice: ");
                        bankMenu = sc.nextInt();
                        switch(bankMenu){
                            case 1:
                                System.out.print("Enter Deposit Amount: ");
                                float depAmount = sc.nextFloat();
                                bApp[0].deposit(depAmount);
                            break;
                            
                            case 2: 
                                System.out.print("Enter Withdraw Amount: ");
                                float withAmount = sc.nextFloat();
                                bApp[0].withdraw(withAmount);
                            break;
                            
                            case 3:
                                bApp[0].balance();
                            break;
                            
                            case 4:
                                System.out.println("Logging Out!");
                            break;
                            default:
                                System.out.println("Invalid Choice");
                        }
                    }while (bankMenu != 4);

                    }        
                    break;
                    case 3:
                
                        for(int i = 0; i < accCount; i++){

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


