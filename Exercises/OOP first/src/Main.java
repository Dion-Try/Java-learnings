//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //BankAcc BobsAcc = new BankAcc(1234,1000, "Bob", "dd@gmail", "078 408 7070");
    //BankAcc BobsAcc = new BankAcc();

    //BobsAcc.deposit(50);
    //BobsAcc.withdraw(100);

    Customer Dion = new Customer("Dion","someEmail");
    System.out.println(Dion.getName());
    System.out.println(Dion.getEmail());
    System.out.println(Dion.getCreditLimit());

    Customer someGuy = new Customer();
    System.out.println(someGuy.getName());
    System.out.println(someGuy.getEmail());
    System.out.println(someGuy.getCreditLimit());
}
