package cia2.src;
import java.util.Scanner;

abstract class ug{
    static int n;
    String[] name=new String[100];
    int []book=new int[100];
    Scanner sc=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);
    void a(){
        String name[]=new String[100];
        int book[]=new int[100];
        System.out.println("enter the number of students: ");
        n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("enter the name: ");
            this.name[i]=sc2.nextLine();
            System.out.println("enter the number of books: ");
            this.book[i]= sc.nextInt();
        }
    }
    abstract void d();
}
class pg extends ug{
    void d(){
        for (int i=0;i<n;i++){
            System.out.println(super.name[i]);
            System.out.println(super.book[i]);
        }
    }
    void f(){
        for (int i=0;i<n;i++){
            if(super.book[i]<5){
                System.out.println(super.book[i]);
                System.out.println("rewarded");
            }
            if (super.book[i]>5){
                System.out.println(super.book[i]);
                System.out.println("fined");
            }
        }
    }
}
public class lms {
    public static void main(String[] args) {
        pg p=new pg();
        p.a();
        p.d();
        p.f();
    }
}
