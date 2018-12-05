package by.javatr.taskSuper;

import java.util.ArrayList;

public class Group {
    private ArrayList<Student> studentList = new ArrayList<Student>();
    public void add(Student st){
        if (st != null){
            studentList.add(st);
        }
    }
    public double averageRatingGroup(){
        double sum = 0;
        for (Student el:studentList) {
            sum +=el.averageRating();
        }
        return sum/studentList.size();
    }
    public double averageRatingStudent(int id){
        for (Student el: studentList) {
            if (id == el.getId()){
                return el.averageRating();
            }
        }
        return -1;
    }
    public int excellentNumber(){
        int counter = 0;
        for (Student el: studentList) {
            if (el.averageRating() >= 8){
                counter++;
            }
        }
        return counter;
    }
    public int losersNumber(){
        int counter = 0;
        for (Student el: studentList) {
            if (el.averageRating() <= 4){
                counter++;
            }
        }
        return counter;
    }

}
