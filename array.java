import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int arr[][]=new int [2][3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print("enter the value of rows and columns: ");
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<2;i++){
            System.out.print("\t");
            for(int j=0;j<3;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
