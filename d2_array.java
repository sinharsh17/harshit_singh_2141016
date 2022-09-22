import java.util.Scanner;

public class d2_array {
    public static void main(String[] args) {
        int floor=2;
        int flat=3;
        int a[][]=new int [floor][flat];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<floor;i++){
            for (int j=0;j<flat;j++){
                System.out.print("enter details for "+i+" "+j+" : ");
                sc.nextInt();
                 a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<floor;i++){
            for (int j=0;j<flat;j++){
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
