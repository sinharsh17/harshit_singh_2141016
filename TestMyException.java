import java.lang.Exception;
class Myexception extends Exception{
    Myexception(){

    }
    Myexception(String message){
        super(message);
    }
}
public class TestMyException {
    public static void main(String[] args) {
        int x=3,y=1000;
        try{
            double z=(double)x/(double)y;
            if(z<0.01){
                throw new Myexception("number is too small");
            }
        }
        catch (Myexception e){
            System.out.println("caught my exception");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finally block");
        }
    }
}
