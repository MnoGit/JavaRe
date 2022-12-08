package pack1;
public class Student {
    String stdName;
    String gender;
    String level;
    int age;
 public  Student(){
        this.stdName="MNO";
        this.gender ="male";
        this.level = "--";
        this.age = 21;
    }
   public Student(String stdName,String gender,String level,int age){
        this.stdName =stdName;
        this.gender = gender;
        this.age = age;
        this.level = level;
    }


  public String getStdName() {
      return stdName;
  }
    public String getLevel() {
        return level;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public void display() {
    }
}
