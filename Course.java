public class Course{
  private String courseName;
  private int maxenrolled;
  private Student[] roster;

  public Course(String courseName,int maxenrolled){
    this.courseName = courseName;
    this.maxenrolled = maxenrolled;
    this.roster = new Student[this.maxenrolled];
  }

  //getter
  public String getCourseName(){return this.courseName;};
  public int getMaxEnrolled(){return this.maxenrolled;};

  //setter
  public void setCoursename(String courseName){this.courseName = courseName;};
  public void setMaxEnrolled(int maxenrolled){
    if(maxenrolled >0){ this.maxenrolled = maxenrolled;};
  }

  //toString
  public String toString(){return String.format("Course Name:%s\nMax Enroll Students:%d",this.courseName,this.maxenrolled);};

  //
  public boolean addStudent(Student s){
    if(s.getTuitionStatus()){
      for(int i=0;i<this.roster.length; i++){
        if(this.roster[i] == null){
          this.roster[i] = s ;
          return true;
        }
      }
    }
    return false;
  }

  public boolean dropStudent(Student s){
    for(int i=0;i<this.roster.length;i++){
      // iterating the array roster to find if the student in the roster
      if(this.roster[i] != null && s.getStudentName().equals(this.roster[i].getStudentName()) && s.getStudentID().equals(this.roster[i].getStudentID())){
        // if the student is in the roster shift the roster preventing an empty slot in the middle
        for(int j=i;j<this.roster.length;j++){
          if(j+1 <this.roster.length && this.roster[j+1] != null){this.roster[j]=null;}
          else{this.roster[j]=this.roster[j+1];}
        }
        return true;
      }

    }
    return false;

  }

  public void printRoster(){
    // count how many students are enrolled by iterating the roster array and checking every non null elelment
    int countStudent = 0;
    for(Student i : this.roster){
      if(i != null){
        countStudent++;
      }
      };
      // print out the result and specify a case when no students enrolled
      if(countStudent == 0){System.out.println("There are no students enrolled in the class now.");}
      else{
        System.out.printf("Enrollment:%d\n",countStudent);
        for(Student i : this.roster){
          if(i != null){ System.out.println(i.getStudentName() + "  ("+i.getStudentID()+")");};
        };
      }
  }


}
