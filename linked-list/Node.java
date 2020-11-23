
public class Node{
  //attributes
  private String data;
  private Node next;

  //constructors
  Node(){
    this.data = "data";
    this.next = null;
  }
  Node(String data){
    this.data = data;
  }

  // accessors and mutators
  public void setData(String data){
    this.data = data;
  }
  public String getData(){
    return this.data;
  }
  public void setNext(Node next){
    this.next = next;
  }
  public Node getNext(){
    return this.next;
  }

  //method to print node data
  public void printNode(){
    System.out.print(this.data+"->");
  }
}
