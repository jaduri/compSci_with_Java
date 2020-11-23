public class Main{
  public static void main(String[] args){
    System.out.println(bracketsMatching("(1+2) * {(2+3)*(3+4)}"));
    MyQueue queue = new MyQueue();

    queue.enqueue(new Node("Java"));
    queue.enqueue(new Node("Python"));
    queue.enqueue(new Node("C++"));
    queue.enqueue(new Node("Matlab"));
    queue.enqueue(new Node("JavaScript"));

    queue.displayQueue();
    reverseQueue(queue);
    queue.displayQueue();
  }

  public static MyQueue reverseQueue(MyQueue queue){
    //base case
    if(queue.isEmpty()){
      return queue;
    }else{
      String data = queue.dequeue();//remove node from queue
      reverseQueue(queue).enqueue(new Node(data));//recursively add nodes in reverse order
    }
    return queue;
  }

  public static boolean bracketsMatching(String input){
    MyStack stack = new MyStack();
    //add only brackets to stack
    //when closing bracket is added check for matching opening bracket and remove
    for(int i = 0; i<input.length(); i++){
      switch (input.charAt(i)){
        case '(':
        case '{':
        stack.push(new Node(input.charAt(i)+""));
        break;
        case ')':
        stack.push(new Node(")"));
        if(stack.peek().getNext().getData().equals("(")){
          stack.pop();
          stack.pop();
        }
        break;
        case '}':
        stack.push(new Node("}"));
        if(stack.peek().getNext().getData().equals("{")){
          stack.pop();
          stack.pop();
        }
        break;
      }
    }
    return stack.isEmpty();//check that queue is empty and return true when all pairs are popped
  }
}
