/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class QuickSort {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int numberOfArray = checkInt("Enter number of array:");
        int a[] = RandomInput(numberOfArray);
        System.out.print("Unsorted array: ");
        display(a);
        System.out.print("Sorted array: ");
        quick_sort(a, 0, a.length - 1);
        display(a);
    }

    public static int checkInt(String message) {
        int a;
        do {
            try {
                System.out.print(message);
                a = Integer.parseInt(in.nextLine().trim());
                if (a <= 0) {
                    System.out.println("The number of elements in the array must be greater than or equal to 1");
                    System.out.print(message);
                    a = Integer.parseInt(in.nextLine().trim());
                }
                break;
            } catch (Exception e) {
                System.out.println("Must be Integer type! ");

            }
        } while (true);
        return a;
    }

    public static int[] RandomInput(int numberOfArray) {
        int a[] = new int[numberOfArray];
        for (int i = 0; i < numberOfArray; i++) {
            // a[i]=random.nextInt(numberOfArray);
            a[i] = new Random().nextInt(numberOfArray);
        }
        return a;

    }

    public static void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            System.out.print(a[i]);
            if (i == a.length - 1) {
                System.out.println("]");
            } else {
                System.out.print(", ");
            }
        }
    }

    //selects last element as pivot, pi using which array is partitioned. 
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];    // pivot
        int left = low;
        int right = high - 1;
        while (true) {
            while (left <= right && arr[left] < pivot) {
                left++; // Tìm phần tử >= arr[pivot]
            }
            while (right >= left && arr[right] > pivot) {
                right--; // Tìm phần tử <= arr[pivot]
            }
            if (left >= right) {
                break; // Đã duyệt xong thì thoát vòng lặp
            }
// Nếu chưa xong, đổi chỗ.
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;

            left++; // Vì left hiện tại đã xét, nên cần tăng
            right--; // Vì right hiện tại đã xét, nên cần giảm
        }
        int tmp = arr[left];
        arr[left] = arr[high];
        arr[high] = tmp;
        return left; // Trả về chỉ số sẽ dùng để chia đổi mảng
    }

    //routine to sort the array partitions recursively
    public static void quick_sort(int intArray[], int low, int high) {
        if (low < high) {
            //partition the array around pi=>partitioning index and return pi
            /* pi là chỉ số nơi phần tử này đã đứng đúng vị trí
         và là phần tử chia mảng làm 2 mảng con trái & phải */
            int pi = partition(intArray, low, high);

            // sort each partition recursively 
            // Gọi đệ quy sắp xếp 2 mảng con trái và phải
            quick_sort(intArray, low, pi - 1);
            quick_sort(intArray, pi + 1, high);
        }
    }
}

/*
public static int partition(int intArray[], int low, int high) { 
        int pi = intArray[high];  
        int i = (low-1); // smaller element index   
        for (int j=low; j<high; j++) { 
            // check if current element is less than or equal to pi 
            if (intArray[j] <= pi) { 
                i++; 
                // swap intArray[i] and intArray[j] 
                int temp = intArray[i]; 
                intArray[i] = intArray[j]; 
                intArray[j] = temp; 
            } 
        } 
   
        // swap intArray[i+1] and intArray[high] (or pi) 
        int temp = intArray[i+1]; 
        intArray[i+1] = intArray[high]; 
        intArray[high] = temp; 
   
        return i+1; 
    } 
*/
