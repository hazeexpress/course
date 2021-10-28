package Elections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectionBuilder {


    public static void addElection(List<Election> list) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число начала выборов: ");
        int day = in.nextInt();
        System.out.println("Введите месяц начала выборов: ");
        int month = in.nextInt();
        System.out.println("Введите год начала выборов: ");
        int year = in.nextInt();
        list.add(new Election(day, month, year));
    }

}
