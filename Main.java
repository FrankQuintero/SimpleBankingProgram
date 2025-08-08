import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        double balance = 0;

        boolean isRunning = true;
        int choice;

        while(isRunning){
            
            System.out.println("-----------------");
            System.out.println(" Banking Program");
            System.out.println("-----------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("-----------------");

            System.out.print("Enter your choice (1-4): ");
            choice = scan.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }
        
        System.out.println("Thank you for making service with us!");
        

        scan.close();
    }

    public static void showBalance(double balance){
        System.out.println("-----------------");
        System.out.printf("$%.2f\n", balance);
        System.out.println("-----------------");
    }

    public static double deposit(){
        double amount;

        System.out.print("Enter amount to be deposited: ");
        amount = scan.nextDouble();
        if(amount < 0){
            System.out.print("Amount cant be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    public static double withdraw(double balance){
        double amount;

        System.out.print("Enter Amount to be withdrawn: ");
        amount = scan.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient funds");
            return 0;
        }
        else if(amount < 0){
            System.out.print("Amount cant be negative");
            return 0;
        }
        else{ 
            return amount;
        }
    }

}