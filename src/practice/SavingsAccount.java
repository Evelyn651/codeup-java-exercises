package practice;

public class SavingsAccount {


    int balance;

    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
    }

    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    public void deposit(int amountToDeposit){
        balance = amountToDeposit + balance;
        System.out.println("You just deposited " + amountToDeposit);
    }

    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " +  amountToWithdraw);
        return amountToWithdraw;
    }

    public String toString(){
        return "This is a savings account with " + balance + " saved.";
    }
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2000);

        //check balance
        savings.checkBalance();

        //withdrawing
        savings.withdraw(300);

        //check balance after withdraw
        savings.checkBalance();

        //deposit
        savings.deposit(600);

        //check balance after deposit
        savings.checkBalance();

        //another deposit
        savings.deposit(600);

        //check balance after another deposit
        savings.checkBalance();

        System.out.println(savings);



    }

}