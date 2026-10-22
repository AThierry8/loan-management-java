
public class LoanApplication {

    private int applicationId;
    private Customer customer;
    private LoanProduct loanProduct;
    private Guarantor guarantor;
    private double requestedAmount;

    public LoanApplication(int applicationId, Customer customer,
                           LoanProduct loanProduct,
                           Guarantor guarantor,
                           double requestedAmount) {
        this.applicationId = applicationId;
        this.customer = customer;
        this.loanProduct = loanProduct;
        this.guarantor = guarantor;
        this.requestedAmount = requestedAmount;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LoanProduct getLoanProduct() {
        return loanProduct;
    }

    public Guarantor getGuarantor() {
        return guarantor;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setLoanProduct(LoanProduct loanProduct) {
        this.loanProduct = loanProduct;
    }

    public void setGuarantor(Guarantor guarantor) {
        this.guarantor = guarantor;
    }

    public void setRequestedAmount(double requestedAmount) {
        this.requestedAmount = requestedAmount;
    }
}
