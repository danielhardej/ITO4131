public class BookDemo {
    
    public static void main(String[] args) {
        Book devJava = new Book("Developing Java Software", "Russel", "Winderand", 79.75);
        // using the toString method
        System.out.println(devJava);
        //using the display method
        devJava.display();
        System.out.println("--------------------");
        // Using the Author constructor
        Book anotherBook = new Book("1984", new Author("George", "Orwell"), 9.99);
        // using the toString method
        System.out.println(anotherBook);
        //using the display method
        anotherBook.display();
    }
}
