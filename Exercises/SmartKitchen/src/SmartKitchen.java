public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker(false);
        iceBox = new Refrigerator(false);
        dishWasher = new DishWasher(false );
    }

    public void addWater(){
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk(){
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeWork, boolean washing, boolean cooling){
        brewMaster.setHasWorkToDo(coffeeWork);
        dishWasher.setHasWorkToDo(washing);
        iceBox.setHasWorkToDo(cooling);
    }

    public void doKitchenWork(){
        iceBox.orderFood();
        dishWasher.doDishes();
        brewMaster.brewCoffee();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}
