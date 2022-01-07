import java.util.Scanner;
public class Account {
// instance variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;
// class constructor
Account(String cname, String cid){
    customerName = cname;
    customerID = cid;
}
// function/method of depositing money
void deposit(int amount){
if(amount != 0){
    balance += amount;
    previousTransaction = amount;
}
}
// withdraw money
void withdraw(int amount){
    if(amount != 0){
        balance -= amount;
        previousTransaction = -amount;
    }
}
//getter method for obtaining previous transaction
void getPreviousTransaction(){
    if(previousTransaction > 0){
        System.out.println("Deposited: " + previousTransaction);
    }
    else if(previousTransaction < 0){
        System.out.println("Withdrawn: " + Math.abs(previousTransaction));
    }
    else{
        System.out.println("No transaction occurred");
    }
}
void calculateInterest(int years){
    double interestRate = 0.0185;
    double newBalance = (balance * interestRate * years) + balance;
    System.out.println("The current interest rate is " + (100 * interestRate) + "%" );
    System.out.println("After " + years + "years, your balance will be: " + newBalance );
}
void showMenu(){
    char option = '\0';
    Scanner scanner = new Scanner(System.in);
}
    public static void main(String[] args){

    }
    
}
