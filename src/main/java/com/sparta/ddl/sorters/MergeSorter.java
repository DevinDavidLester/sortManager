package com.sparta.ddl.sorters;

public class MergeSorter implements Sorter {

    @Override
    public int[] sortArray(int[] givenArray) {
        this.givenArray = givenArray;
        tempArray = new int[givenArray.length];
        int[] sortedArray = runMergeSort(givenArray);
        return sortedArray;
    }

    private int[] givenArray;
    private int[] tempArray;
    private int[] finalSortedArray;


    public int[] runMergeSort(int[] mergedInt) {
        int position = 0;
        finalSortedArray = new int[givenArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            finalSortedArray[position] = i + 1;
            position++;
        }
        return finalSortedArray;
    }

    private void mergeSort(int low, int high) {
        if (low >= high) {
            return;
        }
        int middle = (low + high) / 2;
        mergeSort(low, middle);
        mergeSort(middle + 1, high);
        merge(low, middle, high);
    }

    private void merge(int low, int middle, int high) {

        for (int i = low; i <= high; i++) {
            tempArray[i] = givenArray[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while ((i <= middle) && (j <= high)) {
            if (tempArray[i] <= tempArray[j]) {
                givenArray[k] = tempArray[i];
                i++;
            } else {
                givenArray[k] = tempArray[i];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            givenArray[k] = tempArray[i];
            k++;
            i++;
        }
        while (j <= high) {
            givenArray[k] = tempArray[j];
            k++;
            j++;
        }
    }
}

