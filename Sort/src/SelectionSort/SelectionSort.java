/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectionSort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SelectionSort {
   // private static Random random = new Random();
     private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
       
        
        int numberOfArray = checkInt("Enter number of array:");
        int a[]=RandomInput(numberOfArray);
        System.out.print("Unsorted array: ");
        display(a);
        System.out.print("Sorted array: ");
        sortArrayBySectionSort(a);
        display(a);
    }

   public static int checkInt(String message) {
        int a;
        do {
            try {
                System.out.print(message);
                a = Integer.parseInt(in.nextLine().trim());
                
                break;
            } catch (Exception e) {
                System.out.println("Must be Integer type! ");
                
            }
        } while (true);
        return a;
    }

    public static int[] RandomInput(int numberOfArray) {
        int a[] =new int[numberOfArray];
        for (int i = 0; i < numberOfArray  ; i++) {
           // a[i]=random.nextInt(numberOfArray);
           a[i] =new Random().nextInt(numberOfArray);
                    }
        return a;
       
    }
    public static void display(int a[]){
        for (int i = 0; i < a.length; i++) {
            if(i==0)System.out.print("[");
            System.out.print(a[i] );
            if(i==a.length-1)System.out.println("]");
            else System.out.print(", ");
        }
    }

    private static void sortArrayBySectionSort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }
             if(i==a.length) break;
        }
        
    }

    
    
}
