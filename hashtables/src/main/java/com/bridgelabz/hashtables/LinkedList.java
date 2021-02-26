package com.bridgelabz.hashtables;

import java.util.Scanner;


public class LinkedList {
	private int size;
	private MyMapNode head;

	
	public int getSize() {
		return size;
	}

	
	public MyMapNode getHead() {
		return head;
	}

	
	static class MyMapNode<T extends Comparable<T>, V> {
		private T key;
		private V value;
		private MyMapNode next;

		
		public MyMapNode getNext() {
			return next;
		}

		
		public void setNext(MyMapNode next) {
			this.next = next;
		}

		
		public T getKey() {
			return key;
		}

		
		public void setKey(T key) {
			this.key = key;
		}

		
		public V getValue() {
			return value;
		}

		
		public void setValue(V value) {
			this.value = value;
		}

		
		public MyMapNode(T key, V value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}

	
	public <T extends Comparable<T>, V> void addNodeAtLast(T data, V value) {
		MyMapNode n = new MyMapNode(data, value);
		MyMapNode t = head;
		if (t == null) {
			head = n;
		} else {
			while (t.next != null)
				t = t.next;
			t.next = n;
		}
		size++;
	}

	
	public <T> void printList() {
		MyMapNode t = head;
		System.out.println("The map entries are as follows");
		while (t != null) {
			System.out.println( t.key + " -> "+ t.value);
			t = t.next;
		}
	}

		public <T> boolean search(T key) {
		MyMapNode n = head;
		while (n != null) {
			if (((String) n.key).compareToIgnoreCase((String) key) == 0)
				return true;
			n = n.next;
		}
		return false;
	}
}
