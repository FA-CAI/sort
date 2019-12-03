package sort;

import java.util.Arrays;

/**
 * @Descirption shangxue
 * @Author tengfei
 * @Date 2019/12/3 14:29
 * @Version
 */
public class SelectSort {

    public static void main(String[] args) {

        int [] arr={1,5,6,44,9,3,55};
        /**
         * 选择排序：
         * 挑出最小的数字，然后与0下标的数值做交换，那么，实现了第一个位置（下标0）放最小的值
         * 然后，从第二个位置开始，挑出剩下数字中最小的（其实就是原来数列中第二小），放在第二个位置（下标1）
         * ......
         * 如此循环，实现从小到大的排序
         */

        System.out.println(Arrays.toString(arr));

        selectSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void selectSort(int[] arr1){

        for(int i=0;i<arr1.length-1; i++){
           //todo 找到待排序数组中最小的数，把它放在第一个位置
            //todo 找到剩下的待排序数组中最小的数，把它放在第二个位置
            int min_index=i;  //之所以用下标记录是因为对于数组而言，你知道下标你就知道值，但你知道值没有语法能让你直接得到下标,而且数组是允许值可重复

            for(int j=i+1 ;j<arr1.length-1;j++){
                if(arr1[j]<arr1[i]){

                    min_index=j;
                }
            }
            //把找到的最小数放到最前面
            if(min_index !=i){
                int temp=arr1[i];
                arr1[i]=arr1[min_index];
                arr1[min_index]=temp;
            }
        }



    }


}
