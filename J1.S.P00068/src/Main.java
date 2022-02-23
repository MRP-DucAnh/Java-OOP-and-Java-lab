



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Validate v = new Validate();
        Student s = new Student();
        List<Student> list = new ArrayList<>();
        System.out.println("please input student information: ");
        String choice = "y";
        do{
            v.add(list);
            choice = v.getYN();
        }while(choice.equalsIgnoreCase("y"));
        v.sort(list);
        v.display(list);
    }
}
