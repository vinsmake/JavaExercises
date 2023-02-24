public class Vinsbank {
    public static void main(String[] VinsBankString) {

        Account vinsmakeAccount = new Account(); //creates a new object with the class Account

        Account amandaAccount = new Account();
        Client vinsmakeClient = new Client(); //Creates a new object with the class Client

        vinsmakeAccount.deposit(2000); //deposit to the account
        System.out.println("This account have: " + vinsmakeAccount.getBalance());

        vinsmakeAccount.withdraw(1000); //withdraw to the account
        System.out.println("This account have: " + vinsmakeAccount.getBalance());

        vinsmakeAccount.transfer(500, amandaAccount); //deposit to the account
        System.out.println("This account have: " + vinsmakeAccount.getBalance());
        System.out.println("The transfered account have: " + amandaAccount.getBalance());

        vinsmakeAccount.client = vinsmakeClient; //references the client object inside account with the client object created above.
        amandaAccount.client = new Client(); //creates a object insite the object with the reference

        User eddyUser = new User();
        eddyUser.client.name = "Eduardo";
        eddyUser.account.deposit(4000);
        System.out.println("The user " + eddyUser.client.name + " have " + eddyUser.account.getBalance());

        eddyUser.account.deposit(500);
        System.out.println("The user " + eddyUser.client.name + " have " + eddyUser.account.getBalance());

        vinsmakeAccount.setAgency(481516);
        System.out.println("vinsmake agency is: " + vinsmakeAccount.getAgency());

    }
}