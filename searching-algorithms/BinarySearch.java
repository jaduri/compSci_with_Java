
public class BinarySearch extends MySearchAlg{

  public int search(int[] array, int num){

    return search(array, num, 0, array.length -1);
  }

  //overload required array to pass more patameters
  private int search(int[] array, int num, int first, int last){
    int mid = (first+last)/2;//store value of middle element

    if(first > last){
      return -1;
    }else if(array[mid] == num){
      return mid;
    }else if(array[0] < array[array.length-1]){//for array in ascending order
      if(array[mid] > num){
        return search(array, num, first, mid-1);
      }else if(array[mid] < num){
        return search(array, num, mid+1, last);
      }
    }else if(array[0] > array[array.length-1]){//for array in descending order
      if(array[mid] > num){
        return search(array, num, mid+1, last);
      }else if(array[mid] < num){
        return search(array, num, first, mid-1);
      }
    }
    return -1;

  }

}
//add a sorting algorithm
