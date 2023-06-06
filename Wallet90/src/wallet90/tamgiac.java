/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wallet90;

/**
 *
 * @author DELL
 */
public class tamgiac {

    public static void main(String[] args) {

        int n = 6;
        for (int i = 1; i <= n + n - 1; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        //
        int left = 2;
        int right = 2 * n - 1 - 1;
        for (int i = 1; i <= n - 1; i++) {

            for (int j = 1; j < (2 * n + 1); j++) {

                if (j == left || j == right) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            left++;
            right--;
            System.out.println("");
        }
        //

        n = 6;

        System.out.println(" ");
        //
        left = n;
        right = n;
        for (int i = 1; i <= n - 1; i++) {

            for (int j = 1; j < (2 * n + 1); j++) {

                if (j == left || j == right) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            left++;
            right--;
            System.out.println("");
        }
        for (int i = 1; i <= n + n - 1; i++) {
            System.out.print("*");
        }

        //
        
        int ngang=7;
        int doc=6;
        for (int i = 1; i <= ngang; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < doc-2; i++) {
            if (i == left || i == right) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            System.out.println("");
        }
              
        System.out.println("");
        for (int i = 1; i <= ngang; i++) {
            System.out.print("*");
        }
    }
}
