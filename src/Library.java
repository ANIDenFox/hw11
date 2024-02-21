public class Library {
    private Book[] books;
    private int len;

    public Library() {
        books = new Book[10];
    }

    public void addBook(Book book) {
        books[len] = book;
        len++;
    }

    public void removeBook(String bookName) {
        for (int i = 0; i < len; i++) {
            if (!books[i].getTitle().equals(bookName)) {
                continue;
            }
            for (int j = i; j < len - 1; j++) {
                books[j] = books[j + 1];
            }
            books[len - 1] = null;
            len--;
            break;
        }
        printAllBooks();
    }

    public void printAllBooks() {
        System.out.println("Книжки в бібліотеці:");
        for (int i = 0; i < len; i++) {
            System.out.print(i + 1 + " ");
            books[i].print();
        }
    }
}