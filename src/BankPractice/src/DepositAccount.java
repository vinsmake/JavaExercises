public class DepositAccount {
    public static void main(String[] args) {
        Account vinsmakeAccount = new Account();

        vinsmakeAccount.deposit(5000); //deposite
        System.out.println("The balance of this account is: " + vinsmakeAccount.balance);

        vinsmakeAccount.withdraw(400); //withdraw
        System.out.println("The balance of this account is: " + vinsmakeAccount.balance);
    }
}
