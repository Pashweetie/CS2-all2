import java.util.*;
public class LinkedClass<AnyType>{
	

private Node<AnyType> head;
private int size=0;

   public LinkedClass(){
      head = null;
	}
	public boolean isEmpty(){
      return head == null;
    }
    public void addFirst(AnyType dataSpace){
    	head=new Node<AnyType>(dataSpace, head);
    }
	public void add(AnyType dataSpace){
		int counter=0;
		if(head== null) 
			addFirst(dataSpace);
		else{
			Node<AnyType> temporary = head;
			while(temporary.next!=null)
				temporary = temporary.next;
			temporary.next=new Node<AnyType>(dataSpace,null);
			}

		size++;
		
		
	}

	public AnyType get(int index){
        if(head == null)
        	throw new NoSuchElementException();
			Node<AnyType> temporary = head;
			if(index==0){
				return head.data;
			}
			for(int i=0; i<index;i++){
				if(temporary.next!=null)
					temporary=temporary.next;
			}
			return temporary.data;

		
	}
	public int length(){
		return size;
	}
}
