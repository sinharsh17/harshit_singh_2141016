class A{
    void callme(){
        System.out.println("insider a's callme method");
    }
}
class B extends A{
    void callme(){
        System.out.println("insider b's callme method");
    }
}
class C extends B{
    void callme(){
        System.out.println("insider c's callme method");
    }
}
public class ref {
    public static void main(String[] args) {
       A a=new A();
       B b=new B();
       C c=new C();
       A r;
       r=a;
       r.callme();
        r=b;
        r.callme();
        r=c;
        r.callme();
    }
}
