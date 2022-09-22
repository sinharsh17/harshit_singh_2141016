import java.io.IOException;
import java.util.Scanner;

public class e{
    public static void main (String[] args) throws IOException {
        try{
            Scanner sc=new Scanner(System.in);
            int[]a=new int[2];
            System.out.println("enter the size of array: ");
            int n=sc.nextInt();
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("array out of bound");
        }
        catch (Exception e){
            System.out.println("enter integer");
        }
    }
}
