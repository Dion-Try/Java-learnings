//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Animal animal = new Animal("Generic", "huge", 500);
    doAnimalStuff(animal, "slow");

    Dog lucky = new Dog("Lucky", 10);
    doAnimalStuff(lucky, "fast");

    Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
    doAnimalStuff(goldie, "fast");
}

public static void doAnimalStuff(Animal animal, String speed){
    animal.makeNoise();
    animal.move(speed);
    System.out.println(animal);
    System.out.println("_ _ _ _");
}