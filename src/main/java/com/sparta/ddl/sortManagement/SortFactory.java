package com.sparta.ddl.sortManagement;

import com.sparta.ddl.sorters.BubbleSort;
import com.sparta.ddl.sorters.MergeSorter;
import com.sparta.ddl.sorters.Sorter;

public class SortFactory {

    public static Sorter getInstance(String sorter) {
        if (sorter.equals("bubble")) {
            return new BubbleSort();
        } else if (sorter.equals("merge")) {
            return new MergeSorter();
        } else {
            return new BubbleSort();
        }

    }
}