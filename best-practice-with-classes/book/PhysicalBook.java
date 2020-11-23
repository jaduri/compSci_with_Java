
public class PhysicalBook extends Book{
    //declare attributes
    int shelf = 0;
    int aisle = 0;
    int floor = 0;

    //basic constructor
    PhysicalBook(){

    }

    //parametric constructor
    PhysicalBook(String title, int year, String publish, int pages, int shelf, int aisle, int floor){
        super(title, year, publish, pages);
        this.shelf = shelf;
        this.aisle = aisle;
        this.floor = floor;
    }

    //attribute accessors and mutators
    int getShelf(){
        return this.shelf;
    }
    void setShelf(int shelf){
        this.shelf = shelf;
    }
    int getAisle(){
        return this.aisle;
    }
    void setAisle(int aisle){
        this.aisle = aisle;
    }
    int getFloor(){
        return this.floor;
    }
    void setFloor(int floor){
        this.floor = floor;
    }

    //define methods
    void displayBookLocation(){
        int shelf = getShelf();
        int aisle = getAisle();
        int floor = getFloor();
        System.out.println("The book is located of shef "+shelf+", aisle "+aisle+", floor "+floor);
    }
}
