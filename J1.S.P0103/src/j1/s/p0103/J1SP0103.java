
package j1.s.p0103;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class J1SP0103 {
private static final Scanner in = new Scanner(System.in);
  private static Date CheckDate(String msg) {
        SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");
        dateForm.setLenient(false);
        do {
            try {
                System.out.print(msg);
                return dateForm.parse(in.nextLine());

            } catch (Exception e) {
                System.out.print("Wrong format. ");
                System.out.println("Date format (dd/mm/yyyy)");
            }
        } while (true);
    }
    public static void main(String[] args) {
        Date date1 = CheckDate("Please enter the first date: ");
        Date date2 = CheckDate("Please enter the second date: ");
        
        if(date1.after(date2)){
            System.out.println("date1 is after date2");
        }
        if(date1.before(date2)){
            System.out.println("date1 is before date2");
        }
        else{
            System.out.println("date1 is equal date2");
        }
    }

}
/*String CheckDate(String mess) {
		System.out.println(mess);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		dateFormat.setLenient(false);
		while(true) {
			String input=in.nextLine();
			try {
				Date date= dateFormat.parse(input);
				Date curDate = Calendar.getInstance().getTime();
				if(date.compareTo(curDate)>0) {
					System.out.println("Please enter a day before current day: ");
				}else {
					dateFormat =new SimpleDateFormat("dd-MMM-yyyy");
					return dateFormat.format(date);
				}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Please enter a valid format date dd-MM-yyyy");
			}
		}
	}*/
