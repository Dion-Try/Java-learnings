//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    HourlyEmployee dion = new HourlyEmployee("Dion", "05/12/1998", "", 1, "01/01/2024", 25.0);
    Worker def = new Worker("Markus","11/04/1999","02/07/2027");
    SalariedEmployee Rahel = new SalariedEmployee(100900);

    System.out.println(dion);
    System.out.println(dion.getDoublePay());
    System.out.println(dion.collectPay());
    System.out.println(Rahel);
    System.out.println(Rahel.getAge());
    System.out.println("Following Salary: "+Math.round(Rahel.collectPay()));
}
