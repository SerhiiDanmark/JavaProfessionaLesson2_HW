package additionalTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> carModels = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String model;
        String end = "end";

        System.out.println("Введіть марки автомобілей, які Ви знаєте: ");

        for (int i = 0; i < 10; i++) {

            model = input.next();

            if (model.equalsIgnoreCase(end)) {
                break;
            }
            carModels.add(model);

        }
    }
}
