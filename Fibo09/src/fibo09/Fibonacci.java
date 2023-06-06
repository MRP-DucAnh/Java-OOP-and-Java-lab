/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo09;

/**
 *
 * @author DELL
 */
public class Fibonacci {

    private final int num;
    public static final int NOT_COMPUTED = -1;
    private final int[] fibonaccies;

    public Fibonacci(int num) {
        this.num = num;

        this.fibonaccies = new int[this.num];

        if (this.num > 0) {
            this.fibonaccies[0] = 0;                //gán giá trị đầu cho mảng fibo
        }

        if (this.num > 1) {                        //gán giá trị thứ 2 cho mảng fibo
            this.fibonaccies[1] = 1;
        }

        for (int i = 2; i < this.num; ++i) {        //Từ giá trị thứ 3  trong mảng được gán tạm thời là Not_Computed
            this.fibonaccies[i] = NOT_COMPUTED;
        }
    }

    public int getNum() {
        return num;
    }

    public int[] getFibonaccies() {
        return fibonaccies;
    }

    private int compute(int index) {
        if (this.fibonaccies[index] != NOT_COMPUTED) {  //Với những phần tử trong mảng không phải là Not_Computed
            return this.fibonaccies[index];             //Thì trả về giá trị trong mảng là fibonaccies[index], Lúc này chỉ có 2 giá trị đầu đã được gán fibonaccies[0]=0, fibonaccies[1]=1
        }

        this.fibonaccies[index] = this.compute(index - 1) + this.compute(index - 2);//Các phần tử còn lại trong mảng lần lượt được gán vào theo hệ thức truy hồi từ 2 giá trị đầu
        return this.fibonaccies[index];
    }

    public void compute() {
        this.compute(this.num - 1); //thí.num - 1 Vì Giá trị đầu trong mảng được tính từ 0
    }

}
