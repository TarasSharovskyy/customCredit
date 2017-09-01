public class myFilter {
    private String name;
    private myProduct.Term term;
    private Double rate;

    public myFilter(String name, myProduct.Term term, double rate) {
        this.name = name;
        this.term = term;
        this.rate = rate;
    }

    public boolean checkParameters(myProduct product){
        if (name!=null&&!product.getName().toLowerCase().contains(name.toLowerCase()))
            return false;
        if (term!=null && !term.equals(product.getTerm()))
            return false;
        if (rate!=null && !rate.equals(product.getRate()))
            return false;

        return true;
    }
}
