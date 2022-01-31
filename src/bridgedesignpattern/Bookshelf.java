
package bridgedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf implements BookshelfInterface{
    private static Bookshelf bookshelf;
    private List<Book> books;
    
    private int current = 0;
    
    private Bookshelf() {
        books = new ArrayList<Book>();
        books.add(new Book("Jane Austen", "Orgulho e Preconceito", "description"));
        books.add(new Book("George Orwell", "1984", "description"));
        books.add(new Book("Miguel de Cervantes", "Dom Quixote de la Mancha", "description"));
        books.add(new Book("Antoine de Saint-Exupéry", "O Pequeno Príncipe", "description"));
        books.add(new Book("Machado de Assis", "Dom Casmurro", "description"));
        books.add(new Book("Louis de Bernières", "O Bandolim do Capitão Corelli", "description"));
        books.add(new Book("Alexandre Dumas", "O Conde de Monte Cristo", "description"));
        books.add(new Book("Arthur Conan Doyle", "Um Estudo em Vermelho", "description"));
        books.add(new Book("Franz Kafka", "O Processo", "description"));
        books.add(new Book("Gabriel García Márquez", "Cem Anos de Solidão", "description"));
        books.add(new Book("Joseph Conrad", "O Coração das Trevas", "description"));
        books.add(new Book("Isaac Asimov", "Eu, Robô", "description"));
        books.add(new Book("J. R. R. Tolkien", "O Senhor dos Anéis", "description"));
        books.add(new Book("Leo Tolstói", "Guerra e Paz", "description"));
        books.add(new Book("João Guimarães Rosa", "Grande Sertão: Veredas", "description"));
    }
    
    public static Bookshelf getBookshelf(){
        if(bookshelf == null)
        {
            bookshelf = new Bookshelf();
        }
        return bookshelf;
    }
    
    @Override
    public void nextBook() {
    if( current <= books.size() - 1 )  
        current++;  
    System.out.println("Changed to book: " + books.get(current).getTitle());  
    }

    @Override
    public void previousBook() {
    if( current > 0)  
        current--;  
    System.out.println("Changed to book: " + books.get(current).getTitle()); 
    }

    @Override
    public void newBook(Book book) {
        books.add(book);
    }

    @Override
    public void deleteBook(Book book) {
        books.remove(book);
    }

    @Override
    public void inspectBook() {
        System.out.println(books.get(current).toString());
    }

    @Override
    public void displayAllBooks() {
        for(Book book: books)
        {
            System.out.println(book.toString());
        }
    }
    
}
