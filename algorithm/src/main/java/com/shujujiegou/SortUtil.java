package com.shujujiegou;

/**
 * @author 单耀
 * @version 1.0
 * @description
 * @date 2021/3/29 18:27
 */
public class SortUtil {

    //插入排序倒序
    public static void selectSortDesc(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i ++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void selectSortAsc(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i ++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    //------------------------归并
    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }
    private static void mergeSort(int[] arr, int l, int r) {
        if (l>=r) return;
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, r, mid);
    }

    private static void merge(int[] arr, int l, int r, int mid) {
        int[] temp = new int[r - l + 1];

        int sl = l;
        int smid = mid + 1;
        for (int k = 0; k < r - l + 1; k ++) {
            if (sl > mid) {
               temp[k] = arr[smid];
               smid ++;
            } else if (smid > r) {
                temp[k] = arr[sl];
                sl++;
            } else if (arr[sl] < arr[smid]) {
                temp[k] = arr[sl];
                sl++;
            } else {
                temp[k]  = arr[smid];
                smid ++;
            }
        }
        for (int k = 0; k < temp.length; k++) {
            arr[l+k] = temp[k];
        }

    }
    //----------------------归并 end-----------------

    //----------------快排 34125
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int q = partition(arr, l, r);
        quickSort(arr, l, q - 1);
        quickSort(arr, q+1, r);
    }

    public static int partition(int[] arr, int l, int r) {
        int biao = arr[l];
        int q = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < biao) {
                q++;
                swap(arr, q, i);
            }
        }
        swap(arr, q, l);
        return q;
    }
    //----------------------快排
    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

        int N = 10;
        int[] arr = SortTestHelper.generateRandomArray(N, 0, 100);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        SortUtil.quickSort(arr);
        System.out.println();
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
    }

    public static void pritn(Object[] arr) {
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}


