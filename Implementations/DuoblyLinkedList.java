package Implementations;


class Node1{
	int data;
	Node1 prev;
	Node1 next;
	Node1(int data){
		this.data=data;
		prev=null;
		next= null;
	}
}
public class DuoblyLinkedList {
	
	Node1 head;
	public void add(int data) {
		Node1 newNode= new Node1(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node1 last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
			newNode.prev=last;
		}
	}
	public void remove(int key) {
		Node1 temp=head;
		while(temp!=null && temp.data!=key) {
			temp=temp.next;
		}
		if(temp==null) {
			return ;
		}
		if(temp.prev!=null) {
			temp.prev.next=temp.next;
		}
		else {
			head=temp.next;
		}
		if(temp.next!=null) {
			temp.next.prev=temp.prev;
		}
	}
	public void display() {
		Node1 current=head;
		System.out.println("forward direction");
		while(current!=null) {
			System.out.print(current.data+ " ");
			current=current.next;
		}
		System.out.println();
	}
	public void reverseDisplay() {
		Node1 current=head;
		while(current.next!=null) {
			current=current.next;
		}
		System.out.println("backward direction");
		while(current!=null) {
			
			System.out.print(current.data+ " ");
			current=current.prev;
		}
		System.out.println();
	}
	
public static void main(String []args) {
		DuoblyLinkedList l= new DuoblyLinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		l.display();
		l.reverseDisplay();
		
		l.remove(5);
		l.display();
		l.reverseDisplay();
	}
	

}
