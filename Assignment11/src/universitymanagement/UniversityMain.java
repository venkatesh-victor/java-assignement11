package universitymanagement;

import universitymanagement.course.Course;
import universitymanagement.faculty.Faculty;
import universitymanagement.student.Student;

public class UniversityMain {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setCourseName("Web Development");
        course1.setNoOfUnits(8);
        course1.setMaxCredits(6);

        Course course2 = new Course();
        course2.setCourseName("Artificial Intelligence");
        course2.setNoOfUnits(10);
        course2.setMaxCredits(15);

        Student s1 = new Student();
        s1.setCourseSelected(course1.getCourseName());
        s1.setName("Victor Wayne");
        s1.setYearOfStudy(2);

        Student s2 = new Student();
        s2.setCourseSelected(course2.getCourseName());
        s2.setName("Romilda Vane");
        s2.setYearOfStudy(3);

        Student s3 = new Student();
        s3.setCourseSelected(course1.getCourseName());
        s2.setName("Levi Ackerman");
        s2.setYearOfStudy(4);

        course1.addStudent(s1);
        course1.addStudent(s3);
        course2.addStudent(s2);

        Faculty f1 = new Faculty();
        f1.setDesignation("Head of the Department");
        f1.setMobileNo(999898989);
        f1.setName("Erwin Smith");
        f1.setCourse(course2);

        Faculty f2 = new Faculty();
        f2.setDesignation("Assitant Professor");
        f2.setMobileNo(900909099);
        f2.setName("Emmanuel Fritz");
        f2.setCourse(course1);
    }
}
