package com.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class IntersectionLink {

	private Node head;
	public IntersectionLink() {
		this.head=null;
		
		
		
		// TODO Auto-generated constructor stub
	}

	public static Node findIntersectionUsingSet(Node nodeA,Node nodeB) {
		if(nodeA==null || nodeB==null ) {
			return null; 
		}
		Set<Node> nodeset= new HashSet<Node>();
		Node tempA=nodeA;
		while(tempA!=null) {
			nodeset.add(tempA);
			tempA=tempA.next;
		}
		
		Node tempB=nodeB;
		while(tempB!=null) {
			if(nodeset.contains(tempB)) {
				return tempB;
			}
			tempB=tempB.next;
		}
		return null;
	}
	
	public boolean hasCycle(Node head) {
	Set<Node> nodesvisted= new HashSet<>();
	Node temp=head;
	while(temp!=null) {
		if (nodesvisted.contains(temp)) {
			return true;
		} else {
			nodesvisted.add(temp);
		}
		temp=temp.next;
	}
	return false;
	
	}
	public void removeDuplicate(Node head) {
		Node temp=head;
		Set<Node> nodeset= new HashSet<Node>();
		while (temp!=null) {
			if (nodeset.contains(temp)) {
				continue;
			}
			else {
				nodeset.add(temp);
				
			}
			temp=temp.next;
		}
		
	}
	}



