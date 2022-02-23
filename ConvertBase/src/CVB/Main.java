package CVB;

import java.util.Scanner;

/**
 *
 * @author THAYCACAC
 */
public class Main {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        String s = "";
        Manager manager = new Manager();

        while (true) { //Chạy đến khi chọn option 5 to exit
            int inputBase = Manager.menu(); //Nhập Hệ cơ số bạn cần chuyển đổi
            if (inputBase == 5) {
                break;
            }
            int outputBase = Manager.outputMenu(inputBase); //Nhập hệ cơ số bạn muốn chuyển dổi thành

            //               1-2      , 2-8        ,3-10       ,4-16
            int[][] out = {{8, 10, 16}, {2, 10, 16}, {2, 8, 16}, {2, 8, 10}}; //sử dụng mảng 2 chiều đề tìm giá trị đúng của outpuBase ứng với các option
            outputBase = out[inputBase - 1][outputBase - 1];
            if (inputBase == 1)      {inputBase = 2;}
             else if (inputBase == 2){inputBase = 8;} 
             else if (inputBase == 3){inputBase = 10;}
             else                    {inputBase = 16;}
           
            while (true) {
                s=Manager.CheckString("Enter number:");
                if (manager.checkInputAnyBase(s, inputBase)) {
                    break;
                }
            }
            System.out.println("Result Number : " + Manager.BaseToBase(inputBase, outputBase, s));
            System.out.println("_____________________");
        }
    }
//001100000010
    //pearminhkhai
}
