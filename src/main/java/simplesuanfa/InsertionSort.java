package simplesuanfa;

/**
 * @author 单耀
 * @version 1.0
 * @description
 * @date 2021/3/29 17:54
 */
public class InsertionSort {
    public static void main(String[] args) {
        int N = 20000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        System.out.println(arr);
    }
}
