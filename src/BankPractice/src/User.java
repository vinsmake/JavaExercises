public class User {
    private String username;
    private String password;
    private int number;
    private Account account = new Account();

    private static int accountCounter = 0; //makes it independient of the "new" instance
    public User(){
        accountCounter++;
        System.out.println("there are " + accountCounter + " accounts");
        this.number = accountCounter; //gives the account number = number of accounts created
    }

    //account///////////////
    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public int getNumber() {
        return number;
    }

    public static int getTotal() { //returns the total of accounts created
        return User.accountCounter;
    }
}
