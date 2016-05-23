package ru.pozdnyakov.labs;

import java.util.Arrays;

/**
 * Created by Artem on 23.05.2016.
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] data = {};
        for (int barrier = 0; barrier < data.length; barrier++) {
            for (int i = 0; i < data.length - barrier - 1; i++) {
                conditionalSwap(data, i, i + 1);
            }
        }
        System.out.println(Arrays.toString(data));
    }

    private static void conditionalSwap(int[] data, int i, int k) {
        if (data[i] > data[k]){
            swap(data, i);
        }
    }

    private static void swap(int[] data, int i) {
        int tmp = data[i];
        data[i] = data[i + 1];
        data[i + 1] = tmp;
    }


}
