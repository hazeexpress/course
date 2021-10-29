package Elections.Precinct;

import Elections.Voter.Voter;
import Elections.Voter.VoterBuilder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class PrecinctBuilder {

    static Scanner in = new Scanner(System.in);
    static int index;
    static String address;
    static PrecinctType typeOfPrecinct;
    static List<Voter> acceptedVoters = new ArrayList<>();
    static double proportionOfVoters;

    public static void getPrecincts(List<Precinct> precinctList, List<Voter> voterList) {
        System.out.println("1. Добавить избирателя.");
        System.out.println("2. Удалить избирателя.");
        System.out.println("3. Вывести список избирателей на данном участке.");
        switch (Integer.parseInt(in.nextLine())) {
            case 1 -> VoterBuilder.addVoter(voterList);
            case 2 -> VoterBuilder.delVoter(voterList);
            case 3 -> System.out.println(voterList.isEmpty() ? "Список избирателей пуст!" : voterList);
        }
    }

    public static void addPrecinct(List<Precinct> precinctList, List<Voter> voterList) {
        index = setIndex(precinctList);
        address = setAddress();
        getAcceptedVoters(voterList);
        getProportionOfVoters(voterList);
        System.out.println("Выберите тип участка: 1 - Обычный, 2 - для граждан на карантине, 3 - для военных или работников спецслужб.");
        switch (Integer.parseInt(in.nextLine())) {
            case 1 -> typeOfPrecinct = PrecinctType.NORMAL;
            case 2 -> typeOfPrecinct = PrecinctType.QUARANTINE;
            case 3 -> typeOfPrecinct = PrecinctType.MILITARY;
            default -> System.out.println("Выберите тип от 1 до 3.");
        }
        precinctList.add(new Precinct(index, address, acceptedVoters, proportionOfVoters, typeOfPrecinct));
    }

    private static int setIndex(List<Precinct> list) {
        System.out.println("Введите уникальный номер участка: ");
        int numberPrecinct = Integer.parseInt(in.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIndex() == numberPrecinct) {
                System.out.println("Введенное значение не уникально! Введите уникальное значение.");
                setIndex(list);
            }
        }
        return numberPrecinct;
    }

    private static String setAddress() {
        System.out.println("Введите адрес участка: ");
        String address;
        do {
            address = in.nextLine();
        } while (address.trim().isEmpty());
        return address;
    }

    private static List<Voter> getAcceptedVoters(List<Voter> list) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for(int i = 0; i < list.size(); i++) {
            if ((currentYear - list.get(i).getYearOfBirth()) >=  18) {
                acceptedVoters.add(list.get(i));
            }
        }
        return acceptedVoters;
    }

    private static double getProportionOfVoters(List<Voter> list) {
        proportionOfVoters = (float)(acceptedVoters.size() * 100 / list.size());
        return proportionOfVoters;
    }
}
