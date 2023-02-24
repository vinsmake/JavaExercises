public class CreateUser {
    public static void main(String[] args) {
        User vinsmakeUser = new User();
        User vinsmakeUser2 = new User();
        User vinsmakeUser3 = new User();


        
        vinsmakeUser.getAccount().getClient().setName("Enrique"); //set the name in the user client
        vinsmakeUser.getAccount().getClient().setName("Emmanuel"); //set the name in the user account client
        vinsmakeUser.getAccount().setAgency(481516);

        System.out.println(vinsmakeUser.getAccount().getClient().getName() + vinsmakeUser.getAccount().getAgency());

        System.out.println(vinsmakeUser.getAccount().getClient().getName());



        System.out.println(vinsmakeUser.getNumber());
        System.out.println(vinsmakeUser2.getNumber());
        System.out.println(vinsmakeUser3.getNumber());
        System.out.println("there are " + User.getTotal() + " Accounts created");
    }
}
