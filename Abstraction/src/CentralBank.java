abstract public class CentralBank {
    abstract int interestRate();
}
class BOC extends CentralBank{
    @Override
    int interestRate() {
        return 5;
    }
}
class NDB extends CentralBank{
    @Override
    int interestRate() {
        return 10;
    }
}
class run{
    public static void main(String[] args) {
        CentralBank cb;
        cb = new BOC();
        System.out.println("Rate of interest is :- " + cb.interestRate() + "%");
        cb = new NDB();
        System.out.println("Rate of interest is :- " + cb.interestRate() + "%");

        //System.out.println("Rate of interest is :- " + cb.interestRate() + "%");
        //System.out.println("Rate of interest is :- " + cb.interestRate() + "%");
        //If we use this type to print it cannot be identified which one to print because both are same (cb)
    }
}