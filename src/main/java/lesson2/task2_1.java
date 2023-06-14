package lesson2;


import java.util.*;

public class task2_1 {
    public static void main(String[] args) {
        List<String> planets = List.of("Mercury", "Venus", "Earth", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluton",
                "Jupiter", "Jupiter", "Jupiter", "Mercury", "Earth", "Earth", "Earth", "Pluton", "Venus", "Earth", "Earth",
                "Mercury", "Uranus");

        List<String> planetsCopy = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluton",
                "Jupiter", "Jupiter", "Jupiter", "Mercury", "Earth", "Earth", "Earth", "Pluton", "Venus", "Earth", "Earth",
                "Mercury", "Uranus"));
        Collections.sort(planetsCopy);
        System.out.println(planetsCopy);

        int count = 1;

        for (int i = 0; i < planetsCopy.size() - 1; i++) {
            if (planetsCopy.get(i) == planetsCopy.get(i + 1)) {
                count++;
            } else {
                System.out.println(planetsCopy.get(i) + " " + Integer.toString(count));
                count = 1;
            }
        }
        if (count != 1 || planetsCopy.get(planetsCopy.size() - 2) != planetsCopy.get(planetsCopy.size() - 1))
            System.out.println(planetsCopy.get(planetsCopy.size() - 1) + " " + Integer.toString(count));
         /*
        Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
         */

        int index = 0;

        while (index < planetsCopy.size() - 1) {
            if (Objects.equals(planetsCopy.get(index), planetsCopy.get(index + 1))) {
                planetsCopy.remove(index + 1);
            } else {
                index++;
            }
        }

        System.out.println(planetsCopy);


        {
//        Создать список типа ArrayList<String>.
//        Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа.
            List<String> strings = List.of("4", "qwe", "5", "8", "hello");
            int sum = 0;
            for (String string : strings) {
                try {
                    sum += Integer.parseInt(string);
                } catch (NumberFormatException e) {
                    System.err.println("Невозможно перевести в строку: " + string);
                }
            }

            System.out.println("sum: " + sum);
        }
    }
}