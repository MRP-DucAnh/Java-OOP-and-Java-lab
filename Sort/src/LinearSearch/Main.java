
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
    
    static int linearSearch(int[] array, int value) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }
    
    static int[] LinearSearch(int[] array, int value) {
        int size = array.length;
        int count = 0;
        int k=0;
        
        for (int i = 0; i < size; i++) {
            if (array[i] == value)
                count++;
            
        }
        int[]a=new int[count]; 
        
        for (int i = 0; i < size; i++) {
            if (array[i] == value){
                a[k]=i;
            k++;
            }
        }
        return a;
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
        
        display(arr);
        int value = check.inputInt("Enter search value: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.print("The array: ");
       
        /*
        int index = linearSearch(arr, value);
        if (index == -1)
            System.out.println("Value doesn't exist");
        else System.out.println("Found " + value + " at index: " + index);
        
        
        
*/
        int test[]= LinearSearch(arr, value);
        if (test.length==0)
            System.out.println("Vlaue doesn't exist ! ");
        else {System.out.print("Found " + value + "at index:  ");
        display(test);
        }
        
    }
}
