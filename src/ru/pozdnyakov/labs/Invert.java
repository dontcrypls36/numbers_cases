package ru.pozdnyakov.labs;

import java.util.Arrays;

/**
 * Created by Artem on 23.05.2016.
 */
public class Invert {
    public static void main(String[] args){
        int[] data = {1};
        for (int i = 0; i < data.length / 2; i++){
            swap(data, i, data.length - 1 - i);
        }
        System.out.println(Arrays.toString(data));
    }

    private static void swap(int[] data, int i, int k) {
        int tmp = data[i];
        data[i] = data[k];
        data[k] = tmp;
    }
}
