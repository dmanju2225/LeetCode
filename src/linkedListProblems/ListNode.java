package linkedListProblems;

public class ListNode
{
	ListNode next;
	int data;

	ListNode(int k)
	{
		this.next = null;
		this.data = k;
	}
	ListNode(ListNode that){
		this.next=null;
		this.data=that.data;
	}
}
