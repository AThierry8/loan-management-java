
public class LoanOfficer {

    private int officerId;
    private String officerName;
    private String officerEmail;
    private int yearsOfExperience;
    private BankBranch branch;

    public LoanOfficer(int officerId, String officerName,
                       String officerEmail, int yearsOfExperience,
                       BankBranch branch) {
        this.officerId = officerId;
        this.officerName = officerName;
        this.officerEmail = officerEmail;
        this.yearsOfExperience = yearsOfExperience;
        this.branch = branch;
    }

    public int getOfficerId() {
        return officerId;
    }

    public String getOfficerName() {
        return officerName;
    }

    public String getOfficerEmail() {
        return officerEmail;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public BankBranch getBranch() {
        return branch;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public void setOfficerEmail(String officerEmail) {
        this.officerEmail = officerEmail;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setBranch(BankBranch branch) {
        this.branch = branch;
    }
}
