package pack1;
public class Student {
    String stdName;
    String gender;
    String level;
    int age;
    static int count = 0;
 public void display(){
        System.out.println("Name :" + stdName+ " Sex :" + gender + " Level : "+ level +" Age :"+ age);
    } 
 public  Student(){
        this.stdName="MNO";
        this.gender ="male";
        this.level = "--";
        this.age = 21;
        count ++;
    }
   public Student(String stdName,String gender,String level,int age){
        this.stdName =stdName;
        this.gender = gender;
        this.age = age;
        this.level = level;
        count ++;
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
    public static int getCount() {
    return count;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
