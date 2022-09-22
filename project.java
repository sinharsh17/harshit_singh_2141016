import java.util.Scanner;
class engine{
    Scanner sc1=new Scanner(System.in);
    void option(){
        System.out.println("1. start engine\n2. stop engine \n3. change driving mode");
    }
    int ch1= sc1.nextInt();
    void start(){
        System.out.println("engine start");
    }
    void stop(){
        System.out.println("engine stop");
    }
    void mode(int ch2){
        if(ch2==1){
            System.out.println("sport mode selected");
        }
        if(ch2==2){
            System.out.println("city mode selected");
        }
        if (ch2==3){
            System.out.println("normal mode selected");
        }
    }
    void start_stop(int ch1){
        if(ch1==1){
            start();
        }
        if (ch1==2){
            stop();
        }
        if (ch1==3){
            System.out.println("1. sports mode\n2. city mode\n3. normal mode");
            int ch2= sc1.nextInt();
            mode(ch2);
        }

    }
    void set_speed(){
        System.out.print("enter the speed: ");
        int speed=sc1.nextInt();
    }

}
public class project {
    public static void main(String[] args) {
        System.out.println("welcome to tesla model x.");
        System.out.println("1. engine\n2. a/c\n3. sunroof\n4. drive mode\n5. infotainment");
        System.out.print("please enter your choice: ");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        if (ch==1) {
            engine e = new engine();
        }
    }
}
