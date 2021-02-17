package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            words.add(input.next());

        }

        doubleValues(words);

        for (String word: words) {
            System.out.println(word);
        }
    }

    private static void doubleValues (List <String> words){
        for (int i = 0; i < words.size(); i++) {

            String name = words.get(i);

            name = name + name;
            words.set(i, name);
        }
    }
}
