package sort;

/**
 * @Descirption shangxue
 * @Author tengfei
 * @Date 2019/12/3 11:17
 * @Version
 */
public class HalfSearch {


    public static void main(String[] args) {
        int[] arr1=new int[]{1, 3, 5, 6, 9, 44, 55};//二分查找的前提是数组有序，否则二分思路不成立

        int a=halfSeach_2(arr1,55);//返回其下标

        if(a==-1){
            System.out.println("在数列中未查找到想要的值");
        }else{
            System.out.println("找到了，目标数在数列中的下标是："+a);

        }

       // System.out.println(a);

    }


    public static int halfSeach_2(int[] arr,int key){
        int min,max,mid;

        //咱们需要一个“中点”，而这个中点的下标怎么来，由待查寻的数组的最小下标和最大下标计算而来(有的同学问除出来是小数咋办？咱设计成int取整，忽略小数点。所以，这个中点不是完完全全就是中间，当奇数个数时，因下标只有整数，所以中点会往左偏一位，但无伤大雅，仍是二分法)
        min = 0; //最小下标的初始值
        max = arr.length-1;  //最大下标的初始值

        mid = (max+min)>>1; // (max+min)/2;

        //while循环
        while(arr[mid]!=key){
            //如果目标值比中点值大，说明目标值若存在则可能存在在右半边（一次比较就排除了左半边一大坨数，是不是很爽？）。那么，筛选后的待查寻数组的中点如何找？
            if(key>arr[mid]){
                min = mid + 1;
            }
            else if(key<arr[mid])
                max = mid - 1;
            //死循环出口(最小下标一直在往右替换，最大下标一直在往左替换。那么，如果一直筛选又一直没查到目标数，筛选完了还没查到目标数，会发生什么？这时候我们循环就可以结束了并且报个找不到该数的信息通知调用者)
            //考虑最坏情况（就像我们出远门，是不是要考虑好应对最恶劣天气？）
            if(max<min){
                return -1;}
            mid = (max+min)>>1;
        }

        return mid;
    }
}
