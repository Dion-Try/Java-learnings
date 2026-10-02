//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    SmartKitchen smartKitchen = new SmartKitchen();
    CoffeeMaker jura = new CoffeeMaker(false);
    DishWasher cleaner = new DishWasher(false);



    smartKitchen.setKitchenState(true,true,false);


    smartKitchen.getBrewMaster().brewCoffee();
}
