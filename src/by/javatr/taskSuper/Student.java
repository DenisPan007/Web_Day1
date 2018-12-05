package by.javatr.taskSuper;

public class Student {
    static int counter = 0;
    {
        counter++;
    }
    private int id;
    private int[] marks;

    Student(int ... marks){
        this.marks = marks;
        id = counter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMark(int ... marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public int[] getMark() {
        return marks;
    }
    public double averageRating(){
        int sum = 0;
        for (int element: marks) {
           sum += element;
        }
        return sum/marks.length;
    }
}
