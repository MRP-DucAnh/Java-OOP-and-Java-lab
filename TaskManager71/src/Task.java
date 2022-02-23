

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Task {

    private int id;
    private String name;
    private int typeid;
    private String date;
    private double from;
    private double to;
    private String assignee;
    private String reviewer;
    //  ArrayList<TaskType> types;

    public Task() {
    }

    public Task(int id, String name, int typeid, String date, double from, double to, String assignee, String reviewer) {
        this.id = id;
        this.name = name;
        this.typeid = typeid;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public double getTime() {
        return to - from;
    }

    public String taskname() {
        String taskname = "";
        switch (typeid) {
            case 1:
                taskname = "1.Code";
                break;
            case 2:
                taskname = "2.Test";
                break;
            case 3:
                taskname = "3.Design";
                break;
            case 4:
                taskname = "4.Review";
                break;
        }
        return taskname;
    }

    @Override
    public String toString() {
        String out = String.format("%d%20s%20s%20s%20f%20f%20s%20s", id, name, taskname(), date, from, to, assignee, reviewer);
        return out;
    }
}
