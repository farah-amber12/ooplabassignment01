public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(int issueNumber) {
        super("Dastaan-e-Pakistan","History Dept", 2022);
        this.issueNumber = issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
