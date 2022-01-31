
package bridgedesignpattern;

public class BridgeDesignPattern {

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        
        manager.bookshelf = Bookshelf.getBookshelf();
        
        Book book = new Book("Leo Tolstói", "Guerra e Paz", "description");
        manager.delete(book);
        
        manager.displayAll();
        
        manager.newBook(new Book("Leo Tolstói","Guerra e Paz","description"));
        
        manager.displayAll();
        
        manager.inspect();
        
        manager.next();
        
        manager.inspect();
        
        
    }
    
}
