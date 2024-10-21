import java.util.ArrayList;

public class Person {
    private String name;
    private String memberId;
    private ArrayList<LibraryItems> items;

    public Person(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void borrowItem(LibraryItems item) {

        if (!item.isBorrowed()) {
            item.borrowItem();
            items.add(item);
        } else {
            System.out.println(item.getTitle() + " has already borrowed");
        }
    }

    public void returnItem(LibraryItems item) {

        if (items.contains(item)) {
            item.returnItem();
            items.remove(item);
        } else {
            System.out.println(item.getTitle() + " has not borrowed by" + name);
        }
    }

    public void displayItems() {
        System.out.println(name + "has borrowed");
        for (LibraryItems i : items) {
            i.displayDetails();
        }
    }


}
