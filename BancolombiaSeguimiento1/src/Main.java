import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bancolombia bancolombia= new Bancolombia();
        Scanner lect= new Scanner(System.in);
        int turn=1;
        boolean entry=false;
        int answEntry;
        while (!entry) {
            System.out.println(" \n give turn <1>");
            System.out.println("\n show actual turn <2>");
            System.out.println("\n pass turn <3>");
            System.out.println("\n eliminate actual turn and pass <4>");
            System.out.println("\n get out <5>");
            answEntry= lect.nextInt();

            switch (answEntry) {

                case 1:
                    System.out.println("Enter the name of the person");
                    String name= lect.nextLine();
                    lect.nextLine();
                    bancolombia.addLast(new Person (turn,name));
                    turn+=1;
                    break;
                case 2:
                    bancolombia.actualTurn();
                    break;
                case 3:
                    bancolombia.pass();
                    break;
                case 4:
                    System.out.println("Enter the turn you want to eliminate");
                    int turnToDelete=lect.nextInt();
                    bancolombia.deletebyturn(turnToDelete);
                    System.out.println("---------------------");

                    break;
                case 5:
                    entry=false;
                    break;
            }}
    }
}
