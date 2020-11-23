
public class Node{
  //attributes
  private int index;
  //default constructor
  Node(){
    this.index = 0;
  }
  //parametrized constructor
  Node(int index){
    this.index = index;
  }
  //accessor
  public int getIndex(){
    return this.index;
  }
  //pring node data
  public void printNode(){
    System.out.print("Node "+this.index);
  }

}
