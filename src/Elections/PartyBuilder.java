package Elections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PartyBuilder {

    public static void addParty(List<Party> list) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название политической партии: ");
        String nameOfParty = in.nextLine();
        System.out.println("Какой фракции принадлежит партия: 1 - Левая, 2 - Правая, 3 - Центр.");
        FractionType partyType = null;
        switch (Integer.parseInt(in.nextLine())) {
            case 1 -> partyType = FractionType.LEFT;
            case 2 -> partyType = FractionType.RIGHT;
            case 3 -> partyType = FractionType.CENTER;
        }
        System.out.println("Введите дату создания партии в формате ДД.ММ.ГГГГ");
        String strDateOfCreationParty = in.nextLine();
        Date dateOfCreationParty = getDateOfCreationParty(strDateOfCreationParty);
        list.add(new Party(nameOfParty, partyType, dateOfCreationParty));
    }

    public static Date getDateOfCreationParty(String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dateOfCreationParty = null;
        try {
            dateOfCreationParty = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateOfCreationParty;
    }
}
