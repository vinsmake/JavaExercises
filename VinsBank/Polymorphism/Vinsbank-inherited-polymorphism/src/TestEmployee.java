public class TestEmployee {
    public static void main(String[] args) {
        EmployeeMex mexican = new EmployeeMex();
        mexican.setName("mexican");
        mexican.setDocumentId("481516");
        mexican.setSalary(21000);
        mexican.setPosition("mexican");
        mexican.setPassword("myPassword");
        mexican.setPassport("PASE020399");
        
        Employee enrique = new Employee();
        enrique.setName("Enrique");
        enrique.setDocumentId("481516");
        enrique.setSalary(21000);
        enrique.setPosition("manager");
        enrique.setPassword("myPassword");


        System.out.println(mexican.getName() + mexican.getDocumentId() + mexican.getSalary());
        System.out.println("This " + mexican.getPosition() + " have a bonus of: " + mexican.getBonus());
        System.out.println(mexican.getName() + " passport is: " + mexican.getPassport());
        System.out.println(mexican.logIn());

        System.out.println(enrique.getBonus());
        System.out.println(mexican.getBonus());
    }
}
