/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class BruteForceAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     // BF_A("PEARAFFPEARD", "A");
        
        //search("GCAGAGAG".toCharArray(), "GCATCGCAGAGAGTTATACAGTACG".toCharArray());
        int k =Brute_Force_Algorithm("NEARAFFPEARD", "PEAR");
        System.out.println(k);
    }

    public static void BF_A(String s, String p) {
        
        int n = s.length();
        int m = p.length();
        System.out.print("Các vị trí xuất hiện trong văn bản của xâu mẫu là: ");
        for (int j = 0; j < n - m; j++) {
            for (int i = 0; i < m && p.charAt(i) == s.charAt(i + j); i++) {
                if (i == m - 1) {
                    System.out.print(j + " ");
                }
            }

        }
        
    }

    public static int Brute_Force_Algorithm(String s, String p) {
        int pos = -1; //Vị trí cần tìm của chuỗi p trong chuỗi s
                      //Trả về -1 nếu không tìm thấy
        int n = s.length();
        int m = p.length();
        for (int j = 0; j < n - m; j++) {//n-m vòng lặp cho trường hợp tìm thấy chuỗi ở cuối s
                                         
            for (int i = 0; i < m; i++) {//Duyệt m phần tử của chuỗi p 
                if (p.charAt(i) != s.charAt(i + j)) {//So sánh chuỗi p với m phần tử đầu của s
                    break;              //nếu không khớp thì dịch vị trí đầu so sánh sang phải
                }
                if (i == m - 1) {//nếu duyệt được m phần tử thì trả về pos
                    return pos = j;
                }
            }
            if (pos != -1) {//Thoát vòng lặp khi đã tìm thấy  1 vị trí của p
                break;
            }
        }
        return pos;
    }

    public static void search(char[] x, char[] y) {
        int m = x.length;
        int n = y.length;
        System.out.print("Các vị trí xuất hiện trong văn bản của xâu mẫu là: ");
        for (int j = 0; j <= n - m; j++) {
            for (int i = 0; i < m && x[i] == y[i + j]; i++) {
                if (i == m - 1) {
                    System.out.print(j + "    ");
                }
            }
        }
    }
}
