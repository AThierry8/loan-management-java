
public class BankBranch {

    private int branchId;
    private String branchName;
    private String branchCode;
    private String branchLocation;
    private String branchManager;

    public BankBranch(int branchId, String branchName,
                      String branchCode, String branchLocation,
                      String branchManager) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.branchCode = branchCode;
        this.branchLocation = branchLocation;
        this.branchManager = branchManager;
    }

    public int getBranchId() {
        return branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public String getBranchManager() {
        return branchManager;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public void setBranchManager(String branchManager) {
        this.branchManager = branchManager;
    }
}
