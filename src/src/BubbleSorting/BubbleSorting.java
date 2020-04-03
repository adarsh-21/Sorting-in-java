package BubbleSorting;

import java.util.Scanner;

public class BubbleSorting<result> {
    public int[] BubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }
        BubbleSorting b = new BubbleSorting();
        int[] result = b.BubbleSort(arr);
        //System.out.println(result);
        for (int i = 0; i <result.length ; i++) {
            System.out.println(result[i]);
        }
    }
}