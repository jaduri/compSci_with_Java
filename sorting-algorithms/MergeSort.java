
public class MergeSort extends MySortAlg{
    @Override
    public int[] sort(int[] array){
      //base case
      if(array.length == 1){
        return array;
      }else{//split array in to 2 parts
        int mid = (array.length/2);
        int[] arr1 = new int[mid];
        int[] arr2 = new int[array.length - mid];

        build(arr1, 0, mid, array);//construct new sub arrays with helper function
        build(arr2, mid, array.length - mid, array);

        int[] firstHalf = sort(arr1);
        int[] secondHalf = sort(arr2);
        return merge(firstHalf, secondHalf);//reconstruct sub arrays in sorted manner
      }
    }

    //method to arrange and combine subarrays
    private int[] merge(int[] one, int[] two){
      int[] joined = new int[one.length + two.length];
      int j = 0;
      int k = 0;
      for(int i = 0; i < one.length; i++){
        while(j < two.length && two[j] > one[i]){
          joined[k] = two[j];
          j++;
          k++;
        }
        joined[k] = one[i];
        k++;
      }
      while(j < two.length){
        joined[k] = two[j];
        k++;
        j++;
      }
      return joined;
    }

    //helper function to populate subarrays
    private int[] build(int[] arr, int a, int x, int[] source){
        for(int i=0; i<x; i++){
            arr[i] = source[a];
            a++;
        }
        return arr;
    }

}
