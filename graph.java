import java.util.Scanner;
public class graph{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        int t[]=new int[100];
        int b[]=new int[100];
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            t[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int flag=0;
//        for (int i=0;i<n;i++){
//            if (t[i+1]>t[i]&&b[i+1]>b[i]){
//                flag=1;
//            }
//            else if (t[i+1]<t[i]&&b[i+1]<b[i]){
//                t[i+1]+=i++;
//                b[i+1]+=i++;
//            }
//        }
        for (int i=0;i<n;i++){

        }
        if (flag==1){
            System.out.println("graph increasing");
        }
    }
}
