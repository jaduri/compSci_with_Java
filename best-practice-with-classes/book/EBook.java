
public class EBook extends Book{
    //declare attributes
    private String url = "url";

    //basic constructor
    EBook(){

    }

    //parametric constructor
    EBook(String title, int year, String publish, int pages, String url){
        super(title, year, publish, pages);
        this.url = url;
    }

    //attribute mutator and accessor
    String getUrl(){
        return this.url;
    }
    void setUrl(String url){
        this.url = url;
    }
}
