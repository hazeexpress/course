package Elections;

import java.util.List;
import java.util.Scanner;

public class VoterBuilder {


    public static void addVoter(List<Voter> list) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя избирателя: ");
        String name = in.nextLine();
        System.out.println("Введите номер паспорта избирателя: ");
        int passNumber = in.nextInt();
        System.out.println("Введите ИНН избирателя: ");
        int inn = in.nextInt();
        System.out.println("Введите год рождения избирателя: ");
        int yearOfBirth = in.nextInt();
        System.out.println("Введите избирательный участок: ");
        int precinct = in.nextInt();
        System.out.println("Является ли избиратель военным или сотрудником спецслужб: 1 - Да, 2 - Нет.");
        boolean ifMilitary = in.nextInt() == 1;
        System.out.println("Находится ли избиратель на карантине: 1 - Да, 2 - Нет.");
        boolean ifOnQuarantine = in.nextInt() == 1;
        list.add(new Voter(name, passNumber, inn, yearOfBirth, precinct, ifMilitary, ifOnQuarantine));
    }
}
