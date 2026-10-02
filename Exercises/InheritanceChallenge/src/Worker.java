public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;
    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        int birth = Integer.parseInt(birthDate.substring(6));
        int now = java.time.LocalDate.now().getYear();
        int age = now - birth;
        return age;
    }

    public double collectPay(){
        return 0;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return name + ", " + birthDate + ", " + endDate;
    }
}
