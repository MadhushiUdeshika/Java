public class GrandFather {
    void swim(){
        System.out.println("Swimming");
    }
}
class Father extends GrandFather{
    @Override
    void swim() {
        System.out.println("Swimming in river");
    }
}
class Son extends Father{
    @Override
    void swim() {
        System.out.println("Swimming in the pool");
    }

    public static void main(String[] args) {
        GrandFather gf, f, s;   //variable names of Grandfather class
        gf = new GrandFather();
        f = new Father();
        s = new Son();
        gf.swim();
        f.swim();
        s.swim();
    }
}