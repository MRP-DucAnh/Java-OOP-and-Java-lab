package CVB;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author THAYCACAC
 */
public class Manager{

    private static final String str = "0123456789ABCDEF";
    private final static Scanner scanner = new Scanner(System.in);
    public Manager(){
        
    }
    public static int menu(){
        System.out.println("1. Convert From Binary.");
            System.out.println("2. Convert From Octal");
            System.out.println("3. Convert From Decimal.");
            System.out.println("4. Convert From Hexa.");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
             int inputBase= Manager.checkInputIntLimit(1, 5);
            return inputBase;
    }
    public static int outputMenu(int inputBase){   
    int n=1;           
            System.out.print("select the base system you want to convert to \n");
            if(inputBase != 1){
                System.out.println(n + ". Convert to binary: ");
                n++;
            }
            if(inputBase != 2){
                System.out.println(n + ". Convert to octal: ");
                n++;
            }
            if(inputBase != 3){
                System.out.println(n + ". Convert to decimal: ");
                n++;
            }if(inputBase != 4){
                System.out.println(n + ". Convert to heximal: ");
                n++;
            }
            System.out.print("Enter your choice (1/2/3): ");
            int outputBase = Manager.checkInputIntLimit(1, 3);
    return outputBase;
    }
    
    public static String CheckString(String mess) {	
		System.out.print(mess);
		while(true) {
			String input = scanner.nextLine();
			if(input.isEmpty()) {
				System.out.println("Please enter a non-empty String: ");
			}else {
				return input;
			}
		}
	}
    
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(scanner.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static boolean checkInputAnyBase(String inputString, int base){
        String Valid ="0123456789ABCDEF";
        String str2 = Valid.substring(0, base);
        String RightForm="["+str2+"]*"; //REGEX
        while (true){           
            if(inputString.matches(RightForm)){
                return true;
            }
            System.err.println("the characters entered must be in this range ["+str2+"]");
            return false;
        }       
    }
   
    //---------------------------------
    public static int AnyBaseToDecimal(String enter,int base1) { //Chuyển một hệ bất kì về hệ thập phân
       //str = "0123456789ABCDEF"
       int decimal = 0;
        for (int i = 0; i <enter.length(); i++) {
            
            decimal+=str.indexOf(enter.charAt(i)) * pow(base1,enter.length()-i-1);
// AnyBaseToDecimal("AD12",16) i=0 -> decimal += 10(A) * 16^(4-0-1)
//                             i=1 -> decimal += 13(D) * 16^(4-1-1)
//                             ...
        }
        return decimal;
    }
    public static String DecimalToAnyBase(int Decimal, int base2) {
        String BaseFound="";
        while(Decimal!=0){
            int remainder=Decimal%base2;
            BaseFound=str.charAt(remainder)+BaseFound;
            Decimal=Decimal/base2;
        }
       // BaseFound= new StringBuffer(BaseFound).reverse().toString();       
        return BaseFound;
    }
    public static String BaseToBase(int base1, int base2,String enter){
        int k =AnyBaseToDecimal(enter, base1);    
        String result =DecimalToAnyBase(k, base2);
        return result;
    }

}
