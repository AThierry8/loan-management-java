
public class Guarantor {

    private int guarantorId;
    private String guarantorName;
    private String guarantorEmail;
    private String guarantorPhone;
    private double monthlyIncome;

    public Guarantor(int guarantorId, String guarantorName,
                     String guarantorEmail, String guarantorPhone,
                     double monthlyIncome) {
        this.guarantorId = guarantorId;
        this.guarantorName = guarantorName;
        this.guarantorEmail = guarantorEmail;
        this.guarantorPhone = guarantorPhone;
        this.monthlyIncome = monthlyIncome;
    }

    public int getGuarantorId() {
        return guarantorId;
    }

    public String getGuarantorName() {
        return guarantorName;
    }

    public String getGuarantorEmail() {
        return guarantorEmail;
    }

    public String getGuarantorPhone() {
        return guarantorPhone;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setGuarantorName(String guarantorName) {
        this.guarantorName = guarantorName;
    }

    public void setGuarantorEmail(String guarantorEmail) {
        this.guarantorEmail = guarantorEmail;
    }

    public void setGuarantorPhone(String guarantorPhone) {
        this.guarantorPhone = guarantorPhone;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
}
