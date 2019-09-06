package com.jia.dao;

import java.util.Arrays;

/**
 * @author:QJJia
 * @date:2019/8/11 23:30
 * @description:归并排序
 */
public class MergeSort {
    public static void mergeSort(int[] array){
        mergeSort(array,0,array.length-1);
    }

    private static void mergeSort(int[] array, int start, int end) {
        int mid = (start + end) >> 1;
        if(start < end){
            mergeSort(array,start,mid);
            mergeSort(array,mid+1,end);
            merge(array,start,mid,end);
        }
    }

    private static void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int p1 = start;
        int p2 = mid + 1;
        int k = 0;
        while(p1 <= mid && p2 <= end){
            if(array[p1] <= array[p2]){
                temp[k++] = array[p1++];
            }else{
                temp[k++] = array[p2++];
            }
        }

        while(p1 <= mid){
            temp[k++] = array[p1++];
        }
        while(p2 <= end){
            temp[k++] = array[p2++];
        }
        System.out.println(Arrays.toString(temp));

        for (int i = 0; i < temp.length ; i++) {
            array[i + start] = temp[i];
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {3,1,2,5,7,4,9,8,6};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
