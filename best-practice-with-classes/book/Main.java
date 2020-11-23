
public class Main{
    public static void main(String[] args){

        PhysicalBook book = new PhysicalBook("Journey never ends", 1994, "Joseph", 90, 660, 19, 2);
        EBook ebook = new EBook("Journey never ends", 1994, "Joseph", 90, "www.youtube.com");

        book.displayBookLocation();
        System.out.println(ebook.getUrl());

    }
}
