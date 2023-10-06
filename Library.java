public class Library {

    int addItem = 0;
    int borrowItem = 0;
    public void addItem(LibraryItem item){
        addItem++;
        System.out.println("number of added items: " + addItem);
    }
    public void borrowItems(LibraryItem item){
        borrowItem++;
        System.out.println("number of borrowed books:" +borrowItem);
    }
}
