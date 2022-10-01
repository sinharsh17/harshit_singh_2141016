import java.util.Scanner;

class a{
    int ar[]=new int[5];
    Scanner sc=new Scanner(System.in);
    void read(){
        for (int i=0;i<5;i++){
            this.ar[i]=sc.nextInt();
        }
    }
}
class b extends a{
    void print(){
        for (int i=0;i<5;i++){
            System.out.println(super.ar[i]);
        }
    }
}
public class pracq3 {
    public static void main(String[] args) {
        b as=new b();
        as.read();
        as.print();
    }

}
