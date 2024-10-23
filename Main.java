import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException,InterruptedException {
        Library library = new Library();

        Novel novel1 = new Novel("The Great Gatsby ", "B001 ", "F. Scott Fitzgerald");
        Novel novel2 = new Novel("1984 ", "B002 ", "George Orwell ");
        Magazines magazines = new Magazines("Time ", "M001 ", "August 2024 ");
        ResearchBooks researchBooks = new ResearchBooks("Inception ", "D001 ", "Blu-ray ");

        library.addItem(novel1);
        library.addItem(novel2);
        library.addItem(magazines);
        library.addItem(researchBooks);

        library.displayAllItemsAsync();

        Person person = new Person("keerthi ", "M001 ");

        Future<String> borrowFuture1=library.borrowItemAsync(person,"B001");


        Future<String> returnFuture1=library.returnItemAsync(person,"B001");

        System.out.println(borrowFuture1.get());
        System.out.println(returnFuture1.get());

        library.shutdown();
    }
}
