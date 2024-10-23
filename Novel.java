public class Novel extends LibraryItems {

    private String author;

    public Novel(String title, String itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Novel " + getTitle() + " NovelId " + getItemId() + author);
    }
}
