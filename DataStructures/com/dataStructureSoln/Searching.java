package com.dataStructureSoln;

public class Searching {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int linearIndex = linearSearch(numbers, 30);
        System.out.println("Element found at index: " + linearIndex);
        int binaryIndex = binarySearch(numbers, 30);
        System.out.println("Element found at index: " + binaryIndex);
    }
}
