import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Main {
    private List<myBank> bank = new ArrayList<>();

    @Test
    public void myTest() {
        Main main = new Main();

        myBank bank_1 = new myBank("AVAL");
        bank_1.addMyProduct(new myCredit("PLATINUM_Trash", 666, myProduct.Term.SIX,true,false));
        bank_1.addMyProduct(new myCredit("Trash", 6, myProduct.Term.TWO,false,true));
        bank_1.addMyProduct(new myCredit("PLATINUM", 6.755, myProduct.Term.TWELWE,true,false));
        bank_1.addMyProduct(new myCredit("P_T", 29.555, myProduct.Term.THREE,false,true));
        bank_1.addMyProduct(new myCredit("PL_Trash", 3678, myProduct.Term.ONE,true,false));


        main.bank.add(bank_1);

        myBank bank_2 = new myBank("PRIVAT");
        bank_1.addMyProduct(new myCredit("Trash", 99999, myProduct.Term.TWELWE,false,false));
         main.bank.add(bank_2);

        System.out.println(bank);
       assertEquals(main.myProductFilter(new myCreditFilter("PLATINUM_Trash", myProduct.Term.SIX, 666,true,false)));
    }

    public List<myProduct> myProductFilter(myCreditFilter filter){
        List<myProduct> filterPro = new ArrayList<>();
        for (myBank bank : bank){
            for (myProduct product : bank.getProducts()){
                if (filter.checkParameters(product))filterPro.add(product);
            }
        }
        return filterPro;
    }
}
