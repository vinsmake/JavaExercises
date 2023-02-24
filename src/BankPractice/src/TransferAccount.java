public class TransferAccount {
    public static void main(String[] args) {
        Account vinsmakeAccount = new Account();
        Account amandaAccount = new Account();

        //deposite
        vinsmakeAccount.deposit(5000); 
        System.out.println("The balance of this account is: " + vinsmakeAccount.balance);

        //withdraw
        boolean canWithdraw = vinsmakeAccount.withdraw(6000); 
        if (canWithdraw) {
            System.out.println("You have withdrawed, the new balance of this account is: " + vinsmakeAccount.balance);
        } else {
            System.out.println("You can't withdraw, your balance is: " + vinsmakeAccount.balance);
        }

        //transfer
        boolean canTransfer = vinsmakeAccount.transfer(300, amandaAccount);
        if (canTransfer){
        System.out.println("The new balance of vinsmake account is: " + vinsmakeAccount.balance);
        System.out.println("The new balance of amandas account is: " + amandaAccount.balance);
    } else {
        System.out.println("You can't transfer, the balance of vinsmake account stills: " + vinsmakeAccount.balance);
    }}
}
