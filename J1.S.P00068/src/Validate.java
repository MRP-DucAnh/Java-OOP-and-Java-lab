


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

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
            if (choice.equalsIgnoreCase("y")|| choice.equalsIgnoreCase("n")) {
                break;
            }else{
                continue;
            }
        } while (true);
        return choice;
    }
    public float getMark() {
        float n = 0;
        do {
            try {
                System.out.print("Enter mark : ");
                n = Float.parseFloat(sc.nextLine());
                if(n<0){
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Oop ! Enter again: ");
                continue;
            }
            break;
        } while(true);
        return n;
    }
    public void add(List<Student> list){
        String name = getName();
        String classname = getClassName();
        float mark = getMark();
        Student s = new Student(name, mark, classname);
        list.add(s);
    }
    public void sort(List<Student> list){
        Collections.sort(list, new Comparator<Student>() {            
                @Override
public int compare(Student o1, Student o2) {
                    return o1.getName().compareToIgnoreCase(o2.getName());
                }
            });
    }
    
    
    public void sortt(List<Student> list){
       Collections.sort(list,new Comparator<Student> () {
           @Override
           public int compare(Student o1, Student o2) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
        
    }
    
   
    public void display(List<Student> list){
        for(int i=0; i<list.size(); i++){
            System.out.println("-----------Student "+i+1+"-----------");
            list.get(i).display();
        }
    }
}
