public class Main {
    public static void main(String[] args) {
    //string only
        String str="Hello";
        str.toUpperCase();
        String str2=new String( "Hello");
        System.out.println(str.equals(str2));
        //stringBuffer
        StringBuffer name=new StringBuffer("Aayush");
        name.append("Mandavya");//this will modify stringbuffer
        System.out.println(name);
    }
}