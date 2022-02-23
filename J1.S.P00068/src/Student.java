

public class Student {

    private String name;
    private float mark;
    private String classes;

    public Student() {
    }

    public Student(String name, float mark, String classes) {
        this.name = name;
        this.mark = mark;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Classes: "+classes);
        System.out.println("Mark: "+mark);
    }
}
