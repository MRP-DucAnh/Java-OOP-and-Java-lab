/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort03;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class InsertionSort03 {
     private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfArray = checkInt("Enter number of array:","The input must be at least 1");
        int a[]=RandomInput(numberOfArray);
        System.out.print("Unsorted array: ");
        display(a);
        System.out.print("Sorted array: ");
        InsertionSort(a);
        display(a);
    }

   public static int checkInt(String mess,String err) {
        while(true){
            System.out.println(mess);
            try{
                int number = Integer.parseInt(in.nextLine().trim());
                if(number<0){
                    System.out.println(err);
                }else
                    return number;
            }catch(Exception e){
                System.out.println("Invali number!!");
            }          
   }
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

    private static void InsertionSort(int[] a) {

        int n = a.length;
        int key ;
        int j;
        for (int i = 1; i < n; i++) {
             key = a[i];
             j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }
}
/*
Phức tạp thời gian: Trung bình O(n log n)
Xấu nhất: O(n2)
*/
