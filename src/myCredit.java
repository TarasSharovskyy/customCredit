public class myCredit extends myProduct {
    private boolean increaceTheLimit;
    private boolean earlyPayment;

    public myCredit(String name, double rate, Term term, boolean increaceTheLimit, boolean earlyPayment) {
        super(name, rate, term);
        this.increaceTheLimit = increaceTheLimit;
        this.earlyPayment = earlyPayment;
    }

    public boolean isIncreaceTheLimit() {
        return increaceTheLimit;
    }

    public boolean isEarlyPayment() {
        return earlyPayment;
    }

}
