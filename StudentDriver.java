public class StudentDriver{



  public static void main(String[] args) {
    Course javaClass = new Course("CS111",1);
    Student eric = new Student("Eric","W7800",true);
    Student adam = new Student("adam","W7801",true);
    Student smith = new Student("smith","W7802",true);
    System.out.println("......");

    
    System.out.println(javaClass.addStudent(adam));

    javaClass.printRoster();
  }

}
