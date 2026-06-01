public class logic {
    static int a = 10;
    public static void main(String[] args){
        third();
        int  a = 20;
        System.out.println("One : - "+a);
        second();
    }
    public static void second(){
       int a = 40;
        System.out.println("Two : - "+a);
    }
    public static void third(){
        System.out.println("Three : - "+a);
    }
}
