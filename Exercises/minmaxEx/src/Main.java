//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    boolean character = true;
    boolean hatEingabe = false;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    do {
        try {
            if (hatEingabe == true) {
                System.out.println("Minimum number is: "+min+" and Maximum number is: "+max);
            }

            System.out.println("Give any number and if you want to quit type a character");
            String input = sc.nextLine();


            int zahl = Integer.parseInt(input);
            if (zahl >= max) {
                max = zahl;
                hatEingabe = true;
            }
            if(zahl <= min){
                min = zahl;
            }


        }catch(NumberFormatException wrn) {
            character = false;
        }

    }while(character);
}
