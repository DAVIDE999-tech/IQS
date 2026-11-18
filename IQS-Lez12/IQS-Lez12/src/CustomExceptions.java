public class CustomExceptions {
    public static void main(String[] args) {
        BankAccount1 bankAccount = new BankAccount1(2000.0);
        bankAccount.deposit(100);
        bankAccount.withdraw(3000);
        System.out.println(bankAccount.getBalance());
    }
}
