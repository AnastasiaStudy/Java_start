package lesson1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HW1_1 {
    //1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void main(String[] args){
        Integer[] A = {3,5,1,6,8};

        List<Integer> ints = Arrays.asList(A);

        System.out.println("Min = " + Collections.min(ints));
        System.out.println("Max = " + Collections.max(ints));
    }
}

