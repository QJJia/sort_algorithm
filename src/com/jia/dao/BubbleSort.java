package com.jia.dao;

import sun.font.FontRunIterator;

/**
 * @author:QJJia
 * @date:2019/8/11 22:04
 * @description:冒泡排序及其优化
 */
public class BubbleSort {
    public int[] bubbleSort(int[] array){
        //如果数组长度为0，直接返回
        if(array.length == 0){
            return array;
        }
        boolean temp = false;
        long start = System.currentTimeMillis();
        //外层循环 i 表示 趟数   ,趟数 = len - 1
        for (int i = 0; i < array.length - 1; i++) {
            //内层循环 j 表示 比较次数 , 比较次数 = len - 1 - 趟数
            //因为要保证j+1的有效性,不能出现数组越界异常，所以 j != len - 1 - i
            for (int j = i; j < array.length - 1 - i; j++) {
                //从小到大进行遍历，如果前者大于后者，进行交换
                if(array[j] > array[j+1]){
                    swap(array,j,j + 1);
                    temp = true;
                }
            }
            //第一趟结束后，temp的值没有发生变化，表示该数组是有序的，直接跳出循环即可。
            if(!temp){
                break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("排序完成，耗时" + (start - end) + "ms");
        return array;
    }
    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
