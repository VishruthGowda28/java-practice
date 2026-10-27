public class Account {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public static void main(String args[]) {
        Account acc = new Account();
        System.out.println("Balance: " + acc.getBalance());
    }
}
