
import java.util.LinkedList;

public class MyGraph{
  //declare array of linked list
  LinkedList<Node>[] adjListArray;
  //constructor
  public MyGraph(){

  }
  //implement method to convert
  public void matrixToList(int[][] matrix){
    int n = matrix.length;//store number of nodes
    this.adjListArray = new LinkedList[n];//define size of array
    for(int i = 0; i < n; i++){//for each node
      this.adjListArray[i] = new LinkedList();//create a linked list
      for(int j = 0; j < n; j++){
        if(matrix[i][j] == 1){//when there is a link between nodes
          this.adjListArray[i].add(new Node(j));//add node to show relationships
        }
      }
    }
  }

  public void displayAdjListArray(){
    int n = adjListArray.length;
    for(int i = 0; i < n; i++){//for each element in array
      System.out.print(i+": ");
      for(Node node: adjListArray[i]){//for each element in linkedlist
        node.printNode();//call function to print node data
        System.out.print(" -> ");
      }
      System.out.print("\n");
    }
  }

}
