
public class Main{

  private static boolean test(int result, int ans){
    if(result == ans){//if algorith produces expected output
      return true;
    }
    return false;//if algorithm produces unexpected output
  }

  private static int findMaxVal(int[] array){
    int i = 0;
    while(array[i+1] > array[i]){
      i++;
    }
    return i;
  }

  public static void main(String[] args){
    //create array to test with
    int[] revArray = {6,5,4,3,2,1};
    int[] array = {1,2,3,4,5,6};
    int[] mixed = {1,5,8,12,9,7,-1};
    //instantiate search array objects
    BinarySearch bin = new BinarySearch();
    LinearSearch lin = new LinearSearch();
    //test algorithms
    int find = lin.search(revArray, 2);
    System.out.println(find);
    System.out.println(test(find, 4));
    System.out.println(findMaxVal(mixed));
  }
}
