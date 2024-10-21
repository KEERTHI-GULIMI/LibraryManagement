public class ResearchBooks extends LibraryItems  {

    private String author;

    public ResearchBooks(String title, String itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("ResearchBook name is" + getTitle() + "ResearchBookId" + getItemId() + author);
    }
}
