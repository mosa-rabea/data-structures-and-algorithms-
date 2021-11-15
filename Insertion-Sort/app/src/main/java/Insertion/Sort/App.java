/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Insertion.Sort;

import java.util.Arrays;

public class App {


    public static void main(String[] args) {


        int[] arrayForTest = {8,4,23,42,16,15};

//        System.out.println(Arrays.toString(insertionSort(arrayForTest)));


        System.out.println(Arrays.toString(mergeSort(arrayForTest)));

    }
    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int j = i-1;
            int key = array[i];

            while (j>=0 && key<array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }


    public static int[] mergeSort(int[] array){
        int n =array.length;
        int[] sorted = new int[array.length];
        if(n>1){
            int middle = n/2;
            int[] left = Arrays.copyOfRange(array,0,middle);
            int[] right = Arrays.copyOfRange(array,middle,array.length);
            mergeSort(left);
            mergeSort(right);
            sorted = merge(left, right, array);

        }

        return sorted;
    }

    public static int[] merge(int[] left,int[] right,int[] array){
        int i =0;
        int j =0;
        int k =0;

        while (i<left.length && j< right.length){
            if (left[i] <= right[j]){
                array[k] = left[i];
                i=i+1;
            }

            else {
                array[k] = right[j];
                j=j+1;
            }
            k=k+1;
        }

        if(i == left.length){
            while (j < right.length){
                array[k] = right[j];
                k=k+1;
                j=j+1;
            }
        }
        else {
            while (i < left.length){
                array[k] = left[i];
                k=k+1;
                i=i+1;
            }
        }
        return array;
    }



}