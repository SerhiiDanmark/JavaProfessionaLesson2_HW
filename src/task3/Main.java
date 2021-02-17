package task3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введіть кількість чисел, які будуть поміщені в список: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("Починайте вводити числа: ");

        List<Integer> list = getIntegerList(input, number);
        System.out.println(list);

        System.out.println("Мінімальне значення списку складає: " + getMinimum(list));
        System.out.println("Максимальне значення списку складає: " + getMaximum(list));

    }

    private static List<Integer> getIntegerList (Scanner input, int number){
        List<Integer> list = new LinkedList<>();
        int value;
        for (int i = 0; i < number; i++) {
            value = input.nextInt();
            list.add(value);
        }
        return list;
    }

    private static int getMinimum (List<Integer> list){
        int minimum = Integer.MAX_VALUE;
        for (Integer minValue: list) {
            if(minValue < minimum){
                minimum = minValue;
            }
        }
        return minimum;
    }

    private static int getMaximum (List<Integer> list){
        int maximum = Integer.MIN_VALUE;
        for (Integer maxValue: list) {
            if(maxValue > maximum){
                maximum = maxValue;
            }
        }
        return maximum;
    }
    
}
