import java.util.Scanner;
class movingavg{
    Scanner sc=new Scanner(System.in);
    void movingavg(){
        System.out.println("enter number of days: ");
        int n=sc.nextInt();
        System.out.println("enter number of days for the calculation: ");
        int n1=sc.nextInt();
        double a[]=new double[n];
        double a1[]=new double[n];
        for (int i=0;i<n;i++){
            a[i]=Math.floor(Math.random());
            a1[i]=a[i]*(i+1);
        }
        double avg[]=new double[n-n1];
        int sum=0;
        for(int i=n;i<n1;i++){
            avg[i]=avg[i]+a1[i];
            sum=sum+(i+1);
            avg[0]=avg[i]/sum;
        }
        int c=0;
        for (int j=0;j<(n-n1);j++){
            for(int i=j;i<n;i++){
                if (c < n1) {
                    avg[i]=avg[i]+a1[i];
                    sum=sum+i;
                }
            }
            avg[j]=avg[j]/sum;
        }
        System.out.println("averages are: ");
        for (int i=0;i<n-n1;i++){
            System.out.println(" "+avg[i]);
        }
    }
}
public class cia1 {
    public static void main(String[] args) {
        movingavg x=new movingavg();
        x.movingavg();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of days: ");
        int n=sc.nextInt();
        System.out.println("enter number of days to be calculated: ");
        int m=sc.nextInt();
        int a[]=new int [n];
        int ema[]=new int[n-m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        int i=0;
        for (int j=0;j<n;j++){
            if(c<m){
                ema[j]=(a[i+1]-a[i])*2/(m+i)+a[i];
                c++;
            }
            ema[j]=ema[i];
        }
        System.out.println("exponential moving average: ");
        for(i=0;i<n-m;i++){
            System.out.println(""+ema[i]);
        }
    }
}
