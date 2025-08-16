import java.util.*;
public class LinkedList {
public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  public void addFirst(int data) {
    Node newnode = new Node(data);
    size++;
    if (head == tail) {
      head = tail = newnode;
      return;

    }
    newnode.next = head;
    head = newnode;
  }

  public void addLast(int data) {
    Node newnode = new Node(data);
    size++;
    if (head == tail) {
      head = tail = newnode;
      return;
    }
    tail.next = newnode;
    tail = newnode;

  }

  public void print() {
    if (head == null) {
      System.out.println("ll is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void addInMiddle(int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;
    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;

  }

  public int removeFirst() {
    if (size == 0) {
      System.out.println("ll is empty");
      return Integer.MIN_VALUE;

    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public int removeLast() {
    if (size == 0) {
      System.out.println("ll is empty ");
      return Integer.MIN_VALUE;

    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;

    }
    Node prev = head;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;

  }

  public int itrSearch(int key) {
    Node temp = head;
    int i = 0;
    while (temp != null) {
      if (temp.data == key) {
        return i;

      }
      temp = temp.next;
      i++;

    }
    return -1;
  }

  public void reverse() {
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public void deleteNthFromEnd(int n) {
    int size = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
       size++;
    }

    if (n==size ) {
      head = head.next;
      return;
    }
    int i=1;
    int itoidx = size-n;
     Node prev = head;
     while (i<itoidx) {
       prev= prev.next;
       i++;
     }
     prev.next = prev.next.next;
     return;

  }

  private Node findMidNode(Node head){
    Node slow = head;
    Node fast =  head;
    while (fast!=null && fast.next!=null) {
      slow = slow.next;
      fast = fast.next.next;
      
    }
    return slow;
  }

  public boolean checkPallindrone(){
    if (head==null || head.next==null) {
      return true;
      
    }
   Node midnode = findMidNode(head);
   Node curr = midnode;
   Node prev = null;
   while (curr!=null) {
   Node next= curr.next;
    curr.next = prev;
    prev= curr;
    curr = next;
    
   }
   Node right = prev;
   Node left = head;
   while (right!=null) {
    if (left.data!=right.data) {
      return false;
      
    }
    left = left.next;
    right = right.next;
    
   }
   return true;
  }
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();

    ll.addLast(1);
   
    ll.addLast(2);
    
    ll.addLast(2);

    ll.addLast(1);
   
    System.out.println(ll.checkPallindrone());
  }
    
}