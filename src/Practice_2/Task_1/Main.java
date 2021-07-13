package Practice_2.Task_1;

public class Main {
    public static void main(String[] args) {

        Book Book_1 = new Book(1, "My grandfather was a cherry", "Angela Nanetti");
        Book Book_2 = new Book(2, "The man who took his wife for a hat", "Oliver Sachs");
        Book Book_3 = new Book(3, "When God was a rabbit", "Sarah Winman");
        Book Book_4 = new Book(4, "Aristotle and the anteater go to Washington", "Thomas Cathcart");
        Book Book_5 = new Book(5, "Champignon of my life", "Asar Eppel");

        Magazine magazine1 = new Magazine(1, "Talk about miniature donkeys");
        Magazine magazine2 = new Magazine(2, "Modern Drunkard");
        Magazine magazine3 = new Magazine(3, "Chimney sweep news");
        Magazine magazine4 = new Magazine(4, "Portable Toilet Operators Journal");
        Magazine magazine5 = new Magazine(5, "LEMON");

        Printable[] printables = {Book_1, Book_2, Book_3, Book_4, Book_5, magazine1, magazine2, magazine3, magazine4, magazine5};
        for (Printable printable : printables) {
            printable.print();
        }

        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}
