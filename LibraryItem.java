import java.util.Objects;

public class LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;

    LibraryItemType itemType;



    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public LibraryItem() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryItem that = (LibraryItem) o;
        return year == that.year && isBorrowed == that.isBorrowed && Objects.equals(title, that.title) && Objects.equals(author, that.author) && itemType == that.itemType;
    }

}
