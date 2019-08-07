package com.sparta.ddl.sorters;

public class BubbleSort implements Sorter {

    @Override
    public int[] sortArray(int[] unsortedArray) {
        return runSortArray(unsortedArray);
    }

    public int[] runSortArray(int[] iArr) {

        for (int j = 0; j < iArr.length; j++) {
            for (int i = 1; i < iArr.length; i++) {
                int temp = 0;
                if (iArr[i - 1] > iArr[i]) {
                    temp = iArr[i - 1];
                    iArr[i - 1] = iArr[i];
                    iArr[i] = temp;
                }
            }
        }
        return iArr;
    }

}
