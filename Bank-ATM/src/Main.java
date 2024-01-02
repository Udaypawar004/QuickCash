import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int atmNumber = 12345;
        int atmPin = 123;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ATM Number: ");
        int enterredNumber = sc.nextInt();
        System.out.print("Enter your ATM Pin: ");
        int enterredPin = sc.nextInt();

        if (enterredNumber == atmNumber && enterredPin == atmPin) {
            options();
        }
        else {
            System.out.println("Invalid ATM number or Pin. Please Try Again!!");
            System.exit(0);
        }
    }

    private static void options() {
        AtmOprationInterf op = new AtmOperationImpl();
        Scanner sc = new Scanner (System.in);
        while (true) {
            System.out.print("\n Welcome to ATM Interface");
            System.out.println("\n 1. View Balance \n 2. Withdraw Amount \n 3. Deposit Amount \n 4. View Mini Statement \n 0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    op.viewBalance();
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    int amount = sc.nextInt();
                    if(amount % 500 == 0) {
                        op.withdrawBalance(amount);
                    }
                    else {
                        System.out.println("Multiple of 500 can only withdrawable" + "\n please try again!!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Deposite Amount: ");
                    double depositAmount = sc.nextDouble();
                    op.depositBalance(depositAmount);
                    break;

                case 4:
                    System.out.print("Viewing Mini Statement !!");
                    op.viewMiniStatement();
                    break;

                case 0:
                    System.out.println("Thankyou for using our service !!");
                    System.exit(0);
            }
        }
    }
}