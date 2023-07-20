package dev.lucasmachado.perinity;

import org.junit.Test;

import static dev.lucasmachado.perinity.desafio04.*;
import static org.junit.Assert.assertArrayEquals;

public class desafio04Test {
    @Test
    public void testMergeAndSortEmptyArrays() {
        Integer[] arr1 = {};
        Integer[] arr2 = {};
        Integer[] expected = {};
        assertMergeAndSort(arr1, arr2, expected);
    }

    @Test
    public void testMergeAndSortWithUnsortedArrays() {
        Integer[] arr1 = {5, 3, 7};
        Integer[] arr2 = {1, 9, 2};
        Integer[] expected = {1, 2, 3, 5, 7, 9};
        assertMergeAndSort(arr1, arr2, expected);
    }

    @Test
    public void testMergeAndSortWithSortedArrays() {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {4, 5, 6};
        Integer[] expected = {1, 2, 3, 4, 5, 6};
        assertMergeAndSort(arr1, arr2, expected);
    }

    @Test
    public void testMergeAndSortWithOneEmptyArray() {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {};
        Integer[] expected = {1, 2, 3};
        assertMergeAndSort(arr1, arr2, expected);
    }

    @Test
    public void testMergeAndSortWithOneArrayHavingElements() {
        Integer[] arr1 = {10, 5, 8};
        Integer[] arr2 = {};
        Integer[] expected = {5, 8, 10};
        assertMergeAndSort(arr1, arr2, expected);
    }

    private void assertMergeAndSort(Integer[] arr1, Integer[] arr2, Integer[] expected) {
        mergeAndSortTwoIntegerArray(arr1, arr2);
        Integer[] mergedArray = mergeArrays(arr1, arr2);
        Integer[] sortedArray = bubbleSort(mergedArray);
        assertArrayEquals(expected, sortedArray);
    }


}
