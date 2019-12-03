package sort;

import java.util.Arrays;

/**
 * @Descirption shangxue
 * @Author tengfei
 * @Date 2019/12/3 14:49
 * @Version
 */
public class BubbleSort {

    public static void main(String[] args) {

        int [] arr={1,5,6,44,9,3,55};
        /**
         * 冒泡排序：
         *口语化： 大的往上冒（对于数列来讲，就是往右边冒）
         *拿到一个基数，通过比较，如果比 比较的数 大的话，就进行位置交换，一直比较到最后
         * 循环以上步骤
         */

        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));



    }

    public static void bubbleSort(int[] arr) {
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                //减去i的原因：内存循环，没循环完一趟就在数组末产生一个最大数，然而该最大数不需要再参加比较了
               //大家可以发现，选择排序和冒泡排序本质思路都是从当前剩下的未排序的数列中找到最大化
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }
            }


        }



    }



}
