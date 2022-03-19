import classes.Book;
import classes.Magazine;
import classes.Manual;
import classes.PrintedPublication;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PrintedPublication book = new Book();
        PrintedPublication magazine = new Magazine();
        PrintedPublication manual = new Manual();
        PrintedPublication new_book = new Book();
        System.out.println(PrintedPublication.showList());
    }
}
