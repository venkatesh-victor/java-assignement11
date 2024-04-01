package universitymanagement.faculty;

import java.util.List;

import universitymanagement.course.Course;

public class Faculty
{
    private String name;
    private String designation;
    private long mobileNo;
    private List<Course> courseList;
    private Course course;

    public Faculty() {
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    public void setCourseSelected(Course c)
    {
        courseList.add(c);
    }
    public List<Course> getCourse()
    {
        return  courseList;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


}