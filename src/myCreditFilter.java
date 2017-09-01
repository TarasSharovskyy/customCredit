public class myCreditFilter extends myFilter {
    private Boolean increaceTheLimit;
    private Boolean earlyPayment;

    public myCreditFilter(String name, myProduct.Term term, double rate, boolean increaceTheLimit, boolean earlyPayment) {
        super(name, term, rate);
        this.increaceTheLimit = increaceTheLimit;
        this.earlyPayment = earlyPayment;
    }

    @Override
    public boolean checkParameters(myProduct product) {
        myCredit credit = (myCredit) product;
        if (earlyPayment !=null&&earlyPayment.equals(credit.isEarlyPayment()))
            return false;
        if (increaceTheLimit!=null && !increaceTheLimit.equals(credit.isIncreaceTheLimit()))
            return false;

        return true;
    }
}
