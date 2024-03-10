package task4.runner;

import task4.student.Student;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {

        Student teacher=new Student("Andrey", "teacher");
        Student student1=new Student("Ruslan", "student");
        Student student2=new Student("Artem", "student");
        Student student3=new Student("Anastasiya", "student");

        LinkedList<Student>people=new LinkedList<>();

        people.add(teacher);
        people.add(student1);
        people.add(student2);
        people.add(student3);

        for (Student person : people) {
            System.out.println(person.name + "--" + person.status);
        }
    }
}
