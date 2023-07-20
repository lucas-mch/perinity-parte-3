package dev.lucasmachado.perinity;

import java.util.Arrays;

public class desafio04 {

    public static void mergeAndSortTwoIntegerArray(Integer[] arr1, Integer[] arr2) {
        Integer[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(bubbleSort(mergedArray)));
    }

    static Integer[] mergeArrays(Integer[] arr1, Integer[] arr2) {
        int fal = arr1.length;
        int sal = arr2.length;
        Integer[] result = new Integer[fal + sal];
        System.arraycopy(arr1, 0, result, 0, fal);
        System.arraycopy(arr2, 0, result, fal, sal);
        return result;
    }

    static Integer[] bubbleSort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
