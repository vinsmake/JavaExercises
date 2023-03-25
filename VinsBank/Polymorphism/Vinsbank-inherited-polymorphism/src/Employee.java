public class Employee {
        private String name;
        private String documentId;
        private double salary;
        private String position;
        private String username;
        private String password;

        public Employee() {
            
        }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentId() {
        return this.documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public double getBonus() {
/*         switch(this.position){ 
            case "employee":
                return this.salary * 0.1;
            case "manager":
                return this.salary * 0.8;
            case "accountant":
                return this.salary * 0.3;
            case "storer":
                return this.salary * 0.5;
            default: 
            return 0; */
            return this.salary * 0.1;
        }
    



    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public boolean logIn(){
        return password == "myPassword"; //if password is myPassword, log in, else, false
    }

}