package com.ScottHorsburgh;
import java.util.Arrays;
import java.util.Scanner;

import static com.ScottHorsburgh.BinarySearch.search;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] arr = {1,3,5,2,89,95,10,7,9,66,11,32,8,3,4,56,43,23,54,66};
        Arrays.sort(arr);

        System.out.print("\nSearch a number in index: ");
        int userInput = sc.nextInt();
        int indexSearch = search(arr, userInput);

        System.out.print("\nSorted Integer Array = ");
        for (Integer item : arr) {
            System.out.print(item+", ");
        }
        System.out.println("\nInteger Array Contains item " + userInput + " at index = " + indexSearch);
    }

}