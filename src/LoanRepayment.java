
public class LoanRepayment {

    private int repaymentId;
    private LoanApplication loanApplication;
    private double repaymentAmount;
    private String repaymentDate;
    private LoanOfficer processedBy;

    public LoanRepayment(int repaymentId,
                         LoanApplication loanApplication,
                         double repaymentAmount,
                         String repaymentDate,
                         LoanOfficer processedBy) {
        this.repaymentId = repaymentId;
        this.loanApplication = loanApplication;
        this.repaymentAmount = repaymentAmount;
        this.repaymentDate = repaymentDate;
        this.processedBy = processedBy;
    }

    public int getRepaymentId() {
        return repaymentId;
    }

    public LoanApplication getLoanApplication() {
        return loanApplication;
    }

    public double getRepaymentAmount() {
        return repaymentAmount;
    }

    public String getRepaymentDate() {
        return repaymentDate;
    }

    public LoanOfficer getProcessedBy() {
        return processedBy;
    }

    public void setRepaymentAmount(double repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public void setProcessedBy(LoanOfficer processedBy) {
        this.processedBy = processedBy;
    }
}
