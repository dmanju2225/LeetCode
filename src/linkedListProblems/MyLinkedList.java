package linkedListProblems;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList
{
	ListNode head;
	int size;

	MyLinkedList()
	{
		head = null;
	}

	public void addAtBegin(int k)
	{
		ListNode newNode = new ListNode(k);
		if (head == null)
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addAtEnd(int k)
	{
		ListNode newNode = new ListNode(k);

		if (head == null)
		{
			head = newNode;
			return;
		}
		ListNode temp = head;
		while (temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void addAt(int k, int i)
	{
		ListNode newNode = new ListNode(k);
		ListNode temp = head;
		int j = 0;
		while (j < i - 1)
		{
			temp = temp.next;
			j++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	public void removeAt(int k, int i)
	{

		ListNode temp = head;
		int j = 0;
		while (j < i - 1)
		{
			temp = temp.next;
			j++;
		}
		temp.next = temp.next.next;
	}

	public int get(int i)
	{

		ListNode temp = head;
		int j = 0;
		while (j < i)
		{
			temp = temp.next;
			j++;
		}
		return temp.data;
	}

	public ListNode getNode(int i)
	{

		ListNode temp = head;
		int j = 0;
		while (j < i)
		{
			temp = temp.next;
			j++;
		}
		return temp;
	}

	public int size()
	{
		int count = 0;
		ListNode temp = head;
		while (temp != null)
		{
			temp = temp.next;
			count++;
		}
		return count;

	}

	public void setAt(int k, int i)
	{

		ListNode temp = head;
		int j = 0;
		while (j < i)
		{
			temp = temp.next;
			j++;
		}
		temp.data = k;
	}

	public void reverse()
	{
		if (head != null && head.next != null)
		{
			ListNode temp1 = head;
			ListNode temp2 = temp1.next;
			ListNode temp3 = temp2.next;
			temp1.next = null;
			while (temp3 != null)
			{
				temp2.next = temp1;
				temp1 = temp2;
				temp2 = temp3;
				temp3 = temp3.next;
			}
			temp2.next = temp1;
			head = temp2;
		}
	}
	public ListNode reverseIterativeO(ListNode head){
		ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;//storing next node
            curr.next=prev;//actual reverse connecting next to prev
            prev=curr;//moving nodes 1 step forward
            curr=next;
        }
        head=prev;//last node will be prev node and that is head
        return head;  
    }
	public static ListNode reverseRecursiveO(ListNode head){
		if(head==null||head.next==null){
		return head;
		}
		ListNode temp=head.next;//for every call each node connect to null, for the last node call returns that node
		 head.next=null;
		ListNode reverseHead=reverseRecursiveO(temp);
		temp.next=head;
		return reverseHead;
	}
	
	
	

	public String loopOrNoLoop()
	{
		ListNode temp1 = head;
		ListNode temp2 = temp1.next;
		while (temp2 != null)
		{
			temp1 = head;
			while (temp2.next != temp1)
			{
				if (temp1.next == temp2)
				{
					break;
				}
				temp1 = temp1.next;
			}
			if (temp2.next == temp1)
			{
				return "has loop";
			}
			temp2 = temp2.next;
		}
		return "no loop";
	}

	// slow pointer jumping 1 step and fast pointer jumping 2steps method
	public String loopOrNoLoop2()
	{
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		if (head == null)
		{
			return "no loop";
		}
		while (true)
		{
			if (fastPointer.next == null || fastPointer== null)
			{
				return "no loop";
			}
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if (slowPointer == fastPointer)
			{
				return "has loop";
			}
		}
	}

	public float findMedian()
	{
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		while (true)
		{
			
			if (fastPointer.next == null || fastPointer.next.next == null)
			{
				return  ((float)(slowPointer.data+slowPointer.next.data)/2);
			}
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;		
		}
	}

	public String toString()
	{
		ListNode temp = head;
		String out = " ";
		while (temp != null)
		{
			out = out + temp.data + " ";
			temp = temp.next;
		}
		return out;
	}

	public static void main(String[] args)
	{
		// MyLinkedList list1 = new MyLinkedList();
		// list1.addAtBegin(1);
		// System.out.println("list1 is "+list1);
		// MyLinkedList list2 = new MyLinkedList();
		// list2.addAtBegin(2);
		// System.out.println("list2 is "+list2);
		// System.out.println("list1 is "+list1);
		// list1.addAtBegin(3);
		// System.out.println("list1 is "+list1);
		// System.out.println("list2 is "+list2);
		// MyLinkedList list1 = new MyLinkedList();
		MyLinkedList list2 = new MyLinkedList();

		// for (int i = 0; i < 4; i++)
		// {
		// list1.addAtEnd(i);
		// // list1.addAtBegin(i);
		// // System.out.println("list1 is " + list1);
		// }
		for (int i = 1; i < 6; i++)
		{
			list2.addAtBegin(i);
		}
		//list2.getNode(3).next = list2.getNode(1);
		

		// System.out.println("list1 is " + list1);
		// System.out.println("list2 is " + list2);
		// list1.addAt(5, 2);
		// System.out.println("list1 is " + list1);
		// list1.removeAt(5, 10);
		// System.out.println("list1 is " + list1);
		//
		// System.out.println("value at index is " + list1.get(0));
		// System.out.println("list size is " + list1.size());
		// list1.setAt(2, 2);
		// System.out.println("list1 is " + list1);
		// MyLinkedList list2 = new MyLinkedList();
		// System.out.println("list size is " + list2.size());
		// list1.reverse();
		System.out.println("list1 is " + list2);
		String loop = list2.loopOrNoLoop2();
		System.out.println(loop);
		float median=list2.findMedian();
		System.out.println(median);
		ListNode reverse1=reverseRecursiveO(list2.getNode(0));
		System.out.println(reverse1.data);
		

	}
}