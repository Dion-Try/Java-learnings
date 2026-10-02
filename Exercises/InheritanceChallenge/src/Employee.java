public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, String endDate, long employeeId, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    public Employee(){
        super("Rahel","12/09/1955","02/07/2027");
        this.employeeId = 100;
        this.hireDate = "22/07/2025";
    }

    @Override
    public String toString() {
        return super.toString()+  " ID: "+employeeId + ", hired on this date:"+hireDate;
    }
}
