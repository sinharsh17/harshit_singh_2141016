import java.util.Scanner;

class staff1{
    String name[]=new String[100];
    int id[]=new int[100];
    int whours[]=new int[100];
    int speed []=new int[100];
    String grade []=new String[100];
    static int n;
    static String org;
    Scanner sc=new Scanner(System.in);
    void details(){
        System.out.println("enter the name of organization: ");
//        sc.nextLine();
        org=sc.nextLine();
        System.out.println("enter the number of employees: ");
        n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("enter the name of employee: ");
            sc.nextLine();
            this.name[i]=sc.nextLine();
            System.out.println("enter the employee id: ");
            this.id[i]=sc.nextInt();
            System.out.println("enter the number of working hours: ");
            this.whours[i]=sc.nextInt();
        }
    }
}
class teacher extends staff1{
    String subject[]=new String[100];
    int publication[]=new int[100];
    String desg[]=new String[100];
    void dets(){
        for(int i=0;i<n;i++){
            System.out.println(super.name[i]);
            System.out.println(super.id[i]);
            System.out.println("enter the subject name for the above employee: ");
            sc.nextLine();
            this.subject[i]=sc.nextLine();
            System.out.println("enter the number of publication for the above employee: ");
            sc.nextInt();
            this.publication[i]=sc.nextInt();
            System.out.println("enter the designation of the teacher: ");
            this.desg[i]=sc.nextLine();
        }
    }
    void print(){
        for (int i=0;i<n;i++){
            System.out.println("name of the teacher "+(i+1)+": "+super.name[i]);
            System.out.println("employee id of teacher "+(i+1)+": "+super.id[i]);
            System.out.println("working hours of the teacher"+(i+1)+": "+super.whours[i]);
            System.out.println("subject of teacher"+(i+1)+": "+subject[i]);
            System.out.println("publications of the teacher "+(i+1)+": "+publication[i]);
            System.out.println("designation of the teacher "+(i+1)+": "+desg[i]);
        }
    }
}
class typist extends staff1{
    void dets(){
        for(int i=0;i<n;i++){
            System.out.println(super.name[i]);
            System.out.println(super.id[i]);
            System.out.println("enter the subject name for the above employee: ");
            this.speed[i]= sc.nextInt();
        }
    }
    void print(){
        for (int i=0;i<n;i++){
            System.out.println("name of the typist "+(i+1)+": "+super.name[i]);
            System.out.println("employee id of typist "+(i+1)+": "+super.id[i]);
            System.out.println("working hours of the typist"+(i+1)+": "+super.whours[i]);
            System.out.println("speed of the typist"+(i+1)+": "+super.speed[i]);
        }
    }
}
class officer extends staff1 {
    void dets() {
        for (int i = 0; i < n; i++) {
            System.out.println(super.name[i]);
            System.out.println(super.id[i]);
            System.out.println("enter the subject name for the above employee: ");
            sc.nextLine();
            this.grade[i] = sc.nextLine();
        }
    }
    void print(){
        for (int i=0;i<n;i++){
            System.out.println("name of the typist "+(i+1)+": "+super.name[i]);
            System.out.println("employee id of typist "+(i+1)+": "+super.id[i]);
            System.out.println("working hours of the typist"+(i+1)+": "+super.whours[i]);
            System.out.println("speed of the typist"+(i+1)+": "+super.grade[i]);
        }
    }
}
public class staff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. teacher\n2. typist\n3. officer");
        System.out.print("enter your choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                teacher t = new teacher();
                t.details();
                t.dets();
                t.print();
                break;
            case 2:
                typist p = new typist();
                p.details();
                p.dets();
                p.print();
                break;
            case 3:
                officer o = new officer();
                o.details();
                o.dets();
                o.print();
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
    }
}
