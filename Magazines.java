public class Magazines extends LibraryItems {


    private String author;

    public Magazines(String title, String itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine name is " + getTitle() + " MagazineId is " + getItemId() + author);
    }
}
