
public class Main{
  public static void main(String[] args){


    int[] arr = {9,18,7,69,22,5,24,35,15,49,3,13};
    int[] sorted = {15,5,7,9,13,3,18,22,24,35,69,49};


    InsertionSort ins = new InsertionSort();
    MergeSort mer = new MergeSort();
    QuickSort qui = new QuickSort();

    display(ins.sort(arr));
    display(mer.sort(arr));
    display(qui.sort(arr));
    System.out.println(compare(mer.sort(arr), sorted));
    System.out.println(findSmallestSum(arr));

  }

//Question 6-----------------------------------------
  public static boolean test(int[] result, int[] ans){
    if(result.length != ans.length){
      return false;
    }else{
      for(int i=0; i< result.length; i++){
        if(result[i] != ans[i]){
          return false;
        }
      }
    }
    return true;
  }

  //Question 7-----------------------------------------
  public static boolean compare(int[] arr1, int[] arr2){ //use sortAlg on this

    for(int i = 0; i< arr1.length; i++){
      boolean found = false;
      for(int j = 0; j < arr2.length; j++){
        if(arr1[i] == arr2[j]){
          found = true;
          j = arr2.length;
        }
      }
      if(found == false){
        return false;
      }
    }
    return true;
  }

//Question 8-----------------------------------------
  public static int findSmallestSum(int[] array){
    MergeSort ms = new MergeSort();
    int[] sorted = ms.sort(array);//sort the array
    return sorted[sorted.length-2] + sorted[sorted.length-1];//sum two first indexes
  }

  private static void display(int[] arr){
    String array = "[ ";
    for(int i=0; i<arr.length; i++){
      array += ""+arr[i]+" ";
    }
    array += "]";
    System.out.println(array);
  }
}
