public class Company {
    String brandname;
    Company(){
        brandname = "Apple";
    }

    public static void main(String[] args) {
        Company c = new Company();
        System.out.println(c.brandname);
    }
}
