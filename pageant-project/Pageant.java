public class Pageant{
	//attributes
	private LinkedList finalistList;
	//constructors
	Pageant(){
		this.finalistList = new LinkedList();
	}
	//methods
	public void addFinalist(Finalist fin){
		Node newFin = new Node(fin);
		newFin.setNext(finalistList.getHead());
		finalistList.setHead(newFin);
	}
	public void sortFinalist(){
		if(finalistList.getHead() == null){
			System.out.println("No finalist available");
			return;
		}else if(finalistList.getHead().getNext() == null){
			System.out.println("Only one finalist on record");
		}else{
			Node i = finalistList.getHead();
			Node j = i.getNext();
			boolean swapped = true;
			while(swapped){
				swapped = false;
				Node tmp = j;
				if(finalistList.getHead() == i && i.getFinalist().getMean() > j.getFinalist().getMean()){
					i.setNext(tmp.getNext());
					tmp.setNext(i);
					finalistList.setHead(tmp);
					swapped = true;
					i = tmp;
					j = i.getNext();
				}
				while(j.getNext() != null){
					if(j.getFinalist().getMean() > j.getNext().getFinalist().getMean()){
						tmp = j;
						Node tmpNxt = j.getNext();
						i.setNext(tmpNxt);
						tmp.setNext(tmpNxt.getNext());
						tmpNxt.setNext(tmp);
						swapped = true;

					}
					i = i.getNext();
					j = i.getNext();
				}
				i = finalistList.getHead();
				j = i.getNext();
			}
		}
	}
	public void printFinalists(){
		Node tmp = finalistList.getHead();
		while(tmp != null){
			tmp.getFinalist().display();
			System.out.println("====================");
			tmp = tmp.getNext();
		}
	}
}
