import java.util.Scanner;

public class exceptionprac{
    public static void main(String[] args) {
        try{
            int[] mynum={1,2,3,4};
            System.out.println(mynum[10]);
        }
        catch (Exception e){
            System.out.println("array out of bound");
        }
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if (age<18){
            throw new ArithmeticException("access denied");
        }
        else {
            System.out.println("access granted");
        }
    }
}
