package lesson1;

import java.util.Scanner;

public class mainclassforlesson1 {
    public static void main(String[] args) {
        //Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих
        int[] arr = new int[]{1,1,0,1,1,1};
        int counter = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                counter++;
            }
            else {
                counter = 0;
            }
            if (counter > max){
                max = counter;
            }
        }
        System.out.println(max);
    }

}


