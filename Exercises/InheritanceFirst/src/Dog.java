public class Dog extends Animal {

    private String earShape;
    private String tailShape;
    public Dog(String type, double weight){
        this(type,weight, "perky", "curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15? "small": (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    private void bark(){
        System.out.print("Woof");
    }

    private void run(){
        System.out.print("Dog running");
    }
}
