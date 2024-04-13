package lab10Tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import labTenActual.SelectionSort;

import org.junit.jupiter.api.Test;


public class testSelectionSort {


    @org.junit.jupiter.api.Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {

    }

    @Test
    public void testPositive() {
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;


        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        assertArrayEquals(Sortedarr, arr);
    }

    @Test
    public void testNegative() {
        int[] arr  = {-3, -1, -7, -4, -9};
        int [] expected = {-9, -7, -4, -3, -1};

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMixed() {
        int[] arr = {3, -1, 7, -4, 0};
        int[] expected = {-4, -1, 0, 3, 7};

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        assertArrayEquals(expected, arr);

    }

    @Test
    public void testDuplicates() {
        int[] arr = {3, 1, 7, 3, -4, 7, 0};
        int[] expected = {-4, 0, 1, 3, 3, 7, 7};

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);

        assertArrayEquals(expected, arr);

    }

}