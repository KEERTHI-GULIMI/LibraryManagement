abstract class LibraryItems {

    private String title;
    private String itemId;
    private boolean isBorrowed;

    public LibraryItems(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowItem() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + "is borrowed");
        } else {
            System.out.println(title + "is not  borrowed");
        }
    }

    public void returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + "has been returned");
        } else {
            System.out.println(title + "was not borrowed");
        }
    }

    public abstract void displayDetails();


}