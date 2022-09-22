interface camera{
    void takesnap();
    void recordvideo();
    default void record4kvideo(){
        System.out.println("recording in 4k");
    }
}
interface wifi{
    String[] getnetworks();
    void connecttonetwork(String network);
}
class mycellphone{
    void callnumber(int phno){
        System.out.println("calling"+phno);
    }
    void pickcall(){
        System.out.println("connecting...");
    }
}

class smartphone extends mycellphone implements wifi,camera{
    public void takesnap() {
        System.out.println("clicked picture");
    }
    public void recordvideo() {
        System.out.println("recording");
    }
    public void record4kvideo(){
        System.out.println("taking snap and recording in 4k");
    }
    public String[] getnetworks(){
        System.out.println("list of networks");
        String[] networklist={"harry","prashanth","anjali"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("connecting to"+ network);
    }
}
public class Interface {
    public static void main(String[] args) {
        smartphone sp=new smartphone();
        sp.record4kvideo();
        String[] ar=sp.getnetworks();
        for (String item:ar){
            System.out.println(item);
        }
    }
}
