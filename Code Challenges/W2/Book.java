public class Book {
    private String title;
    private Author author;
    private double price;

    public Book() {
        this.title = "unknown";
        this.author = new Author();
        this.price = 0.0;
    }

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String authorFirstName, String authorLastName, double price) {
        this.title = title;
        this.author = new Author(authorFirstName, authorLastName);
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author.getFullName());
        System.out.println("Price: " + price);
    }

    public String getAuthor() {
        return author.getFullName();
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setAuthor(String authorFirstName, String authorLastName) {
        this.author = new Author(authorFirstName, authorLastName);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return title + " by " + author.getFullName();
    }

}
