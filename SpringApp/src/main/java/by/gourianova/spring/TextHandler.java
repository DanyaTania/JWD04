package by.gourianova.spring;

public class TextHandler {
    private Book book;
    public TextHandler(Book book){
        this.book=book;
            }
    public void HandlingBook(){
        System.out.println("Handling: "+book.getBook());
            }
}
