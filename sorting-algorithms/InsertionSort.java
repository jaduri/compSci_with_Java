
public class InsertionSort extends MySortAlg{

  @Override
  public int[] sort(int[] array){
    int key;
    for(int i = 1; i < array.length; i++){
      key = array[i];//store first item of unsorted array
      int j = i-1;// select last index of sorted array

      //loop through sorted array where value is greater than selected item of unsorted array
      while(j >= 0 && array[j] < key){
        array[j+1] = array[j];//move all greater values to the right
        j--;
      }
      array[++j] = key;//store key value in appropriate index of sorted array
    }
    return array;
  }

}
