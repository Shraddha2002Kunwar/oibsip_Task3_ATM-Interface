/**
 * ATM_Complete_Project
 */

package ATM;
import java.util.*;

public class AtmMachine {
    public static void main(String[] args) {

        int pin = 1234;
        int balance = 10000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;

        Scanner scanner = new Scanner(System.in);

        //We have to take an input by an user
        System.out.println("Enter your pin number : ");

        int password = scanner.nextInt();

        if(password == pin)
        {
            System.out.println("Enter your name: ");
            name = scanner.next();
            System.out.println("Welcome "+ name);

            while(true)
            {
                System.out.println("press 1 to check your balance");
                System.out.println("press 2 to add amount");
                System.out.println("press 3 to take amount");
                System.out.println("press 4 to take receipt");
                System.out.println("press 5 to Exit");

                int opt = scanner.nextInt();
                switch(opt)
                {
                    case 1:
                        System.out.println(" your current balance is "+ balance);
                        break;
                    case 2:
                        System.out.println("How much amount did you want to ADD to your account");
                        AddAmount = scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance = AddAmount + balance ;
                                //10000 = 100 + 10000
                               //balance = 10100
                        break;
                    case 3:
                        System.out.println("How much amount did you want to take ");
                        TakeAmount = scanner.nextInt();
                        if(TakeAmount > balance)
                        {
                            System.out.println("Your balance is insufficient");
                            System.out.println("try less than your available balance");
                        }
                        else{
                            System.out.println("Successfully taken");
                            balance = balance - TakeAmount;
                            //balance = 10100= 10100 - 100
                            //balance = 10000
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to All in one mini ATM");
                        System.out.println("Available balance is "+ balance);
                        System.out.println("Amount deposited    "+AddAmount);
                        System.out.println("Amount taken           "+TakeAmount);
                        System.out.println("Thanks for Coming");

                    break;
                    default:
                        System.out.println("press the number below 5 ");
                        break;
                }
                if(opt == 5)
                {
                    System.out.println("Thank You");
                    break;
                }
            }
        }
        else
        {
            System.out.println("Wrong Pin Number");
        }

    }
}
