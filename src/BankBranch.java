public class BankBranch {
    // attributes
    private int branchId;
    private String branchName;
    private String branchCode;
    private String branchLocation;
    private String branchManager;

    // constructor

    public BankBranch(int branchId, String branchName, String branchCode,
            String branchLocation, String branchManager) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.branchCode = branchCode;
        this.branchLocation = branchLocation;
        this.branchManager = branchManager;

    }

    // getters and setters

    public void setBranchId(int branchId){
        this.branchId= branchId;
    }
    public void setBranchName(String branchName){
        this.branchName=branchName;
    }

}