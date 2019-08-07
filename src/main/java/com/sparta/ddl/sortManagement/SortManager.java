package com.sparta.ddl.sortManagement;

import com.sparta.ddl.display.DisplayManager;
import com.sparta.ddl.sorters.BubbleSort;
import com.sparta.ddl.sorters.MergeSorter;
import com.sparta.ddl.sorters.Sorter;

import java.util.Arrays;

public class SortManager {

    public void runSortManagerSortArray(String sortType) {
        int[] unsortedArray = {1, 3, 2, 5, 4, 7, 6, 9, 8, 10};
        Sorter sorter = SortFactory.getInstance(sortType);
        int[] sortedArray = sorter.sortArray(unsortedArray);
        new DisplayManager().displayArray(sortedArray);

    }

}