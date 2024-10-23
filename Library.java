import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Library {

    private final ArrayList<LibraryItems> items = new ArrayList<>();
    private ExecutorService executor = Executors.newFixedThreadPool(5);


    public void addItem(LibraryItems item) {
        items.add(item);
        System.out.println(item.getTitle() + "  is added to the library");
    }

    public Future<String> borrowItemAsync(Person person, String itemId) {
        Callable<String> task = () -> {
            for (LibraryItems i : items) {
                if (i.getItemId().equals(itemId)) {
                    person.borrowItem(i);
                    return i.getTitle() + " borrowed by" + person.getName();
                }
            }

            return "item not found";
        };

        return executor.submit(task);
    }

    public Future<String> returnItemAsync(Person person, String itemId) {
        Callable<String> task = () -> {
            for (LibraryItems i : items) {
                if (i.getItemId().equals(itemId)) {
                    person.returnItem(i);
                    return i.getTitle() + " returned by " + person.getName();
                }
            }
            return "item not found";
        };

        return executor.submit(task);
    }

    public void displayAllItemsAsync() {
        executor.submit(() -> {
            System.out.println("Library items ");
            for (LibraryItems i : items) {
                i.displayDetails();
            }
        });
    }

    public void shutdown(){
        executor.shutdown();
        System.out.println("Library system shutting down...");
    }

}
