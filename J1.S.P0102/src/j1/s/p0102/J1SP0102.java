package j1.s.p0102;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class J1SP0102 {

    public static void main(String[] args) {
        Date date;
        Scanner in = new Scanner(System.in);   
        SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dayForm = new SimpleDateFormat("EEE");
        dateForm.setLenient(false);
        do{
            System.out.print("Please enter date with format [dd/mm/yyyy]:");
            try{
                date = dateForm.parse(in.nextLine());
                System.out.println("Your day is " + dayForm.format(date));
                return;
            }catch (Exception e){
                System.out.println("Wrong format! Or the date you entered is not exist!");
                System.out.print("Please enter date with format [dd/mm/yyyy]:");
            }
        }while (true);
    }
    
}
