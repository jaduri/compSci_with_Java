
public class Node{
  //attributes
  private int data;
  private Node left, right;
  //basic constructor
  Node(){
    this.data = 0;
    this.left = null;
    this.right = null;
  }
  //parametrized constructor
  Node(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }
  //accessors and mutators
  public int getData(){
    return this.data;
  }
  public void setData(int data){
    this.data = data;
  }
  public Node getLeft(){
    return this.left;
  }
  public void setLeft(Node left){
    this.left = left;
  }
  public Node getRight(){
    return this.right;
  }
  public void setRight(Node right){
    this.right = right;
  }
  //methods
  public void printNode(){
    System.out.println(this.data);
  }
}
