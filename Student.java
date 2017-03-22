import java.util.*;

public class Student{
  private String studentName;
  private String studentID;
  private boolean tuitionStatus;

  public Student(String studentName,String studentID,boolean tuitionStatus){
    this.studentName = studentName;
    this.studentID = studentID;
    this.tuitionStatus = tuitionStatus;
  }
//getter
  public String getStudentName(){return this.studentName;};
  public boolean getTuitionStatus(){return this.tuitionStatus;};
  public String getStudentID(){return this.studentID;};
//setter
  public void setTuitionStatus(boolean tuitionStatus){ this.tuitionStatus = tuitionStatus;};
  public String toString(){return String.format("Student Name:%s\nStudent ID:%s\nTuition Paid:%b",this.studentName,this.studentID,this.tuitionStatus);};
}
