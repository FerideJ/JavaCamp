package ders2;

public class Courses {
    int id;
    String courseName;
    String courseTeacher;
    double coursePrice;
    String courseDetails;


    public Courses(int id, String courseName,String courseTeacher, double coursePrice, String courseDetails) {
        this.id = id;
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
        this.coursePrice = coursePrice;
        this.courseDetails = courseDetails;

    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", courseTeacher='" + courseTeacher + '\'' +
                ", coursePrice=" + coursePrice +
                ", courseDetails='" + courseDetails + '\'' +
                '}';
    }
}
