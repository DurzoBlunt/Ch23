

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Ch23_2Test {
    public Integer[] intArray1 = {-1, 14, 70, 64, 10, 34, 20, 0, 2, 1, 3, 55};
    public Integer[] intArray1Sorted = {-1, 0, 1, 2, 3, 10, 14, 20, 34, 55, 64, 70};
    public Integer[] intArray2 = {10, 20, 30, 40, 50, -20};
    ArrayList<Integer> myNums = new ArrayList<>();﻿


    @org.junit.Test
    public void mergeSort() throws Exception {

        //mergeSort(intArray1);
        assertArrayEquals(intArray1Sorted, intArray1);
    }

    @org.junit.Test
    public void merge() throws Exception {

    }

    @org.junit.Test
    public void mergeSort1() throws Exception {

    }

    @org.junit.Test
    public void merge1() throws Exception {

    }

}