public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Novel novel1 = new Novel("The Great Gatsby ", "B001 ", "F. Scott Fitzgerald");
        Novel novel2 = new Novel("1984 ", "B002 ", "George Orwell ");
        Magazines magazines = new Magazines("Time ", "M001 ", "August 2024 ");
        ResearchBooks researchBooks = new ResearchBooks("Inception ", "D001 ", "Blu-ray ");

        library.addItem(novel1);
        library.addItem(novel2);
        library.addItem(magazines);
        library.addItem(researchBooks);

        library.displayAllItems();

        Person person = new Person("keerthi ", "M001 ");

        person.borrowItem(novel1);
        person.borrowItem(novel2);
        person.returnItem(magazines);

        person.displayItems();

        library.displayAllItems();
    }
}
