import java.util.Random;
public class array2 {
    public static void main(String[] args) {
        Random r=new Random();
        int a[]=new int[10];
        for(int i=0;i<10;i++){
            a[i]= r.nextInt(100);
        }
        for (int i=0;i<10;i++){
            System.out.println(a[i]);
        }
        for (int i=0;i<10;i++){
            int b=a[i];
            int count=0;
            for(int j=0;j<10;j++){
                if (b==a[j]){
                    count++;
                }
            }
            System.out.println(b+" is repeated "+count+" times");
        }
    }
}
