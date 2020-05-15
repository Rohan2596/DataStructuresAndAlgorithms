package com.practice.datastructure.LinkedList;

public class DoubleLinkedList {

     Node head;

    class  Node<T>{
        Object data;
        Node next;
        Node prev;

        public Node(Object data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public  void insertNode(int data){
        Node new_Node=new Node(data);
        new_Node.next=null;
        if(head==null) {
            head = new_Node;
        }else{
            Node last=head;
            while (last.next!=null){
                last=last.next;
            }
            last.next=new_Node;
        }
    }


    public void traversal(DoubleLinkedList doubleLinkedList){
        Node current_node=doubleLinkedList.head;
        while (current_node!=null){
            System.out.println(current_node.data);
            current_node=current_node.next;
        }
    }
    public static void main(String[] args) {
          DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
          doubleLinkedList.insertNode(2);
        doubleLinkedList.insertNode(1);
        doubleLinkedList.traversal(doubleLinkedList);
    }
}
