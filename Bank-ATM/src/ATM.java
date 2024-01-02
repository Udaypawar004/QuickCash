public class ATM {
    private double balance;
    private double withdrawBalance;
    private double depositeBalance;

    public ATM() {

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawBalance() {
        return withdrawBalance;
    }

    public void setWithdrawBalance(double withdrawBalance) {
        this.withdrawBalance = withdrawBalance;
    }

    public double getDepositeBalance() {
        return depositeBalance;
    }

    public void setDepositeBalance(double depositeBalance) {
        this.depositeBalance = depositeBalance;
    }
}
