//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    for (int i = 1; i <= 5 ;i++ ) {
        DMOStudent s = new DMOStudent("S12000" + i,
                switch (i){
            case 1 -> "Tim";
            case 2 -> "Michi";
            case 3 -> "Alex";
            case 4 -> "Luke";
            case 5 -> "halis";
            default -> "anonymous";
                },
                "14/04/2000",
                "DuMo Lernen"
        );
        System.out.println(s);
    }

    Student pojostudent = new Student("S13001","didi","11/06/2001","DuMo Lernen");
}
