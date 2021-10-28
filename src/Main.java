import Elections.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    List<Election> electionsList = new ArrayList<>();
    List<Voter> voterList = new ArrayList<>();
    List<Precinct> precinctsList = new ArrayList<>();
    List<Party> partiesList = new ArrayList<>();


    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        boolean f = true;
        while (f) {
            System.out.println("Make your choice...");
            System.out.println("1. Add precinct.");
            System.out.println("2. Add citizen.");
            System.out.println("3. Add party.");
            System.out.println("4. Select citizen as a candidate.");
            System.out.println("5. Show all precincts.");
            System.out.println("6. Show all citizen's.");
            System.out.println("7. Show all parties.");
            System.out.println("8. Run elections.");
            System.out.println("9. Show election results.");
            System.out.println("10. Out of program.");
            int menuChoice = in.nextInt();
            switch (menuChoice) {
                case 1 -> PrecinctBuilder.addPrecinct(precinctsList);
                case 2 -> VoterBuilder.addVoter(voterList);
                case 3 -> PartyBuilder.addParty(partiesList);
                case 4 -> viewList(partiesList);
                case 5 -> System.out.println("test");
                case 6 -> System.out.println("test");
                case 7 -> System.out.println("test");
                case 8 -> System.out.println("test");
                case 9 -> System.out.println("test");
                case 10 -> f = false;
                //case 3 -> System.out.println(electorList);
            }
        }
    }

    private void viewList(List<Party> list) {
        System.out.println(list);
    }
}
