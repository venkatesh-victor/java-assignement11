package universitymanagement.course;

import java.util.List;

import universitymanagement.student.Student;

public class Course {
    private String courseName;
    private int maxCredits;
    private int noOfUnits;
    private List<Student> studentList;


    public Course() {
        super();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMaxCredits() {
        return maxCredits;
    }

    public void setMaxCredits(int maxCredits) {
        this.maxCredits = maxCredits;
    }

    public int getNoOfUnits() {
        return noOfUnits;
    }

    public void setNoOfUnits(int noOfUnits) {
        this.noOfUnits = noOfUnits;
    }

    public void addStudent(Student stud) {
        studentList.add(stud);
    }

    public List<Student> getStudent() {
        return studentList;
    }


}