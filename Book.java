    public class Book extends LibraryItem{
    private int pageCount;


    public Book(int pageCount) {
        super("Moth Smoke", "Mohsin Hamid", 2000);
        // super // "cant recall how to use super keyword to add constructor of parent class"
        this.pageCount = pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
}


