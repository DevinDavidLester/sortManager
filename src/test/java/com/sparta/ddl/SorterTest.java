package com.sparta.ddl;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.sparta.ddl.sortManagement.SortManager;
import com.sparta.ddl.sorters.MergeSorter;
import com.sparta.ddl.sorters.Sorter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SorterTest {
    /**
     * Rigorous Test :-)
     */

    private Sorter sorter;
    private int[] unsortedArray;

    @Before
    public void init() {
        sorter = new MergeSorter();
    }

    @Test
    public void testingIfSorted() {
        int[] unsortedArray = {1, 3, 2, 5, 4, 7, 6, 9, 8};
        int[] sortedArray = sorter.sortArray(unsortedArray);
        for (int i = 0; i < sortedArray.length - 1; i++) {
            if (sortedArray[i] >= sortedArray[i + 1]) {
                assertTrue("The array has been correctly sorted", true);
            }
        }
    }

    @Test
    public void testingForDuplicates() {
        int[] unsortedArray = {1, 3, 3, 2, 5, 4, 7, 6, 9, 8};
        int[] sortedArray = sorter.sortArray(unsortedArray);
        for (int i = 0; i < sortedArray.length - 1; i++) {
            if (sortedArray[i] <= sortedArray[i + 1]) {
                assertTrue("The array has been correctly sorted with duplicates", true);
            } else {
                Assert.fail();
            }
        }
    }

    @Test
    public void testingLengthOfZero() {
        int[] unsortedArray = {};
        int[] sortedArray = sorter.sortArray(unsortedArray);

    }

//    public void evenLength(int[] testingEven) {
//
//    }

//    public void oddLength(int[] testingOdd) {
//
//    }


}
