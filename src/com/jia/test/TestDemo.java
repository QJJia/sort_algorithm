package com.jia.test;

import com.jia.dao.BubbleSort;
import com.jia.dao.MergeSort;
import com.jia.dao.QuickSort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author:QJJia
 * @date:2019/8/11 22:05
 * @description:排序算法测试demo
 */
public class TestDemo {
    public static void main(String[] args) {
        //冒泡排序的测试
//        int[] array = {1,3,2,4,6,5,8,7,9};
//        int[] array1 = new int[1000];
//        for (int i = 0; i < 1000; i++) {
//            array1[i] = i;
//        }
//        BubbleSort bb = new BubbleSort();
//        System.out.println(Arrays.toString(bb.bubbleSort(array1)));
        //快排测试
//        int[] array = {1,3,2,4,6,5,8,7,9};
//        QuickSort qu = new QuickSort();
//        qu.quickSort(array);
//        System.out.println(Arrays.toString(array));
        //归并测试
        int[] array = {1,3,2,4,6,5,8,7,9};
        MergeSort me = new MergeSort();
        me.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
