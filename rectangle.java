class rec{
    int length;
    int width;
    rec(){
        length=width=10;
    }
    rec(int length,int width){
        this.length=length;
        this.width=width;
    }
    rec(rec x){
        this.length=x.length;
        this.width=x.width;
    }
    int recarea(){
        int area;
        area=length*width;
        return area;
    }
    int recper(){
        int per;
        per=2*(length*width);
        return per;
    }
}
public class rectangle {

    public static void main(String[] args) {
        rec r=new rec();
        System.out.println(r.recarea());
        System.out.println(r.recper());
    }
}
