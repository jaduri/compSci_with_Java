public class LinkedList{
	//attribute
	private Node head;
	//constructor
	LinkedList(){
		this.head = null;
	}
	LinkedList(Node head){
		this.head = head;
	}
	//accessors and mutators
	Node getHead(){
		return this.head;
	}
	void setHead(Node head){
		this.head = head;
	}
}