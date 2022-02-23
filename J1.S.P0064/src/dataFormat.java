import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author thaycacac
 */
public class dataFormat {

    private static final Scanner in = new Scanner(System.in);
    private static final String PHONE_VALID = /*"^\\d{10}$";*/"^[0-9]{10}$";
   private static final String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$"; // ^[\w._%+-]+$
   // private static final String EMAIL_VALID = "^[\\\\w-_\\\\.+]*[\\\\w-_\\\\.]\\\\@([\\\\w]+\\\\.)+[\\\\w]+[\\\\w]$";


    private static String checkInputString() {
        //loop until user input true value
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }
    

    private static String checkPhone() {
        while (true) {          
                String phoneCheck = in.nextLine();
                if(!phoneCheck.matches("^[0-9]{0,}$")){   //kiểm tra xem có phải số ko 
                   System.out.println("Phone number must be number"); 
                   System.out.print("Phone number: ");
                }
                else 
                if (!phoneCheck.matches(PHONE_VALID)) { //boolean matches() ---Kiểm tra xem biểu thức chính quy có khớp với mẫu hay không. Kiểm tra xem có đúng 10 số ko
                    System.err.println("Phone number must be 10 digits");
                    System.out.print("Phone number: ");
                } else {
                    return phoneCheck;                 
                }        
        }
    }
    /*
    private static String checkInputPhone() {
        while (true) {
            try {
                int phoneCheck = Integer.parseInt(in.nextLine());
                String resultCheck = String.valueOf(phoneCheck);
                if (!resultCheck.matches(PHONE_VALID)) {
                    System.err.println("Phone number must be 10 digits");
                } else {
                    return resultCheck;
                }
            } catch (NumberFormatException ex) {
                System.out.print("Phone number: ");
                System.err.println("Phone number must be number");
            }
        }
    }
*/

    private static String checkDate() {
        while (true) {
            try {
                String dateCheck = checkInputString();
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateCheck);
                return dateCheck;
            } catch (ParseException ex) {
                System.out.print("Date: ");
                System.err.println("Date to correct format(dd/MM/yyyy)");
            }
        }
    }
    
    private static Date CheckDate(String msg) {
        SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");
        dateForm.setLenient(false);
        do {
            try {
                System.out.print(msg);
                return dateForm.parse(in.nextLine());

            } catch (Exception e) {
                System.err.println("Wrong format! Or the date you entered is not exist!");
                System.out.print("Please enter date with format [dd/mm/yyyy]!");
            }
        } while (true);
    }

    private static String checkEmail() {
        while (true) {
            String emailCheck = checkInputString();
            if (!emailCheck.matches(EMAIL_VALID)) {
                System.err.println("Email must be correct format");
                System.out.print("Email: ");
            } else {
                return emailCheck;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Phone number: ");
        String phone = checkPhone();
//        System.out.print("Date: ");
 //       String date = checkDate();
        Date datee = CheckDate("Date: ");
        System.out.print("Email: ");
        String email = checkEmail();
    }
}
