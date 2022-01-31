/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgedesignpattern;

/**
 *
 * @author mathe
 */
public interface BookshelfInterface {
    public void nextBook();
    
    public void previousBook();
    
    public void newBook(Book book);
    
    public void deleteBook(Book book);
    
    public void inspectBook();
    
    public void displayAllBooks();
}
