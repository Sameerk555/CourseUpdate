package Implementations;

public class LinkedList {
	
	Node head;
	public void add(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
	}
	public void remove(int key) {
		
		Node temp= head;
	    Node prev= null;
	    if(temp!=null && temp.data==key) {
	    	head=temp.next;
	    	return;
	    }
	    while(temp!=null && temp.data!=key) {
	    	prev=temp;
	    	temp=temp.next;	
	    	
	    }
	    if(temp==null) {
    		return;
    	}
	    prev.next=temp.next;
		
	}
	public void display() {
		Node current= head;
		while(current!=null) {
			System.out.print(current.data+ " ");
			current=current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		LinkedList l= new LinkedList();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		l.display();
		
		l.remove(7);
		l.display();

	}

}
