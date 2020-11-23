
public class MyStack{
  //attribute
  private Node top;
  //constructors
  public MyStack(){
    this.top = null;
  }
  public MyStack(Node top){
    this.top = top;
  }

  //methods
  public void push(Node node){//add to top of stack
    node.setNext(this.top);
    this.top = node;
  }
  public Node pop(){//remove from top of stack
    Node popped = this.top;
    if(popped == null){
      System.out.println("Stack is empty");
    }else{
      this.top = this.top.getNext();
    }
    return popped;
  }
  public Node peek(){//get head of node
    if(this.top == null){
      System.out.println("Stack is empty");
    }
    return this.top;
  }
  public boolean isEmpty(){//check if stack is empty
    return this.top == null;
  }

}
