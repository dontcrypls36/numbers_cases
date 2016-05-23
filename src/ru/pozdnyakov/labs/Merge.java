package ru.pozdnyakov.labs;

import java.util.Arrays;

/**
 * Created by Artem on 23.05.2016.
 */
public class Merge {
    public static void main(String[] args){
        int[] first = {1,3,3,8};
        int[] second = {2,4,5,5,10};
        System.out.println(Arrays.toString(merge(first, second)));

    }

    private static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int firstIndex = 0;
        int secondIndex = 0;
        while((firstIndex + secondIndex) <= result.length - 1){
            if (firstIndex < first.length && first[firstIndex] < second[secondIndex]){
                result[firstIndex + secondIndex] = first[firstIndex < first.length  ? firstIndex++ : firstIndex];
            }
            else{
                result[firstIndex + secondIndex] = second[secondIndex < second.length  ? secondIndex++ : secondIndex];
            }
        }
        return result;
    }
}
