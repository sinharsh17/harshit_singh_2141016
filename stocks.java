import java.util.Random;
import java.util.Scanner;

class value{
    void entry(){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number of days: ");
        int n=sc.nextInt();
        Random rand=new Random(n);
        float price[]=new float [n];
        for (int i=0;i<n;i++) {
            price[i] = rand.nextFloat(n);
            System.out.println(price[i]);
        }
        float avg=0;
        for (int i=0;i<n;i++){
            avg=avg+price[i];
        }
        System.out.println("average: "+(avg/n));
    }
}
public class stocks {
    public static void main(String[] args) {
        value v=new value();
        v.entry();
//        exponential moving average
    }
}
//p5: static variable,method
