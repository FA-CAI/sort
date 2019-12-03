package sort;

import java.util.Arrays;

/**
 * @Descirption shangxue
 * @Author tengfei
 * @Date 2019/12/3 12:09
 * @Version
 */

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {   //排序范围，两个游标间的区间。low：待排数组的最低下标， high：待排数组的最高下标
        int i, j, standard, temp;                                    //左右游标是用来记录我们排序范围缩小的

        if (low > high) {
            return;//递归出口(死循环的出口) break不能用于递归，是用于循环和switch时(因为数组是引用数据类型值传递，所以这排序方法可以返回值是void)
        }

        i = low;
        j = high; //记录我们排序范围

        //temp就是基准位的值(temp记录基准位的值)
        standard = arr[low];

        //while嵌套  直到左右游标相遇错位此时说明已遍历完比较该区间，可以出去循环了。效果：所有比基准值大的放右边，所有比基准值小的放左边 (这边写法就是左右下标相遇时就结束循环，所以此时永远i=j)
        while (i < j) {
                 //数列从右看，依次往左递减    右游标的值大于等于基准值 且 右游标仍运行在左游标的右边（啥意思呢？数列仍没遍历比较完）
                 while (i < j && arr[j] >= standard) {  //说明不用换位子。那么右游标移到左一位元素，该元素值继续和基准值比较，直到右游标所在的值小于等于基准值
                     j--;
                 }

                 //数列从左看，依次往右递增
                 while (i < j && arr[i] <= standard) {
                     i++;  //直到左游标所在的值大于等于基准值,此时因为不符合我们的想要的排列样子，有交换的意义，变成我们想要的样子
                 }

                 //如果满足条件则交换
                 if (i < j) {
                     temp = arr[j];
                     arr[j] = arr[i];
                     arr[i] = temp;
                 }
        }

        //第二步：把基准值放到中间去，用基准值来把两串隔开
        //将基准位与i和j相等时候这个位置（下标）的元素值交换
        // System.out.println("arr[i]:"+arr[i]+";arr[j]:"+arr[j]);  // arr[i]:x;arr[j]:x
        arr[low] = arr[i];//i=j，换哪个都一样
        arr[i] = standard;   //standard是基准位的值

        //递归调用左半数组   ！！！  方法名，返回值，参数列表，都设计得多巧妙呀~
        quickSort(arr, low, i - 1);  //无所谓j还是i，但我觉得这么写更好
        //递归调用右半数组  ！！！
        quickSort(arr, j + 1, high);
        //妙哇！
    }


    public static void main(String[] args) {

        int[] arr1 = {44, 6, 1, 55, 3, 5, 9};

        quickSort(arr1, 0, arr1.length - 1);
      /*  for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        System.out.println(Arrays.toString(arr1));
    }
}