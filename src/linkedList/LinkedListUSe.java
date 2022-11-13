package linkedList;

import java.util.Scanner;

public class LinkedListUSe {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> firstNode=new Node<Integer>(10);

		Node<Integer> secondNode=new Node<Integer>(20);

		Node<Integer> thirdNode=new Node<Integer>(30);

		Node<Integer> fourthNode=new Node<Integer>(40);

		Node<Integer> fifthNode=new Node<Integer>(50);
		
		firstNode.next=secondNode;
		secondNode.next=thirdNode;
		thirdNode.next=fourthNode;
		fourthNode.next=fifthNode;
		
		Node<Integer> head=firstNode;
		return head;
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data +" ");
			temp=temp.next;
		}
	}
	
	public static void increment(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			temp.data=temp.data+1;
			temp=temp.next;
		}
	}

	public static int lengthREC(Node<Integer> head){
//		if(head==null) {
//			return 0;
//		}
//		return 1+lengthREC(head.next);
		
		int count=0;
		Node<Integer> temp=head;
		while(temp!=null) {
			count=count+1;
			temp=temp.next;
		}
		return count;
		
	}
	
	public static void printIthNode(Node<Integer> head, int i){
		Node<Integer> temp=head;
		int count=0;
		while(count!=i && temp!=null) {
			count=count+1;
			temp=temp.next;
		}
		if(count==i && temp!=null) {
			System.out.println(temp.data);
		}
		
		
}
	
	public static Node<Integer> takeInput(){
		Node<Integer> head=new Node<Integer>();
		head=null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter data for head node");
		int data=sc.nextInt();
		while(data!=-1) {
			if(head==null) {
				Node<Integer> temp=new Node<Integer>(data);
				head=temp;
				
			}
			else
			{
				Node<Integer> tail=new Node<Integer>(data);
				Node<Integer> temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=tail;
				
			}
			System.out.println("Enter for next node");
			data=sc.nextInt();
		}
		return head;
	}
	public static Node<Integer> takeInputOptimize(){
		Node<Integer> head=new Node<Integer>();
		Node<Integer> tail=new Node<Integer>();
		head=null;
		tail=null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter data for head node");
		int data=sc.nextInt();
		while(data!=-1) {
			if(head==null) {
				Node<Integer> temp=new Node<Integer>(data);
				head=temp;
				tail=temp;
			}
			else
			{
				Node<Integer> temp=new Node<Integer>(data);
				tail.next=temp;
				tail=tail.next;
				
			}
			System.out.println("Enter for next node");
			data=sc.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		
		if(pos<0) {
			return head;
		}
		else if(pos==0) {
			Node<Integer> temp=new Node<Integer>(data);
			temp.next=head;
			head=temp;
			return head;
		}
		else {
			int count=0;
			Node<Integer> temp=head;
			while(count!=pos-1 && temp!=null) {
				count=count+1;
				temp=temp.next;
			}
			if(count!=pos-1) {
				return head;
			}else {
			Node<Integer> elem=new Node<Integer>(data);
			
			
			elem.next=temp.next;
			temp.next=elem;
			
			}
			return head;
		}
		
	} 	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {

		if(head==null){
			return head;
		}
			if(pos<0) {
				return head;
			}
			else if(pos==0) {
				return head.next;
			}
			else {
				int count=0;
				Node<Integer> temp=head;
				while(count!=pos-1 && temp!=null) {
					count=count+1;
					temp=temp.next;
				}
				if(count!=pos-1) {
					return head;
				}
				else {
				
				if(temp.next==null){
					return head;
				}
				
				
				temp.next=temp.next.next;
				
				}
				return head;
				
			}
		
	}
	public static int findNode(Node<Integer> head, int n) {
		int index=-1;
		int count =-1;
			Node<Integer> temp=head;
			while(temp!=null) {
				if(temp.data==n) {
					++count;
					index=count;
					break;
				}
				else {
					++count;
					temp=temp.next;
				}
			}
			return index;
		
	       
    }
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) { 
    	if(head==null) {
    		return head;
    	}
    	else {
    		if(n<=0) {
    			return head;
    		}
    		else {
    			int length=0;
    			int count=0;
    			Node<Integer> temp=head;
    			while(temp!=null) {
    				length=length+1;
    				temp=temp.next;
    			}
    			if(n>length) {
    				return head;
    			}
    			temp=head;
    			while(count!=(length-n-1)) {
    				count=count+1;
    				temp=temp.next;
    			}
    			Node<Integer> newHead=temp.next;
    			Node<Integer> tail=head;
    			temp.next=null;
    			temp=newHead;
    			while(temp.next!=null) {
    				temp=temp.next;
    			}
    			temp.next=tail;
    			return newHead;
    		}
    	}
 }
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
    	if(head==null) {
    		return head;
    	}
    	else {
    		Node<Integer> temp=head.next;
    		Node<Integer> prev=head;
    		while(temp.next!=null) {
    			if(temp.data==prev.data) {
    				prev.next=temp.next;
    				temp=temp.next;
    			}
    			else {
    				prev=temp;
    				temp=temp.next;
    			}
    			
    		}
    		return head;
    		
    	}

    }
	public static int findIthNode(Node<Integer> head, int i){
		Node<Integer> temp=head;
		int count=0;
		while(count!=i && temp!=null) {
			count=count+1;
			temp=temp.next;
		}
		
			return temp.data;
	
		
}
    
    public static boolean isPalindrome(Node<Integer> head) {
    	
    int count=-1;
    boolean result=true;
    Node<Integer> temp=head;
    while(temp!=null) {
    	count=count+1;
    	temp=temp.next;
    }
    if(count<=0) {
    	return true;
    }
    else {
    temp=head;
    int SI=0;
    while(SI<=count) {
    	if(findIthNode(temp, SI)==findIthNode(temp, count)) {
    		SI=SI+1;
    		count=count-1;
    	}
    	else {
    		result=false;
    		break;
    	}
    	
    }
    return result;
    }
        
    }
    
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInputOptimize();
		
		print(head);
		
		
	}


}
