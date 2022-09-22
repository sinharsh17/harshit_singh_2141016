public class WString {
    public static void main(String[] args) {
        char chars[]={'a','b','c','d','e','f'};
        String s=new String(chars,2,3);
        System.out.println(s);
        char ch[]={'j','a','v','a'};
        String sw1=new String(ch);
        String sw2=new String(sw1);
        System.out.println(sw1.length());
        System.out.println(sw1);
        System.out.println(sw2);
        String s3="abc";
        System.out.println("abc".length());
        char ch1="abc".charAt(2);
        System.out.println(ch1);
        System.out.println(sw1.equals(ch));
        String sw3="hello";
        String sw4="HELLO";
        System.out.println(sw3.equals(sw4));
        System.out.println(sw3.equalsIgnoreCase(sw4));
        boolean b1="THE MAN".startsWith("THE");//case sensitive
        boolean b2="win the crowd".endsWith("crowd");
        boolean b3="THE MAN".startsWith("the");//case sensitive
        boolean b4="win the crowd".endsWith("CROWD");
        System.out.println(b1);
        System.out.println(b2);
        String sw6="serve for the nation";
        int a=sw6.indexOf('e');
        System.out.println(a);
        int b=sw6.lastIndexOf('e');
        System.out.println(b);
        System.out.println(sw6.indexOf("er",10));
        System.out.println(sw6.substring(1,4));
//        as we know that
    }
}
