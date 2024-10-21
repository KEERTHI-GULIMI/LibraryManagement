import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItems> items = new ArrayList<>();

    public void addItem(LibraryItems item) {
        items.add(item);
        System.out.println(item.getTitle() + "  is added to the library");
    }

    public void borrowItem(String itemId) {
        for (LibraryItems i : items) {
            if (i.getItemId().equals(itemId)) {
                i.borrowItem();
                break;
            }
        }

        System.out.println("item not found");
    }

    public void returnItem(String itemId) {
        for (LibraryItems i : items) {
            if (i.getItemId().equals(itemId)) {
                i.returnItem();
                break;
            }
        }
        System.out.println("item not found");
    }

    public void displayAllItems() {
        System.out.println("Library items ");
        for (LibraryItems i : items) {
            i.displayDetails();
        }
    }


}
