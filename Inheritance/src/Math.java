public class Math {
    int p = 10;
    int q = 5;
    void add(){
        System.out.println(p+q);
    }
}
class Math01 extends Math
{
    void mul(){
        System.out.println(p*q);
    }
    void task(){
        System.out.println((p*p)+(q*q));
    }

    public static void main(String[] args) {
        Math01 m = new Math01();
        m.add();
        m.mul();
        m.task();
    }
}


