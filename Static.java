class student{
    int rollno;
    String name;
    static String college="ibs";
    student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    void display(){
        System.out.println(rollno+college);
    }
}

public class Static {
    public static void main(String[] args) {
        student s1=new student(111,"karan");
        student s2=new student(222,"aaa");
        s1.display();
        s2.display();
    }
}