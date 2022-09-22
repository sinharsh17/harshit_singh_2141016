import java.util.Random;
import java.util.Scanner;

class wma{
    Scanner sc=new Scanner(System.in);
    void entry(){
        System.out.print("enter number of days: ");
        int n=sc.nextInt();
        float cp[]=new float[n];
        float wa[]=new float[n];
        int wasum=0;
        int sumw=0;
        Random rand=new Random();
        float r= rand.nextFloat(n);
        for (int i=0;i<n;i++){
            if (r!=0){
                cp[i]=r;
            }
            wa[i]=cp[i]*(i+1);
            wasum+=wa[i];
            sumw+=(i+1);
            System.out.println("closing price: "+cp[i]);
            System.out.println("weighted average: "+wa[i]);
        }
        int wma=wasum/sumw;
        System.out.println("weighted average mean: "+wma);
    }
}
class ema {
    void entry() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of days: ");
        int n = sc.nextInt();
        Random rand = new Random();
        float r = rand.nextFloat(n);
        float pv[]=new float[n];
        float sma[]=new float[n];
        float sum=0;
        float sema[]=new float[n];
        for (int i = 0; i < n; i++) {
            if (r != 0) {
                pv[i]=r;
            }
            sum+=pv[i];
            sum=sum/n;
            float wm=2/(n+1);
            sema[i]= (float)(pv[i]*wm+pv[i]*(1-wm));
        }
        for (int i=0;i<n;i++){
            System.out.println(pv[i]);
            System.out.println(sema[i]);
        }
    }
}
public class average {
    public static void main(String[] args) {
        wma w=new wma();
        w.entry();
        ema e=new ema();
        e.entry();
    }
}
