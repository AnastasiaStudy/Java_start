package lesson1;

import java.time.chrono.MinguoDate;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
//        Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
        String text = "Добро пожаловать на курс по Java";
        String[] arrText = text.split(" ");
        String[] newText = new String[arrText.length];
        int index = 0;
        for (int i = arrText.length - 1; i >= 0; i--) {
            newText[index] = arrText[i];
            index++;
        }
        for (String item : newText) {
            System.out.print(item + " ");
        }
    }
}
