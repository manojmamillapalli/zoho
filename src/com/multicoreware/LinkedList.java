package com.multicoreware;
import java.util.*;

//import linkedlist.Node;

class Node
{
	char ch;
	Node next;
    
	Node(Node next, char ch)
	{
		this.ch=ch;
		this.next=next;
	}
	Node(char ch)
	{
		this.ch=ch;
		this.next=null;
	}
}
public class LinkedList {

	public static void main(String[] args) {
		char[] ch= {'R','A','D','A','R'};
        Node head=convertArr2LL( ch);
        printElements(head);
       Node head1= reverseLL(head);
       printElements(head1);
	}
	public static Node convertArr2LL(char[] ch)
	{
		Node root=new Node(ch[0]);
		Node mover=root;
		for(int i=1;i<ch.length;i++)
		{
			Node temp=new Node(ch[i]);
			mover.next=temp;
			mover=temp;
		}
		return root;
		
	}
	public static Node reverseLL(Node root)
	{
		Node temp=root;
		Node prev=null;
			while(temp!=null)
			{
				Node front=temp.next;
				temp.next=prev;
				prev=temp;
				temp=front;
			}
			return prev;
		
		
		
	}
	public static void printElements(Node root)
	{
		Node temp=root;
		while(temp!=null)
		{
			System.out.print(temp.ch+"->");
			temp=temp.next;
		}
		System.out.print("null");
		System.out.println();
	}

}
