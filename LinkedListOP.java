package LinkedList;
import java.util.*;
public class LinkedListOP {
public static int size=0;
public int size()
{
	return size;
}
public static void insert(Node<Integer>head,int data,int pos)
{
	Node<Integer> newNode=new Node<Integer>(data);
    if (pos==0) {
    	newNode.next=head;
    	head=newNode;
    }else
    {
     int count=0;
     Node<Integer>cur=head;
     while(count<pos-1 && cur!=null)
     { 
     count++;
     cur=cur.next;
    }
     if(cur!=null)
     {
    	 newNode.next=cur.next;
    	 cur.next=newNode;
     }
}
}
public static Node<Integer> insertAtBegin(Node<Integer> head,int data)
{
	Node<Integer> newNode=new Node<Integer>(data);
	newNode.next=head;
	head=newNode;
	return head;
}
public static void printList(Node<Integer> head) {
    Node<Integer> a = head;
    while (a != null) {
       System.out.print(a.data + " ");
       a = a.next;
    }
    }
public static Node<Integer> DeleteNode(Node<Integer> head,int pos)
{
	if(head==null)
	{
		return head;
	}
	if(pos==0)
	{
		size--;
		return head.next;
	}
	int count=0;
	Node<Integer> temp=head;
	while(temp!=null && count<pos-1)
	{
		temp=temp.next;
		count++;
	}
	if(temp==null || temp.next==null)
	{
		return head;
	}
	temp.next=temp.next.next;
	size--;
	return head;
}
public static Node<Integer> deleteFirst(Node<Integer> head)
{
	if(head==null)
	{
		return head;
	}
	if(size==1)
	{
		size--;
		head=null;
		return head;
	}
	else
	{
		head=head.next;
		size--;
		return head;
	}
}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
	    System.out.println("Enter the number of elements in the linked list: ");
	      int num = obj.nextInt();
	      Node<Integer> head = null;
	      for (int i = 0; i < num; i++) {
	         System.out.println("Enter the data :");
	         int data = obj.nextInt();
	         head = insertAtBegin(head, data);
	         size++;
	      }
	         //insert(head,13,3);
	         printList(head);
	         System.out.println();
	         head=DeleteNode(head,2);
	         printList(head);
	         System.out.println();
	         deleteFirst(head);
	         printList(head);
	         System.out.println();
	      }
	}


