import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOprationInterf {
    Map<Double, String> miniStmt = new HashMap<>();
    ATM atm = new ATM();
    @Override
    public void viewBalance() {
        System.out.print("Your Balance is : $" + atm.getBalance());
    }

    @Override
    public void withdrawBalance(double withdrawBalance) {
        System.out.println("Collect cash : $" + withdrawBalance);
        if (atm.getBalance() >= withdrawBalance) {
            miniStmt.put(withdrawBalance, " Amount Withdrawn");
            atm.setBalance(atm.getBalance() - withdrawBalance);
        }
        else {
            System.out.println("Insufficient Balance !!");
        }
        viewBalance();
    }

    @Override
    public void depositBalance(double depositeBalance) {
        miniStmt.put(depositeBalance, " Amount deposited.");
        System.out.println("$" + depositeBalance + " Deposited Successfully");
        atm.setBalance(atm.getBalance() + depositeBalance);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String> m: miniStmt.entrySet()) {
            System.out.println("\n" + m.getKey() + " " + m.getValue());
        }
    }
}
