public class myProduct {
    private String name;
    private double rate;
    private Term term;

    public myProduct(String name, double rate, Term term) {
        this.name = name;
        this.rate = rate;
        this.term = term;
    }

    public enum Term{
        ONE, TWO, THREE, SIX, NINE, TWELWE;
    }

    public String getName() {
        return name;
    }

    public Term getTerm() {
        return term;
    }

    public double getRate() {
        return rate;
    }
}
