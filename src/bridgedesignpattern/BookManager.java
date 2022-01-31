
package bridgedesignpattern;

public class BookManager {
    protected BookshelfInterface bookshelf;
 
    public void next(){
        bookshelf.nextBook();
    }
    
    public void previous(){
        bookshelf.previousBook();
    }
    
    public void newBook(Book book){
        bookshelf.newBook(book);
    }
    
    public void delete(Book book){
        bookshelf.deleteBook(book);
    }
    
    public void inspect(){
        bookshelf.inspectBook();
    }
    
    public void displayAll(){
        System.out.println("----------------Books--------------");
        
        bookshelf.displayAllBooks();
        
        System.out.println("----------------     --------------");
    }
}
