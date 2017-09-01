import java.util.ArrayList;
import java.util.List;

public class myBank {
    private String bankName;
    List<myProduct> products = new ArrayList<>();

    public List<myProduct> getProducts() {
        return products;
    }
    public myBank(String bankName) {
        this.bankName = bankName;
    }



    public void addMyProduct(myProduct product){
        products.add(product);
    }
}
