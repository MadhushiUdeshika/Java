public class Aa {
    void method(){
    }
}
class Bb extends Aa{
    void newMethod(){
    }
    @Override
    void method() {
        System.out.println("aB");
    }
}
class Cc extends Bb{
    @Override
    void method() {
        System.out.println("bC");
    }
    @Override
    void newMethod() {
        System.out.println("Bc");
    }
}
class Run{
    public static void main(String[] args) {
        Aa a = new Aa();
        Aa b = new Bb();
        Aa c = new Cc();
        Bb bb = new Bb();
        bb.newMethod();
        Bb cc = new Cc();
        cc.newMethod();
    }
}