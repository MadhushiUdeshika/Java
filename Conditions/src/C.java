public class C {
    void plus(){
        int a = 10;
        long b = 123456;
        long c = a + b;
        if (c<1000000 | c == 123) { // | = or
            System.out.println(c + "calling if");
        } else {
            System.out.println(b);
        }
    }
}
    class D extends C{
        void minus(){
            double a = 123.456;
            double b = 456789.123456;
            double c = b - a;
            System.out.println(c);
            if (c<1000000 && c == 123.456) { // && = and
                System.out.println(c);
            } else if (c > 500000 && c<b){
                System.out.println(c + "calling else if");
            } else {
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        C c = new C();
        c.plus();
        D d = new D();
        d.minus();
    }
}
