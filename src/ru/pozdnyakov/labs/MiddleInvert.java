package ru.pozdnyakov.labs;

import java.util.Arrays;

/**
 * Created by Artem on 23.05.2016.
 */
public class MiddleInvert {
    public static void main(String[] args){
        int[] data = {};
        int delta = data.length % 2 == 0? 1 : 0;
        for (int i = 1; i <= data.length/2; i++){
            swap(data,  data.length / 2 - i, data.length / 2 + i - delta);
        }
        System.out.println(Arrays.toString(data));
    }

    private static void swap(int[] data, int i, int k) {
        int tmp = data[i];
        data[i] = data[k];
        data[k] = tmp;
    }
}
