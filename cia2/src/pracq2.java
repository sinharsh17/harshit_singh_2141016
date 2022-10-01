import java.util.Scanner;

class advertisement {
    int advertisement_id[]=new int[100];
    String client_name[]=new String[100];
    int start_date[]=new int[100];
    int size_of_add[]=new int[100];
    int price_of_add[]=new int[100];
    Scanner sc=new Scanner(System.in);
    void reada(int n){
        for (int i=0;i<n;i++){
            System.out.println("enter the avertisement id: ");
            this.advertisement_id[i]=sc.nextInt();
            System.out.println("enter the client name: ");
            sc.nextLine();
            this.client_name[i]=sc.nextLine();
            System.out.println("enter the start date: ");
            this.start_date[i]=sc.nextInt();
        }
    }
    void displaya(int n){
        for (int i=0;i<n;i++){
            System.out.println(advertisement_id[i]);
            System.out.println(client_name[i]);
            System.out.println(start_date[i]);
        }
    }
}
class commercial extends advertisement{

    int size_of_add[]=new int[100];
    int price_of_add[]=new int[100];
    int price=5;
    void read(int n){
        for (int i=0;i<n;i++){
            System.out.println("enter the size of add: ");
            size_of_add[i]=sc.nextInt();
            price_of_add[i]=size_of_add[i]*price;
        }
    }
    void display(int n){
        int advertisement_id[]=new int[100];
        String client_name[]=new String[100];
        int start_date[]=new int[100];
        for (int i=0;i<n;i++) {
            System.out.println(super.advertisement_id[i]);
            System.out.println(super.client_name[i]);
            System.out.println(super.start_date[i]);
            System.out.println(size_of_add[i]);
            System.out.println(price_of_add[i]);
        }
    }
}
class pracq2{
    public static void main(String[] args) {
        advertisement a=new advertisement();
        commercial c=new commercial();
        Scanner sc=new Scanner(System.in);
        int n;
        n=2;
        c.reada(n);
        c.displaya(n);
        c.read(n);
        c.display(n);
    }
}
