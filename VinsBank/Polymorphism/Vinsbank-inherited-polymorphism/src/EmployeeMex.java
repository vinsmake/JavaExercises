public class EmployeeMex extends Employee {
    private String passport;
    private String state;
    private String country;


    public String getPassport() {
        return this.passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getBonus() {
        return super.getSalary() * 0.3;
    }

    
}