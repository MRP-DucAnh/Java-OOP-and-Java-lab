
package BubbleSort;

/**
 *
 * @author DELL
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Scanner in = new Scanner(System.in);

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
    //sort array by bubble sort
    private static void sortArrayByBubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    

    public static void main(String[] args) {
        int numberOfArray = checkInt("Enter number of array:","The input must be at least 1");
        int a[]=RandomInput(numberOfArray);
        System.out.print("Unsorted array: ");
        display(a);
        System.out.print("Sorted array: ");
        sortArrayByBubbleSort(a);
        display(a);
    }

    // 5 1 12 -5 16
    // 1 5 -5 12 16
    // 1-5 5  12 16
    //-5 1 5  12 16
    //-5 1 5  12 16
}
