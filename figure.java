class figure1{
    double dim1;
    double dim2;
    figure1(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    double area(){
        return 23.4;
    }
}
class rectangle1 extends figure1{
    rectangle1(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("dimension of rectangle is: ");
        return dim1*dim2;
    }
}
class triangle1 extends figure1{
    triangle1(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("dimension of triangle is: ");
        return((1%2)*dim1*dim2);
    }
}
public class figure {
    public static void main(String[] args) {
        figure1 f=new figure1(10,10);
        rectangle1 r1=new rectangle1(18,20);
        triangle1 t1=new triangle1(22,24);
        figure1 figref;
        figref=r1;
        System.out.println(figref.area());
        figref=t1;
        System.out.println(figref.area());
    }
}
