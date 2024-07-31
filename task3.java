import java.util.Scanner;
class User{
    protected float balance;

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
class ATM extends User{
    
    public float CheckBalance(User obj){
        return obj.balance;
    }
    public void Deposit(float amount, User obj){
        obj.balance+=amount;
    }
    public float Withdraw(float amount, User obj){
        if(amount<=obj.balance){
            obj.balance-=amount;
            return amount;
        }
        else{
            System.out.println("Insufficient Balance!");
            return 0;
        }
    }
}
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating a bank account with balance 10000/- Rupees.");
        User u1 = new User();
        u1.setBalance(10000);
        int loop=1;
        while(loop==1){
            ATM a = new ATM();
            System.out.println("List of operations are: \n1. Display Balance \n2. Withdraw amount \n3. Deposit amount");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Your balance is: "+a.CheckBalance(u1));
            }
            else if(choice==2){
                System.out.print("Enter the amount you want to withdraw: ");
                float amt=sc.nextFloat();
                System.out.println("You withdrew "+ a.Withdraw(amt, u1)+" Rupess!");
                System.out.print("Do you want to display closing balance on screen? \nif yes- Enter 1, if no- Enter any other number: ");

                int BCheck= sc.nextInt();
                if(BCheck==1){
                    System.out.println("Your balance is: "+a.CheckBalance(u1));
                }
            }
            else if(choice==3){
                System.out.print("Enter the amount you want to deposit: ");
                float amt=sc.nextFloat();
                a.Deposit(amt, u1);
                System.out.println("Amount deposited successfully! ");
                System.out.print("Do you want to display closing balance on screen? \nif yes- Enter 1, if no- Enter any other number: ");

                int BCheck= sc.nextInt();
                if(BCheck==1){
                    System.out.println("Your balance is: "+a.CheckBalance(u1));
                }
            }
            else{
                System.out.println("Please enter a valid option number!");
            }
            System.out.print("Do you want to continue? (1 for Yes | Any other number for No):");
            int cont=sc.nextInt();
            if(cont==1){
                loop=1;
            }
            else{
                loop=0;
            }
        }
        System.out.println("Thank you for using our ATM services! \nHave a great day ahead!");


        sc.close();
    }
}
