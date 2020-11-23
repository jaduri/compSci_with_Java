
public class QuickSort extends MySortAlg{

  @Override
  public int[] sort(int[] array){
    //pass array to overloaded method and return result
    return sort(array, 0, array.length-1);
  }

  private int[] sort(int[] array, int min, int max){
    //base case array of 1 or less indexes
    if(min >= max){
      return array;
    }else{//select last index as pivot and partition around it
      int pivot = partition(array, min, max);
      sort(array, min, pivot-1);
      sort(array, pivot+1, max);
    }
    return array;
  }


  //helper method to partition and arrange array
  private int partition(int[] array, int min, int max){
    int tracker = min-1;
    for(int i = min; i < max; i++){//sort lower values to left of pivot
      if(array[i] > array[max]){
        tracker++;
        int temp = array[i];
        array[i] = array[tracker];
        array[tracker] = temp;
      }
    }
    //place pivot in appropriate index
    int temp = array[tracker+1];
    array[tracker+1] = array[max];
    array[max] = temp;

    return tracker+1;
  }

}
