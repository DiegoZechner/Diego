import java.util.*;
public class ATM {
    public static void main(String[] args) {

        int balance = 0000, withdraw,deposite,num;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome to your ATM of trust Maria");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposite");
            System.out.println("3.Check Balance");
            System.out.println("4.LEAVE");
            num = sc.nextInt();

            switch (num)
            {
                case 1:
                    System.out.println("Enter Amount to withdraw");
                    withdraw = sc.nextInt();
                    if(balance>=withdraw)
                    {
                        balance = balance-withdraw;
                        System.out.println("Balance Amount is: "+balance);
                        System.out.println("Please collect money");
                    }
                    else{
                        System.out.println("You do not have that much money, to withdraw.");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Enter Amount to deposite");
                    deposite = sc.nextInt();
                    balance = balance+deposite;
                    System.out.println("Balance Amount is: "+balance);
                    System.out.println("    ");
                    break;
                case 3:
                    System.out.println("Balance of my Account is:   "+balance);
                    System.out.println("    ");
                    break;
                case 4:
                    System.exit(0);
                    System.out.println("    ");



            }



        }
    }
}
