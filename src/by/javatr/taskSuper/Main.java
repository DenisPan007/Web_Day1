package by.javatr.taskSuper;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group();
        group1.add(new Student(8, 9, 9, 9, 9 ));
        group1.add(new Student(2, 3, 4, 2, 1 ));
        group1.add(new Student(7, 7, 7, 7, 8 ));
        group1.add(new Student(8, 9, 9, 9, 9 ));
        System.out.println("Средний бал группы: " + group1.averageRatingGroup());
        System.out.println("Средний бал студента с id = 2: " + group1.averageRatingStudent(2));
        System.out.println("Число отличников: " + group1.excellentNumber());
        System.out.println("Число двоечников: " + group1.losersNumber());
    }
}
