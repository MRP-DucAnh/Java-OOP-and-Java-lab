


public class Student {
    private String name;
    private String classes;
    private double math;
    private double chemistry;
    private double physic;
    private double average;
    public Student() {
    }

    public Student(String name, String classes, double math, double chemistry, double physic) {
        this.name = name;
        this.classes = classes;
        this.math = math;
        this.chemistry = chemistry;
        this.physic = physic;
    }
     public Student(String name, String classes, double average) {
        this.name = name;
        this.classes = classes;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getPhysic() {
        return physic;
    }

    public void setPhysic(double physic) {
        this.physic = physic;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Class: "+classes);
        System.out.println("AVG: "+average);
    }
}
