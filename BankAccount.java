public class BankAccount {
    private ATM atm;

    public BankAccount(double initialBalance) {
        this.atm = new ATM(initialBalance);
    }

    public ATM getAtm() {
        return atm;
    }
}
