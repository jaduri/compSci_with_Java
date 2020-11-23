
public class MyBST{
  //attributes
  private Node root;
  //constructor
  public MyBST(){
    this.root = null;
  }
  public MyBST(Node root){
    this.root = root;
  }
  //methods
  public void insert(int value){
    if(this.root == null){//check if tree root is null
      this.root = new Node(value);//insert new node as root
    }else{
      insertRec(this.root, value);//recursively find the appropriate position
    }
  }
  private void insertRec(Node current, int value){
    if(current.getData() == value){//if an identical node already exists
      System.out.println("Node already exists");
    }else if(value > current.getData()){
      if(current.getRight() != null){
        insertRec(current.getRight(), value);//traverse right node
      }else{
        current.setRight(new Node(value));//insert to right node
      }
    }else if(value < current.getData()){
      if(current.getLeft() != null){
        insertRec(current.getLeft(), value);//traverse left node
      }else{
        current.setLeft(new Node(value));//insert to left node
      }
    }
  }
  public boolean search(int value){
    return searchRec(this.root, value);//search recursively
  }
  private boolean searchRec(Node current, int value){
    if(current == null){
      return false;
    }else if(current.getData() > value){
      return searchRec(current.getLeft(), value);//search left node
    }else if(current.getData() < value){
      return searchRec(current.getRight(), value);//search right node
    }
    return true;
  }
  public void printTree(){
    printTree(this.root);
  }
  private void printTree(Node current){
    if(current == null){
      return;
    }
    else{
      printTree(current.getLeft());
      current.printNode();
      printTree(current.getRight());
    }
  }
}
