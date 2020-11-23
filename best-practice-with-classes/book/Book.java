
public class Book{
    //declare attributes
    private String title = "title";
    private int year = 0;
    private String publish = "publish";
    private int pages = 0;

    //basic constructor
    Book(){

    }

    //parametric constructor
    Book(String title, int year, String publish, int pages){
        this.title = title;
        this.year = year;
        this.publish = publish;
        this.pages = pages;
    }

    //attribute accessors and mutators
    String getTitle(){
        return this.title;
    }
    void setTitle(String title){
        this.title = title;
    }
    int getYear(){
        return this.year;
    }
    void setYear(int year){
        this.year = year;
    }
    String getPublish(){
        return this.publish;
    }
    void setPublish(String publish){
        this.publish = publish;
    }
    int getPages(){
        return this.pages;
    }
    void setPages(int pages){
        this.pages = pages;
    }
}
