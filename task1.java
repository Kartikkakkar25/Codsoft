import java.util.Random;
import java.util.Scanner;
public class task1{
    public static void main(String args[]){
        Random rdm = new Random();
        Scanner sc = new Scanner(System.in);
        int final_score=0;
        int l=1;
        int h=100;
        int record=0;
        int round=1;
        while(round==1){
            record+=1;
            int rint = rdm.nextInt(h-l)+l;
            int chance=5;
            int Score=5;
            while(chance>0){
                System.out.print("Enter Your Guess in integer value: ");
                int guess= sc.nextInt();
                if(guess==rint){
                    System.out.println("You got the right answer!");
                    final_score=final_score+Score;
                    break;
                }
                else{
                    int dif=Math.abs(guess-rint);
                    if(guess>rint){
                        if(dif>10){
                            System.out.println("Your guess is too high!");
                            chance=chance-1;
                            Score=Score-1;
                        }
                        else{
                            System.out.println("Your Guess is high!");
                            chance=chance-1;
                            Score=Score-1;
                        }
                    }
                    if(guess<rint){
                        if(dif>10){
                            System.out.println("Your guess is too low!");
                            chance=chance-1;
                            Score=Score-1;
                        }
                        else{
                            System.out.println("Your Guess is low!");
                            chance=chance-1;
                            Score=Score-1;
                        }
                    }
                }
            }
            System.out.println("Your this round score is: "+Score);
            System.out.println("The Number generated was: "+rint);
            int y=0;
            while(y==0){
                System.out.print("Do you want to play more rounds? (0 for No | 1 for Yes): ");
                int x=sc.nextInt();
                if(x>1||x<0){
                    System.out.println("Please enter a valid number!");
                }
                else{
                    round=x;
                    y=1;
                }
            }
        }
        System.out.println("Your final Score of "+record+" rounds is: "+ final_score);
        System.out.println("Thank You for Playing this game! ");    
        sc.close();
    }
}
