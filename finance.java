class flatrate {
    static int interest() {
        int rate_of_interest = 10;
        int principal = 100000;
        int term = 5;
        int rateofinterest = ((principal/term)+(principal*rate_of_interest)/100)/12;
        return rateofinterest;
    }
}
public class finance {
    public static void main(String[] args) {
        flatrate f=new flatrate();
        System.out.println(f.interest());
    }
}
