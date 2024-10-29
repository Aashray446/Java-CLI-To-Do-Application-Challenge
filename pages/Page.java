package pages;

public abstract class Page {
    public String title;
    public abstract void display();

    Page(String title){
        this.title = title;
    }
    
}
