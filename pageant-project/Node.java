public class Node{
	//attributes
	private Finalist finalist;
	private Node next;
	//constructors
	Node(){
		this.finalist = null;
		this.next = null;
	}
	Node(Finalist fin){
		this.finalist = fin;
		this.next = null;
	}
	//acccessors and mutators
	Finalist getFinalist(){
		return this.finalist;
	}
	void setFinalist(Finalist fin){
		this.finalist = fin;
	}
	Node getNext(){
		return this.next;
	}
	void setNext(Node next){
		this.next = next;
	}
}