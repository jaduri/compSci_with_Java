
public class Main{

  public static void main(String[] args){
    //adjacency matrix
    int[][] matrix = {{0,1,1,1,1,0},
                      {1,0,0,1,0,1},
                      {1,0,0,0,1,0},
                      {1,1,0,0,0,1},
                      {1,0,1,0,0,1},
                      {0,1,0,1,1,0}};
    MyGraph graph = new MyGraph();//instantiate graph

    graph.matrixToList(matrix);//convert matrix to list
    graph.displayAdjListArray();//display list
  }
}
