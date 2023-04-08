public class CentralBank {
    void leasingRate(){
        System.out.println("30% below");
    }
}
class CommercialBank extends CentralBank{
    void housingLoanRate(){
        System.out.println("25%");
    }
    void leasingRate(){
        System.out.println("25%");
    }
}
class CommercialLeasing extends CommercialBank{
    void leasingRate(){
        System.out.println("23%");
    }
}
class CommercialCredit extends CommercialBank{

    void housingLoanRate(){
        System.out.println("20%");
    }void leasingRate(){
        System.out.println("22%");
    }
}
class RateResult{
    public static void main(String[] args) {
        CentralBank c = new CentralBank();
        CentralBank cb = new CommercialBank();
        CentralBank cl = new CommercialLeasing();
        CentralBank cc = new CommercialCredit();
        c.leasingRate();
        cb.leasingRate();
        cl.leasingRate();
        cc.leasingRate();
        //housingLoanRate method cannot be called using c, cb, cc
        //c- method belongs to subclass CommercialBank & super class CentralBank can not access it
        //cb, cc- create objects in super class & super class does not have the method

        CommercialBank cbl,ccl;
        cbl = new CommercialBank();
        ccl = new CommercialCredit();
        cbl.housingLoanRate();
        ccl.housingLoanRate();
    }
}