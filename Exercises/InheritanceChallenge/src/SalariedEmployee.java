public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    public SalariedEmployee(double annualSalary) {

        this.annualSalary = annualSalary;
    }

    public void retire(){
        if(getAge() > 65){isRetired = true;}
        else{isRetired = false;}
    }

    @Override
    public double collectPay() {
        retire();
        double salary = annualSalary/12;
        return isRetired ? salary * 0.4 : salary;
    }
}
