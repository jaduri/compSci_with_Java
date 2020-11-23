
public class MyQueue{
  //attributes
  private Node front, rear;
  //constructors
  public MyQueue(){
    this.front = null;
    this.rear = null;
  }
  public MyQueue(Node front){
    this.front = front;
    this.rear = front;
  }
  //methods
  //add to back of queue
  public void enqueue(Node node){
    if(this.rear == null){
      this.front = node;
      this.rear = node;
      return;
    }else{
      this.rear.setNext(node);
      this.rear = node;
    }
  }
  //remove from front of queue
  public String dequeue(){
    Node dequeued = this.front;
    if(this.front == null){
      System.out.println("Queue is empty");
      return dequeued.getData();
    }else if(this.front.getNext() == null){
      this.rear = null;
    }
    this.front = this.front.getNext();
    return dequeued.getData();
  }
  //check if queue is empty
  public boolean isEmpty(){
    return this.front == null;
  }
  //display queue
  public void displayQueue(){
    if(this.front == null){
      System.out.println("Queue is empty");
      return;
    }
    Node current = this.front;
    while(current != null){
      current.printNode();
      current = current.getNext();
    }
    System.out.println();
  }

}
