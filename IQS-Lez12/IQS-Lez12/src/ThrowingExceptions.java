public class ThrowingExceptions {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(2000.0);
        bankAccount.deposit(100);
        bankAccount.withdraw(3000);
        System.out.println(bankAccount.getBalance());
    }
}
