
package banking;

public class bankApp {
    private int accNo;
    private float balance;
    private int pin;

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
    
    public void deposit (float amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Deposit of "+ amount +"\nNew Balance "+ this.balance); 
        }else{
            System.out.println("Invalid Deposit Amount");
        }
        
    }
    
    public void withdraw(float amount){
        if(amount > 0 && amount <= this.balance ){
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
    }else{
            System.out.println("Insufficient balance or invalid amount!");
        }
        
    }
    
    public void balance(){
        System.out.println("Current Balance: "+ balance);
    }
    
}