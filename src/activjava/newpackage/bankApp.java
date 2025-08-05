
package activjava.newpackage;

public class bankApp {
    private int accNo;
    float balance;
    private int pin;
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accountNo) {
        this.accNo = accNo;
    }

    public float getInitialBalance() {
        return balance;
    }

    public void setInitialBalance(float initialBalance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    public boolean verifyAccount(int acc, int pn){
        
            if(acc == accNo && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
    public int setAccount(){
        return accNo;
    }
    
    public void viewBalance(){
    
    
    }
}
