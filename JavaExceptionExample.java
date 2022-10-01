 public class JavaExceptionExample{
        public static void main(String args[]){
            try{
                int data=100/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                String s=null;
                System.out.println(s.length());
            }
            catch(NullPointerException n){
                System.out.println(n);
            }
            try{
                String s="abc";
                int i=Integer.parseInt(s);
            }
            catch(NumberFormatException n){
                System.out.println(n);
            }
            try{
                int a[]=new int[5];
                a[10]=50;
            }
            catch(ArrayIndexOutOfBoundsException n){
                System.out.println(n);
            }
            try{
                String s="abc";
                System.out.println(s.substring(4,7));
            }
            catch(StringIndexOutOfBoundsException n){
                System.out.println(n);
            }
            System.out.println("rest of the code...");
        }
    }
