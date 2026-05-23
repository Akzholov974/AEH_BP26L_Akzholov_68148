package pl.pp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class myEleventhApp {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        Student topStudent = students.get(0);
        for (Student student : students) {
            if (student.calculateAverage() > topStudent.calculateAverage()) {
                topStudent = student;
            }
        }

        System.out.println("Student with the highest average: " + topStudent.getFirstName() + " " + topStudent.getLastName() + " (" + topStudent.getIndexNumber() + ") - Average: " + topStudent.calculateAverage());

        students.sort(Comparator.comparing(Student::getLastName));

        System.out.println("Students sorted by last names:");
        for (Student student : students) {
            System.out.println(student.getLastName() + " " + student.getFirstName() + " (" + student.getIndexNumber() + ") - Average: " + student.calculateAverage());
        }
    }
}
