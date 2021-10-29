package Elections.Party;

import Elections.Fraction.FractionType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PartyBuilder {

    private static FractionType partyType = null;
    static Scanner in = new Scanner(System.in);

    public static void addParty(List<Party> list) throws ParseException {
        System.out.println("Введите название политической партии: ");
        String nameOfParty = setPartyName();
        System.out.println("Какой фракции принадлежит партия: 1 - Левая, 2 - Правая, 3 - Центр.");
        FractionType partyType = setPartyType(Integer.parseInt(in.nextLine()));
        System.out.println("Введите дату создания партии в формате ДД.ММ.ГГГГ");
        Date dateOfCreationParty = getDateOfCreationParty(in.nextLine());
        list.add(new Party(nameOfParty, partyType, dateOfCreationParty));
    }

    private static String setPartyName() {
        String name;
        do {
            name = in.nextLine();
        } while (name.trim().isEmpty());
        return name;
    }

    private static FractionType setPartyType(int numberOfParty) {
        if (numberOfParty != 1 && numberOfParty != 2 && numberOfParty != 3) {
            System.out.println("Введите значение от 1 до 3. 1 - Левая, 2 - Правая, 3 - Центр.");
            setPartyType(Integer.parseInt(in.nextLine()));
        } else {
            switch (numberOfParty) {
                case 1 -> partyType = FractionType.LEFT;
                case 2 -> partyType = FractionType.RIGHT;
                case 3 -> partyType = FractionType.CENTER;
            }
        }
        return partyType;
    }

    private static Date getDateOfCreationParty(String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return simpleDateFormat.parse(date);
    }
}
