public class Main {
    static int a = 30;
    static int b;
    static int c;
    static {
        System.out.println("1st Block");
        b = a + 10;
    }
    static {
        System.out.println("2nd Block");
        c = 50;
    }
    static void show() {
        System.out.println("a = " + a);
        System.out.println("a = " + b);
        System.out.println("a = " + c);
    }
    public static void main(String[] args) {
        show();
    }
}