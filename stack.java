public class stack {
    private int a[]=new int [10];
    private int top;
    void push(int x){
        for (int i=0;i<10;i++){
            a[i]=x;
            top=a[i];
            a[i]++;
        }
    }
    int pop(){
        top--;
        return(top);
    }
    void display(){
        for (int i=0;i<10;i++){
            System.out.println(top);
        }
    }

    public static void main(String[] args) {
        stack s= new stack();
        s.push(10);
        s.push(20);
        s.display();
//        s.pop();
//        s.display();
    }
}
