package catalog;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Catalog {
    private ArrayList<Record> records;
    public Catalog() {
        this.records = new ArrayList<>();
    }
    public Record getRecord(int index) {return records.get(index);}
    public void addRecord(String readerFullName, String bookName, LocalDate issueDate, LocalDate deliveryDate){
        Record record = new Record(readerFullName, bookName, issueDate, deliveryDate);
        records.add(record);
    }
    public void removeRecord(int index) { records.remove(index); }
    private class Record{
        private String readerFullName;
        private String bookName;
        private LocalDate issueDate;
        private LocalDate deliveryDate;

        private Record(String readerFullName, String bookName, LocalDate issueDate, LocalDate deliveryDate){
            this.bookName = bookName;
            this.readerFullName = readerFullName;
            this.deliveryDate = deliveryDate;
            this.issueDate = issueDate;
        }

        public LocalDate getDeliveryDate() {
            return deliveryDate;
        }

        public LocalDate getIssueDate() {
            return issueDate;
        }

        public String getBookName() {
            return bookName;
        }

        public String getReaderFullName() {
            return readerFullName;
        }

        public void setDeliveryDate(LocalDate deliveryDate) {
            this.deliveryDate = deliveryDate;
        }

        public void setIssueDate(LocalDate issueDate) {
            this.issueDate = issueDate;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public void setReaderFullName(String readerFullName) {
            this.readerFullName = readerFullName;
        }

        @Override
        public String toString() {
            return "Record{" +
                    "readerFullName='" + readerFullName + '\'' +
                    ", bookName='" + bookName + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "records=" + records +
                '}';
    }
}
