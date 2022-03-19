import classes.*;
import lists.PublicationList;
import lists.*;

public class Main {

    public static void main(String[] args) {
        PrintedPublication book = new Book();
        PrintedPublication magazine = new Magazine();
        PrintedPublication manual = new Manual();
        PrintedPublication new_book = new Book();
        System.out.println(PrintedPublication.showList());
    }
}
