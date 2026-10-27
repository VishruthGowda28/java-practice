public class Account {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        balance += amount;
    }

    public static void main(String args[]) {
        Account acc = new Account();
        System.out.println("Balance: " + acc.getBalance());
        acc.setBalance(500);
        System.out.println("Updated Balance: " + acc.getBalance());
    }
}
