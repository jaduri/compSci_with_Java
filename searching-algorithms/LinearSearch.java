
public class LinearSearch extends MySearchAlg{

  public int search(int[] array, int num){

    //loop through input array
    for (int i = 0; i < array.length; i++){
      if (array[i] == num){//compare each item in array to num
        return i;//output index of num if found
      }
    }

    return -1;//output -1 when num is not an item in array
  }

}
