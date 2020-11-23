
public class Main{

  int nextHappyNum(int num){
    if(num > 0 && num < 7){//simple case
      return 7;
    }else if(num == 0){//simple case
      return 1;
    }else if(checkNumber(num + 1) == true){//base case
      return num + 1;
    }
    return nextHappyNum(++num);//call method again to find next happy number
  }
  static boolean checkNumber(int num){//check if a number is happy
    while(true){//loop until 1 or 4 is reached
      String numString = num + "";//store number as string
      int next = 0;
      int i = 0;
      while (i < numString.length()){//loop through string, square and add its digits
        int val = Character.getNumericValue(numString.charAt(i));
        next += val*val;
        i++;
      }
      if(next == 1){
        return true;
      }else if(next == 4){
        return false;
      }else{
        num = next;
      }
    }
  }

  static String decodeString(String s){
    return decodeString(s, true);
  }

  static String decodeString(String s, boolean bool){
    //use boolean argument to keep track of initial method call
    if(s.equals("")){
      return "";
    }else if(Character.isDigit(s.charAt(0))){//repeat any substring that follows an integer
      int multiplier = Character.getNumericValue(s.charAt(0));
      String blockUnit = "";
      String block = "";
      int blockEnd = s.indexOf(']');
      if(s.charAt(1) == '['){
        blockUnit = decodeString(s.substring(2), false);
      }else{
        blockUnit = decodeString(s.substring(1), false);
      }
      while(multiplier > 0){
        block += blockUnit;
        multiplier--;
      }
      if(bool == true){
        return block;
      }
      return block+decodeString(s.substring(blockEnd+1), false);
    }else if(s.charAt(0) == '['){
      return decodeString(s.substring(1), false);
    }else if(s.charAt(0) == ']'){
      return "";
    }else if(Character.isLetter(s.charAt(0))){
      return s.charAt(0) + decodeString(s.substring(1), false);
    }
    return "";
  }

  public static void main(String[] args){
    Main test = new Main();
    System.out.println(test.nextHappyNum(10));
    System.out.println(test.decodeString("1[b]"));
  }

}
