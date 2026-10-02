public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes()
    {
        if (hasWorkToDo) {
            System.out.println("Washing the dishes");
            hasWorkToDo = false;
        }
    }


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
