package lesson2;
import javax.imageio.IIOException;
import java.io.IOException;

import java.util.*;
public class HW3 {
//    Задание
//    Пусть дан произвольный список целых чисел.
//    1) Найти максимальное значение
//    2) Найти минимальное значение
//    3) Найти среднее значение
//    4) Нужно удалить из него чётные числа

    public static void main(String[] args) {
        List<String> numbers = List.of("2", "1", "3", "0", "6", "4");
        List<String> numbersCopy = new ArrayList<>(Arrays.asList("2", "1", "-9", "0", "6", "4"));
        Collections.sort(numbersCopy);
        System.out.println(numbersCopy);
        System.out.println("Min = " + numbersCopy.get(0));
        System.out.println("Max = " + numbersCopy.get(numbersCopy.size() - 1));
    }
}



