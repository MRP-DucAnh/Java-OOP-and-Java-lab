package InsertionSort03;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
    
    static void insertionSort(int[] array) {
        int size = array.length;
        for (int i = 1; i < size; i++) {
            int value = array[i];
            int j = i;
            while(j > 0 && array[j-1] > value) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = value;
        }
    }
    
    static void display(int[] array) {
        int size = array.length;
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i != size-1)
                System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
        System.out.println("]");   
    }
    
    public static void main(String[] args) {
        Validation check = new Validation();
        int size = check.inputInt("Enter number of array: ", 1, Integer.MAX_VALUE);
        int[] arr = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(size);
        }
        System.out.print("Unsorted array: ");
        display(arr);
        insertionSort(arr);
        System.out.print("Sorted array: ");
        display(arr);
    }
}
