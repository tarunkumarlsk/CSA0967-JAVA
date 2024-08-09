package library;

public class Media {
    private String title;
    private String publisher;
    private int year;
    private boolean isAvailable;

    public Media(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Status: " + (isAvailable ? "Available" : "Borrowed"));
    }
}
