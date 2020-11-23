
public class Main{

  public static void main(String[] args){
    MyBST tree = new MyBST();

    tree.insert(8);
    tree.insert(3);
    tree.insert(6);
    tree.insert(9);
    tree.insert(2);
    tree.insert(4);
    tree.insert(5);

    tree.printTree();
    System.out.println(tree.search(4));
  }

}
