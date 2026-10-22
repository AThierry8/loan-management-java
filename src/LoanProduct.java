
public class LoanProduct {

    private int productId;
    private String productName;
    private double interestRate;
    private double maximumLoanAmount;
    private int maximumRepaymentMonths;

    public LoanProduct(int productId, String productName,
                       double interestRate,
                       double maximumLoanAmount,
                       int maximumRepaymentMonths) {

        this.productId = productId;
        this.productName = productName;
        this.interestRate = interestRate;
        this.maximumLoanAmount = maximumLoanAmount;
        this.maximumRepaymentMonths = maximumRepaymentMonths;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getMaximumLoanAmount() {
        return maximumLoanAmount;
    }

    public int getMaximumRepaymentMonths() {
        return maximumRepaymentMonths;
    }

    // Calculate using this product's own rate and period
    public double calculateRepayable(double principal) {
        return calculateRepayable(
            principal,
            interestRate,
            maximumRepaymentMonths
        );
    }

    // Overloaded method
    public double calculateRepayable(double principal,
                                     double annualRate,
                                     int months) {

        double interest = principal
                * (annualRate / 100)
                * (months / 12.0);

        return principal + interest;
    }
}

