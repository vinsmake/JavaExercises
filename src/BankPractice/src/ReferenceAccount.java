public class ReferenceAccount {
    public static void main(String[] args) {
        Client vinsmakeClient = new Client();
        vinsmakeClient.name = "Vinsmake";
        vinsmakeClient.document = "4815162342";
        vinsmakeClient.phone = "3336610692";

        Account vinsmakeAccount = new Account();
        vinsmakeAccount.client = vinsmakeClient; //access to an object insite an object. Makes that object reference to another class
        System.out.println(vinsmakeAccount.client.name);
    }
}
