
package banking;

public class bankApp {
    private int accNo;
    float balance;
    int pin;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    
    
    public boolean verifyAccount(int acc, int pn){
        
            if(acc == accNo && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
    public void deposti (float depo){
        if(depo > 0){
            this.balance += depo;
            System.out.println("Deposit of "+ depo +"New Balance "+ this.balance); 
        }else{
            System.out.println("Invalid Deposit Amount");
        }
        
    }
    
    public void withdraw(){
    
    
    }
}
