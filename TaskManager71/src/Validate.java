

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validate {

    Scanner in = new Scanner(System.in);

    public int getChoice(String mess) {
        int choice;
        do {
            try {
                System.out.print(mess);
                choice = Integer.parseInt(in.nextLine());
                if (choice > 4 || choice < 1) {
                    System.out.println("Please choose from 1 to 4");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid choice");
                continue;
            }
            break;
        } while (true);
        return choice;
    }

    public String getText(String mess) {
        String name = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(mess);
            name = sc.nextLine();
            if (name.trim().equals("")) {
                continue;
            } else {
                break; //break de pha vo vong lap do while
            }
        } while (true);
        return name;
    }

    public String getDate() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        String text = "";
        while (true) {
            try {
                System.out.print("Enter date: ");
                text = sc.nextLine();
                dateFormat.parse(text.trim());
            } catch (Exception e) {
                System.out.println("please try again");
                continue;
            }
            break;
        }
        return text;
    }
    public double getFrom() {
        double from;
        do {
            try {
                System.out.print("Input from: ");
                from = Double.parseDouble(in.nextLine());
                if (from < 8 || from > 17.5) {
                    System.out.println("Please input plan from 8 to 17.5 ");
                    continue;
                }
                if (from%0.5!=0){
                    System.out.println("you are only allowed to enter the numeric format as a multiple of 0.5 (8.0, 8.5, 9.0, 9.5,...)");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Invalid double");
                continue;
            }
            break;
        } while (true);
        return from;
    }

    public double getTo(double from) {
        double to;
        do {
            try {
                System.out.print("Input to: ");
                to = Double.parseDouble(in.nextLine().trim());
                if (to < 8 || to > 17.5) {
                    System.out.println("Please input plan from 8 to 17.5 ");
                    continue;
                }
                 if (to%0.5!=0){
                    System.out.println("you are only allowed to enter the numeric format as a multiple of 0.5 (8.0, 8.5, 9.0, 9.5,...)");
                    continue;
                }
            
                if (to <= from) {
                    System.out.println("Plan to should greater than plan from");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid double");
                continue;
            }
            break;
        } while (true);

        return to;
    }
 //phục vụ việc xóa
    
    public int getID() {
        int id = -1;
        do {
            try {
                System.out.print("Enter id: ");
                id = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.print("Please input valid id: ");
                continue;
            }
            break;
        } while (true);
        return id;
    }

}
