package Elections;

import java.util.List;
import java.util.Scanner;

public class VoterBuilder {
    static Scanner in = new Scanner(System.in);

    public static void addVoter(List<Voter> list) {
        System.out.println("Введите имя избирателя: ");
        String name = in.nextLine();
        System.out.println("Введите номер паспорта избирателя: ");
        String passNumber = in.nextLine();
        System.out.println("Введите ИНН избирателя: ");
        long inn = Integer.parseInt(in.nextLine());
        System.out.println("Введите год рождения избирателя: ");
        int yearOfBirth = Integer.parseInt(in.nextLine());
        System.out.println("Введите избирательный участок: ");
        int precinct = Integer.parseInt(in.nextLine());
        System.out.println("Является ли избиратель военным или сотрудником спецслужб: 1 - Да, 2 - Нет.");
        boolean ifMilitary = Integer.parseInt(in.nextLine()) == 1;
        System.out.println("Находится ли избиратель на карантине: 1 - Да, 2 - Нет.");
        boolean ifOnQuarantine = Integer.parseInt(in.nextLine()) == 1;
        list.add(new Voter(name, passNumber, inn, yearOfBirth, precinct, ifMilitary, ifOnQuarantine));
    }

    public static void delVoter(List<Voter> list) {
        if (list.size() > 0) {
            System.out.println("Укажите порядковый номер избирателя, которого хотите удалить: ");
            list.remove(Integer.parseInt(in.nextLine()));
        } else {
            System.out.println("Список избирателей пуст!");
        }
    }
}
