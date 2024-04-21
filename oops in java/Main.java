class Student{
  private int id;
  public String name;
  Student(int id,String name)
  {
    //using this keyword to remove ambiguity 
    this.id=id;
    this.name=name;
  }
  void put_details()
  {
    System.out.println("Student's ID  :" + id);
    System.out.println("Student's Name :" + name);
  }
  int score(int t1,int t2)
  {
      return t1+t2;
  }
  //method overloading
  int score(int t1,int t2,int t3)
  {
      return t1+t2+t3;
  }
}
public class Main {
  public static void main(String args[])
  {
    Student S1; //declare reference to Student1
    S1=new Student(101,"Siya"); //allocate a Student object
    Student S2=new Student(103,"Shyam"); 
    S1.put_details();
    System.out.println("Student's Total Score_1:" + S1.score(45,67));
    System.out.println("Student's Total Score_2 :" + S1.score(56,75,56));
    //name is public can be accessed
    S1.name="Megha";
    System.out.println("Student's name is changed");
    S1.put_details();
  }
}