import java.io.*;
import java.util.*;

//program 4
class matchfix {
    String random_string;
        String name () {
            String group1[] = new String[5];
            String group2[] = new String[5];
            Scanner sc1 = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.print("enter the name " + (i + 1) + " of group 1 : ");
                group1[i] = sc1.nextLine();
            }
            for (int i = 0; i < 5; i++) {
                System.out.print("enter the name " + (i + 1) + " of group 2 : ");
                group2[i] = sc1.nextLine();
            }
            Random rand = new Random();
            int i = rand.nextInt(5);
            int j = rand.nextInt(5);
            random_string = (group1[i] + " vs " + group2[j]);
            System.out.println(random_string);
            return random_string;
        }
        int winp () {
            System.out.println("winning probability");
            int kills = 10;
            int rounds = 5;
            int p = (kills * rounds) / 2;
            return p;
        }
        int winp ( int kills, int rounds){
            System.out.println("winning probability");
            kills = 20;
            rounds = 5;
            int p = (kills * rounds) / 3;
            return p;
        }
    }

//program 5
    class sponsors{
    static Scanner sc2 = new Scanner(System.in);
    static String print(){
        String b="enter the number of sponsors: ";
        return b;
    }
    static String name[] = new String[100];
    static float amt[] = new float[100];
    static int s;
        static void name() {
            System.out.print("enter the number of sponsors: ");
            s = sc2.nextInt();
            for (int i = 0; i < s; i++) {
                System.out.println("enter the name of sponsor: ");
                sc2.nextLine();
                name[i] = sc2.nextLine();
                System.out.println("enter the amount sponsored: ");
                amt[i] = sc2.nextFloat();
            }
        }
            static void tax(){
            for (int i=0;i<s;i++){
                System.out.println(name[i]);
                System.out.println("tax evaded by the sponsor: "+amt[i]*6/100);
                }
            }
        }

//program 6
class name{
    Random rand=new Random();
    Scanner sc=new Scanner(System.in);
    int n;
    int un[]=new int[100];
    int pc[]=new int[100];
    void name1(){
        System.out.println("username generator");
        System.out.print("enter the number of usernames to be generated: ");
         n=sc.nextInt();
        int un[]=new int[100];
        for (int i=0;i<n;i++){
            this.un[i]=rand.nextInt(1000,9999);
        }
    }
}
class subname extends name{
    void passcode(){
        int pc[]=new int[100];
        for ( int i=0;i<n;i++){
            this.pc[i]=rand.nextInt(10000,99999);
        }
    }
}
//program 7
class subname2 extends subname{
    void usp(){
        int pc[]=new int[100];
        for ( int i=0;i<n;i++){
            System.out.println("username: "+" "+super.un[i]+" "+" "+"passcode: "+super.pc[i]);
        }
    }
    void print(){
        System.out.println("wassup bruh");
    }
}

class subname3 extends subname2{
    void print2() {
        print();
    }
}

abstract class cg{
    Scanner sc=new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    String[] co;
    int[] rev;
    void sort() throws IOException {
//        System.out.print("enter the number of companies: ");
        //n=sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.print("enter the name of company "+(i+1)+" : ");
            this.co[i]=br.readLine();
//            co[i]=this.co[i];
        }
        Arrays.sort(this.co);
//        Arrays.sort(this.rev);
//        for (int i=0;i<n;i++){
//            System.out.println(co[i]);
//        }
     };
    abstract void comc() throws IOException;
    }

class comgs extends cg{
    comgs(int n){
        cg.n = n;
        super.rev = new int[n];
        super.co = new String[n];
    }
    void comc() throws IOException{
        super.sort();
        for (int i=0;i<n;i++){
            System.out.println(super.co[i]);
        }
    }
}

public class harshit_singh_2141016 {

    public static void main(String[] args) throws IOException{
        int b,c;
        //program 1
        do {
            System.out.println("Domain: COD E-sports\n");
            System.out.println("1. player's K/D calculator\n2. weapon's damage list\n3. weapon recoil calculator\n4. tournament\n5. matchmaker\n6. winning probability calculator\n7. sponsors\n8. username passcode generator");
            Scanner sc = new Scanner(System.in);
            System.out.print("\nenter your choice: ");
            String choice=sc.nextLine();
            switch (choice){
                case "1":
                    System.out.print("enter the number of players: ");
                    int a;
                    while(true) {
                        try {
                            a = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("invalid input. enter an integer value.");
                        }

                        System.out.print("enter the number of players: ");
                        sc.nextLine();
                    }
                    String name[] = new String[a];
                    int kill[] = new int[a];
                    int death[] = new int[a];
                    float ratio[] = new float[a];
                    //program 1
                    for (int i = 0; i < a; i++) {
                        sc.nextLine();
                        System.out.print("enter the name of the player "+(i+1)+": ");
                        String n = sc.nextLine();
                        name[i] = n;
                        System.out.print("enter the number of kills for player "+(i+1)+": ");
                        while(true){
                            try {
                                int k = sc.nextInt();
                                kill[i] = k;
                                break;
                            }
                            catch (Exception e){
                                System.out.println("invalid input. enter an integer value.");
                            }
                            System.out.print("enter the number of kills for player "+(i+1)+": ");
                            sc.nextLine();
                        }
                        System.out.print("enter the number of deaths for player "+(i+1)+": ");
                        int d = sc.nextInt();
                        death[i] = d;
                        float kd = (float)kill[i]/(float)death[i];
                        ratio[i] = kd;
                        System.out.printf("The K/D is: %.2f ",kd);
                        System.out.println("\n");
                    }
                    int j=0;
                    while(j!=a){
                        System.out.println("\nname: "+name[j]);
                        System.out.println("kill: "+kill[j]);
                        System.out.println("death: "+death[j]);
                        System.out.printf("K/D: %.2f",ratio[j]);
                        j++;
                    }
                    break;
                case "2":
                    System.out.println("Primary Weapons");
                    System.out.println("Assault Rifles");
                    System.out.println("Gun\t  Level Unlock\t Description");
                    System.out.println("M4A1\t   1\t\t Despite being unlocked at rank 1, there are many reasons why this fully automatic gun is the assault rifle of choice for pro Call of Duty League players.\n");
                    System.out.println("FAL\t       1\t\t This is a semi-automatic gun (single shot) that can have a high rate of fire if you have a fast trigger finger.\n");
                    break;
                case "3":
                    do{
                    System.out.println("recoil calculator");
                    System.out.print("enter the gun name: ");
                    sc.nextLine();
                    String gname=sc.next();
                    System.out.println("enter the damage of gun: ");
                    int dmg=sc.nextInt();
                    System.out.println("enter the fire rate: ");
                    int fr=sc.nextInt();
                    float rcl=(float)dmg*100/(float)fr;
                    System.out.println(gname);
                    System.out.println(dmg);
                    System.out.println(fr);
                    System.out.println("recoil: "+rcl);
                        System.out.println("press 1 to check recoil for another weapon\npress 0 to quit");
                        System.out.print("\nenter your choice: ");
                        c=sc.nextInt();
                    }while(c!=0);
                    break;
                case "4":
                    System.out.println("tournament");
                    System.out.println("1. tournament winners\n2. tounament MVP\n3. tournament teams");
                    String ch= sc.nextLine();
                    //program 2
                    switch (ch){
                        case "1":
                            System.out.println("tournament winners");
                            System.out.print("enter the number of players: ");
                            int pnum=sc.nextInt();
                            System.out.print("enter the number of teams: ");
                            int pweap=sc.nextInt();
                            //program 3
                            String pname[][]=new String[pnum][pnum];
                             int twin[][]=new int[pnum][pweap];
                            int t[][]=new int[100][100];
                            for (int i=0;i<pnum;i++){
                                for (j=0;j<pweap;j++){
                                    System.out.print("enter the player "+(i+1)+" name: ");
                                    sc.nextLine();
                                    pname[i][j]=sc.nextLine();
                                    System.out.print("enter the team number and weapons used: ");
                                    twin[i][j]=sc.nextInt();
                                    t[i][j]=sc.nextInt();
                                    System.out.println(pname[i][j]);
                                    System.out.println(twin[i][j]);
                                    System.out.println(t[i][j]);
                                    break;
                                }
                            }
                            break;
                        case "2":
                            System.out.println("tournament MVP");
                            break;
                        case "3":
                            System.out.println("tournament teams");
                            break;
                        default:
                            System.out.println("invalid choice.");
                    }
                    break;
                case "5":
                    matchfix m=new matchfix();
                    System.out.println(m.name());
                    break;
                case "6":
                    matchfix w=new matchfix();
                    System.out.println("1. probability calculator with 2 tournament\n2. probability calculator with 3 torunament");
                    String ch1= sc.nextLine();
                    switch (ch1){
                        case "1":
                            System.out.println(w.winp());
                            break;
                        case "2":
                            System.out.println(w.winp(12,5));
                            break;
                        default:
                            System.out.println("invalid choice");
                    }
                    break;
                case "7":
                    sponsors s=new sponsors();
                    s.print();
                    System.out.println("1. names");
                    System.out.print("enter the choice: ");
                    String ch2= sc.nextLine();
                    switch (ch2){
                        case "1":
                            sponsors.name();
                            s.tax();
                            break;
                        default:
                            System.out.println("invalid choice");
                    }
                    break;
                case "8":
//                    name nam=new name();
                    subname2 sub=new subname2();
                    sub.name1();
                    sub.passcode();
                    sub.usp();
                    subname3 sub3=new subname3();
                    sub3.print();
                    break;
                case "9":
                    System.out.println("Enter the number of companies");
                    int na = sc.nextInt();
                    comgs cgs=new comgs(na);
//                    System.out.println("He;l;l");
                    cgs.comc();
//                    System.out.println("hello");
                    break;
                default:
                    System.out.println("enter a valid input.");
            }
            System.out.println("\n");
            System.out.print("do you wish to continue: ");
            b=sc.nextInt();
        }while(b!=0);
    }
}
