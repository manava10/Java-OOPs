//This is just a basic project; I have done it to revise my knowledge of classes,objects and methods in JAVA.
package OOPS_PROJECT;
import java.util.Scanner;
class atm{
    private float Balance=10000;
    private int PIN;
    public void checkpin(){
        System.out.println("Welcome To Self_Service ATM FACILITIES");
        System.out.println("Enter the pin :");
        Scanner sc = new Scanner(System.in);
        int enteredPIN = sc.nextInt();

        //We have set Dummy PIN as any Number divisible by 3.
        if(enteredPIN%3==0){
            menu();
        }else{
            System.out.println("Wrong PIN");
            System.out.print("If, you want to Enter the PIN again Press 1 any other No. to exit.");
            int temp = sc.nextInt();
            if(temp==1){
                checkpin();
            }
            else{
                Exit();
            }
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice");
        System.out.println("Press 1, Check A/C Balance");
        System.out.println("Press 2, To withdraw money");
        System.out.println("Press 3, To Deposit Money");
        System.out.println("Press 4, Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt==1){
            checkBalance();

        }
        else if(opt==2){
            System.out.println("Enter the amount You want to withdraw");
            int amt = sc.nextInt();
            Withdraw(amt);
        }else if(opt==3){
            System.out.println("Enter the amount You want to deposit");
            int amt = sc.nextInt();
            Deposit(amt);
        }else{
            Exit();
        }
    }

    public void checkBalance(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You Availble Account Balance is: " + Balance);
        System.out.println("Press 1 to go to Main Menu again, any other button to EXIT");
            int temp = sc.nextInt();
            if(temp==1){
                checkpin();
            }
            else{
                Exit();
            }
    }
    public void Withdraw(int amt){
        Scanner sc = new Scanner(System.in);
        if(Balance<amt){
            System.out.println("OOPS! Insufficient Balance!");
            System.out.println("Press 1 to go to Main Menu again, any other button to EXIT");
            int temp = sc.nextInt();
            if(temp==1){
                checkpin();
            }
            else{
                Exit();
            }
        }else{
        Balance = Balance-amt;
        System.out.println("Withdrawl Successful! Enjoy.");
        System.out.println("Your availble Account balance is :"+Balance);
        System.out.println("Press 1 to go to Main Menu again, any other button to EXIT");
        int temp = sc.nextInt();
        if(temp==1){
            checkpin();
        }
        else{
            Exit();
        }
        }
    }
    public void Deposit(int amt){
        Scanner sc = new Scanner(System.in);
        Balance=Balance+amt;
        System.out.println("Deposit SuccessFull");
        System.out.println("Your availble Account balance is :"+Balance);
        System.out.println("Press 1 to go to Main Menu again, any other button to EXIT");
        int temp = sc.nextInt();
        if(temp==1){
            checkpin();
        }
        else{
            Exit();
        }
    }
    public void Exit(){
        System.out.println("Thank You For Using the Services:! ");
    }
}
public class main{
    public static void main(String args[]){
        atm obj = new atm();
        obj.checkpin();
    }
}