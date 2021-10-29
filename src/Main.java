import Elections.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    List<Election> electionsList = new ArrayList<>();
    List<Voter> voterList = new ArrayList<>();
    List<Precinct> precinctsList = new ArrayList<>();
    List<Party> partiesList = new ArrayList<>();


    public static void main(String[] args) throws ParseException {
        Main main = new Main();
        main.run();
    }

    private void run() throws ParseException {
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
                case 1 -> PrecinctBuilder.addPrecinct(precinctsList, voterList);
                case 2 -> VoterBuilder.addVoter(voterList);
                case 3 -> PartyBuilder.addParty(partiesList);
                case 4 -> System.out.println("test");
                case 5 -> PrecinctBuilder.getPrecincts(precinctsList, voterList);
                case 6 -> viewList(voterList);
                case 7 -> viewList(partiesList);
                case 8 -> System.out.println("test");
                case 9 -> System.out.println("test");
                case 10 -> f = false;
            }
        }
    }

    private void viewList(List list) {
        System.out.println(list.size() > 0 ? list : "---> List is empty!");
    }
}
