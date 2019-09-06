package com.jia.dao;

/**
 * @author:QJJia
 * @date:2019/8/11 22:49
 * @description:快速排序(挖坑法实现)
 */
public class QuickSort {
    public void quickSort(int[] array){
        //待排序数组的起始位置和终止位置
        int low = 0;
        int high = array.length - 1;
        quickSort(array,low,high);
    }

    private void quickSort(int[] array, int low, int high) {
        //递归的出口，start = end
        if(low < high){
            //将待排数组进行划分，拿到基准数（分界点）
            int point = partition(array,low,high);
            //对左边进行快排，它的终止位置为point - 1
            quickSort(array,low,point - 1);
            //对右边进行快排，它的起始位置为point + 1
            quickSort(array,point + 1,high);
        }
    }

    private int partition(int[] array, int low, int high) {
        //将数组的第一个数存入到temp中（相当于对左边挖了一个坑）
        int temp = array[low];

        /**
         * 挖坑法
         * 左边的坑，右边填（找比temp小的）
         * 右边的坑，左边填（找比temp大的）
         * 第一躺排序结束后，左边的数都比temp小，右边的数都比temp大。
         */
        while(low < high){
            //左边的坑右边填
            while (low < high && temp <= array[high]){
                high--;
            }
            if(low < high){
                array[low++] = array[high];
            }
            //右边的坑左边填
            while(low < high && temp >= array[low]){
                low++;
            }
            if(low < high){
                array[high--] = array[low];
            }
        }
        //low和high相遇,进行填坑
        array[low] = temp;
        //返回相遇的下标索引
        return low;
    }
}
