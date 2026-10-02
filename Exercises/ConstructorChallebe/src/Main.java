import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Scanner input = new Scanner(System.in);

    System.out.println("Enter your name and email please: ");
    String name = input.next();
    String email = input.next();

    Customer customer = new Customer(name,4000,email);
    System.out.println(customer.getName());
    System.out.println(customer.getCreditLimit());
    System.out.println(customer.getEmail());

    Customer Dion = new Customer("Dion","someEmail");
    System.out.println(Dion.getName());
    System.out.println(Dion.getEmail());
    System.out.println(Dion.getCreditLimit());

    Customer someGuy = new Customer();
    System.out.println(someGuy.getName());
    System.out.println(someGuy.getEmail());
    System.out.println(someGuy.getCreditLimit());
}
