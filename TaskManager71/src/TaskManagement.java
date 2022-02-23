

import java.util.ArrayList;
import java.util.Date;

public class TaskManagement {
    ArrayList<Task> list = new ArrayList<>();
    Validate v = new Validate();
    public void mainMenu() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1. Add task");
        System.out.println("2. Delete task");
        System.out.println("3. Show task");
        System.out.println("4. Exit");
        int choice = v.getChoice("Enter your choice: ");
        switch (choice) {
            case 1:
                addTask();
                break;
            case 2:
                //deleteTask();
                DeleteTask();
                break;
            case 3:
                display();
                break;
            case 4:
                System.exit(0);//Khi System.exit() được gọi, quá trình thực thi của JVM sẽ bị chấm dứt và dừng chương trình.
                //Như vậy, các mã code được triển khai ở phía sau System.exit() sẽ không được thực thi.
        }
    }

    public void addTask() {
        int id;
        if (list.isEmpty()) {
            id = 1;
        } else {
            id = list.get(list.size() - 1).getId() + 1;
        }
        String name = v.getText("Enter name: ");
        int typeid = v.getChoice("Input type id: ");
        String date = v.getDate();
        double from = v.getFrom();
        double to = v.getTo(from);
        String assign = v.getText("Input assignee: ");
        String reviewer = v.getText("Input reviewer: ");
        Task t = new Task(id, name, typeid, date, from, to, assign, reviewer);
        list.add(t);
    }

    public void deleteTask() {
        boolean check = false;
        int id = v.getID();
        for (Task t : list) {
            if (t.getId() == id) {
                check = true;
                list.remove(t);
                System.out.println("Remove successfully");
                break;
            }
        }
        if (check == false) {
            System.out.println("not found");
        }
        
    }
    public void DeleteTask() {
       int check= findTaskExist(list);
       if (check == -1 ){
           System.out.println("Not found: ");
       }
       else
       {
           list.remove(check); // remove(index)
           for (int i = check; i <list.size() ; i++) {
               int k =list.get(i).getId();
               list.get(i).setId(k-1);
           }
           System.out.println("Remove successfully");
       }
        
    }
    
    public int findTaskExist(ArrayList<Task> t){
        System.out.print("Enter ID: ");
        int id = v.getID();
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getId()==id){
                return i; // retrun id
                // return id; return id
            }
        }
        return -1;
    }

    public void display() {
        System.out.println("---------------------------------------------display all---------------------------------------------");
        for(Task t: list){
            System.out.println(t);
        }
    }
    
   

}
