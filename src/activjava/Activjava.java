
package activjava;
import java.util.Scanner;
public class Activjava {

    public static void main(String[] args) {
        String remarks;
        String message;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scan.nextLine();
        
        System.out.print("Enter marks in Science: ");
        int scie = scan.nextInt();
        
        System.out.print("Enter marks in History: ");
        int hist = scan.nextInt();
        
        System.out.print("Enter marks in Math   : ");
        int math = scan.nextInt();
        
        System.out.print("Enter marks in Soc    : ");
        int soc = scan.nextInt();
        
        System.out.print("Enter marks in Arts   : ");
        int art = scan.nextInt();
        
        int totalM = scie + hist + math + soc + art;
        System.out.println("Total Marks: " + totalM);
        
        float totalPercent = totalM / 5;
        System.out.println("Total Percentage: " + totalPercent);
        
        if(totalPercent >= 91 && totalPercent <= 100){
            remarks = "Excellent";
            message = "Congrats " + name + " you Passed.";
        }else if(totalPercent >= 86 && totalPercent <= 90) {
            remarks = "Very Good";
            message = "Congrats " + name + " you Passed.";
        }else if(totalPercent >= 81 && totalPercent <= 85) {
            remarks = "Good";
            message = "Congrats " + name + " you Passed.";
        }else if(totalPercent >= 76 && totalPercent <= 80) {
            remarks = "Fair";
            message = "Congrats " + name + " you Passed.";
        }else if(totalPercent >= 71 && totalPercent <= 75) {
            remarks = "Poor";
            message = "Congrats " + name + " you Passed.";
        }else{
            remarks = "Fail";
            message = "Try Again.";
        }
        System.out.println("Remarks: " + remarks);
        System.out.println(message);
    }
    
}
