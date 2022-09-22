import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int a[]=new int [5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
            if(a[i]<=95){
                System.out.println(a[i]+5);
            }
            if (a[i]>95){
                a[i]=100;
                System.out.println(a[i]);
            }
        }
    }
}
