import pack1.*;
public class DemoClass {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student("nart","male","..",21);    
        std1.display();
        System.out.println("Count Class : " + Student.getCount());
    }

}