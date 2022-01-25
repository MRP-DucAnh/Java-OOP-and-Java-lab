

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Validate {

    Scanner sc = new Scanner(System.in);

    public String getName() {
        String name = "";
        do {
            System.out.print("Enter name: ");
            name = sc.nextLine();
            if (name.trim().matches("[A-Za-z]+")) {
                break;
            }
           
        } while (true);
        return name;
    }

    public String getClassName() {
        String classname = "";
        do {
            System.out.print("Enter class name: ");
            classname = sc.nextLine();
            if (classname.trim().length() == 0) {
                continue;
            }
            break;
        } while (true);
        return classname;
    }

    public String getYN() {
        String choice = "";
        do {
            System.out.print("Do you want to enter more student (Y/N): ");
            choice = sc.nextLine().trim();
            if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")) {     //Phương thức equalsIgnoreCase() so sánh 
                break;                                                       // hai chuỗi đưa ra dựa trên nội dung của chuỗi không phân biệt chữ hoa và chữ thường.  
            } else {                                                         //Nếu hai chuỗi khác nhau nó trả về false.
                continue;                                                   //Nếu hai chuỗi bằng nhau nó trả về true.
            }
        } while (true);
        return choice;
    }

    public double getMark(String mess) {
        double n = 0;
        do {
            try {
                System.out.print(mess);
                n = Float.parseFloat(sc.nextLine());
                if (n < 0 || n > 10) {
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Oop ! Enter again: ");
                continue;
            }
            break;
        } while (true);
        return n;
    }

    public void add(List<Student> list) {
        String name = getName();
        String classname = getClassName();
        double math = getMark("Math: ");
        double chemistry = getMark("Chemistry: ");
        double physic = getMark("Physic: ");
        double average = (math + chemistry + physic)/3;
        Student s = new Student(name, classname,average);
        list.add(s);
    }
    public void display(List<Student> list){
         for(int i=0; i<list.size(); i++){
            System.out.println("-----------Student "+(i+1)+"-----------");
            list.get(i).display();
            System.out.println("Type: "+getType(list.get(i).getAverage()));
        }
    }
    public String getType(double average){
        String type = "";
        if(average > 7.5){
            type = "A";
        }else if(average >= 6 && average <= 7.5){
            type = "B";
        }else if(average >= 4 && average <6){
            type = "C";
        }else{
            type = "D";
        }
        return type;
    }
    public void getPercen(List<Student> list){
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getAverage() > 7.5){
                a = a + 1;
            }else if(list.get(i).getAverage() >= 6 && list.get(i).getAverage()<=7.5){
                b = b + 1;
            }else if(list.get(i).getAverage() >= 4 && list.get(i).getAverage()<6){
                c = c+ 1;
            }else{
                d = d +1;
            }
        }
        int length = list.size();
        System.out.println("--------Classification infor--------");
        System.out.println("A: "+100*a/length+"%");
        System.out.println("B: "+100*b/length+"%");
        System.out.println("C: "+100*c/length+"%");
        System.out.println("D: "+100*d/length+"%");
    }
    public void getPercen1(List<Student> list){
        HashMap<Integer,Double> hashmap = new HashMap<Integer,Double>();
        for(int i=0; i<list.size(); i++){
            hashmap.put(i, list.get(i).getAverage());
        }
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        Set<Integer> set = hashmap.keySet();
        for (Integer key : set) {
            if(hashmap.get(key) > 7.5){
                 a = a + 1;
            }else if(hashmap.get(key) >=6 && hashmap.get(key) <=7.5){
                b = b + 1;
            }else if(hashmap.get(key) >= 4 && hashmap.get(key) <6){
                c = c+ 1;
            }else{
                d = d +1;
            }
        }
        int length = hashmap.size();
        System.out.println("--------Classification infor--------");
        System.out.println("A: "+100*a/length+"%");
        System.out.println("B: "+100*b/length+"%");
        System.out.println("C: "+100*c/length+"%");
        System.out.println("D: "+100*d/length+"%");
    }
    
     public void getPercen2(List<Student> list){
     HashMap<Character,Integer> hashmap = new HashMap();
     hashmap.put('A', 0);
     hashmap.put('B', 0);
     hashmap.put('C', 0);
     hashmap.put('D', 0);
     
     for(int i=0; i<list.size(); i++){
            if(list.get(i).getAverage() > 7.5){
                    hashmap.put('A', hashmap.get('A')+1);
            }else if(list.get(i).getAverage() >= 6 && list.get(i).getAverage()<=7.5){
               hashmap.put('B', hashmap.get('B')+1);
            }else if(list.get(i).getAverage() >= 4 && list.get(i).getAverage()<6){
              hashmap.put('C', hashmap.get('C')+1);
            }else{
                hashmap.put('D', hashmap.get('D')+1);
            }
        }
     int length = list.size();
        System.out.println("--------Classification infor--------");
        System.out.println("A: "+hashmap.get('A')*  100/length+"%");
        System.out.println("B: "+hashmap.get('B')*  100/length+"%");
        System.out.println("C: "+hashmap.get('C')*  100/length+"%");
        System.out.println("D: "+hashmap.get('D')*  100/length+"%");
        
     }
}
