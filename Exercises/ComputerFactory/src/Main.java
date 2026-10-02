//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ComputerCase computerCase = new ComputerCase("2208","Dell","240");
    Monitor monitor = new Monitor("27 inch Beast","Samsung", 27,"3600 x 1440");
    Motherboard motherboard = new Motherboard("BJ-100", "AMD", 4, 6, "v2.5");

    PersonalComputer thePC = new PersonalComputer("2208", "Dell", computerCase,monitor,motherboard);

    /*thePC.getMonitor().drawPixelAt(10,10,"red");
    thePC.getMotherboard().loadProgram("Windows OS");
    thePC.getComputerCase().pressPowerButton();
     */

    thePC.powerUp();
}
