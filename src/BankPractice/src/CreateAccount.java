public class CreateAccount {
    public static void main(String[] args) {
        //first account
        //variable o referencia = valor
        Account vinsmakeAccount = new Account(); //creates a new object Account
        vinsmakeAccount.balance = 1000; //access to the balance of the new account
        System.out.println(vinsmakeAccount + " balance is: " + vinsmakeAccount.balance);


        Account vinsmakeAccount2 = vinsmakeAccount; //references a new account
        vinsmakeAccount2.balance += 400;

        System.out.println(vinsmakeAccount + " balance is: " + vinsmakeAccount.balance);
        System.out.println(vinsmakeAccount2 + " balance is: " + vinsmakeAccount2.balance);



        //seccond account
        Account amandaAccount = new Account();
        amandaAccount.balance = 500;
        System.out.println(amandaAccount.balance);
    }
}
