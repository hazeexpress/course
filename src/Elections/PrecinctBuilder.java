package Elections;

import java.util.List;
import java.util.Scanner;

public class PrecinctBuilder {

    public static void addPrecinct(List<Precinct> list) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уникальный номер участка: ");
        int index = in.nextInt();
        System.out.println("Введите адрес участка: ");
        String address = in.nextLine();
        System.out.println("Выберите тип участка: 1 - Обычный, 2 - для граждан на карантине, 3 - для военных или работников спецслужб.");
        int typeOfPrecinct;
        switch (in.nextInt()) {
            case 1 -> typeOfPrecinct = 1;
            case 2 -> typeOfPrecinct = 2;
            case 3 -> typeOfPrecinct = 3;
            default -> System.out.println("Выберите тип от 1 до 3.");
        }
    }
}
