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
        System.out.println("Inserting Node");
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
            new_Node.prev=last;
        }
    }
    private void insertAtEnd(int data) {
        System.out.println("Inserting Node At ENd");

        Node end_Node=new Node(data);
        end_Node.next=null;
        Node last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=end_Node;
        end_Node.prev=last;
    }

    private void insertAtHead(int data) {
        System.out.println("Inserting Node  Head");

        Node new_head=new Node(data);
        Node old_head=head;
        head=new_head;
        head.next=old_head;
        old_head.prev=head;
    }


    private void deleteAtHead(DoubleLinkedList doubleLinkedList){
        Node head=doubleLinkedList.head;
        Node new_head=doubleLinkedList.head.next;
        doubleLinkedList.head=new_head;
    }

    private void deleteAtEnd(DoubleLinkedList doubleLinkedList){
        Node current_node=doubleLinkedList.head;
        Node new_last=null;
        while (current_node.next!=null){
            new_last=current_node;
            current_node=current_node.next;

        }
        new_last.next=null;
    }

    public void traversal(DoubleLinkedList doubleLinkedList){
        System.out.println("Traversal Of Double LinkedList");
        Node current_node=doubleLinkedList.head;
        while (current_node!=null){
            System.out.println(current_node.data);
            current_node=current_node.next;
        }
    }
    private void inversetraversal(DoubleLinkedList doubleLinkedList) {
        System.out.println("Inverse Traversal Of Double LinkedList");

        Node currNode=doubleLinkedList.head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        Node lastNode=currNode;
        while (lastNode.prev!=null){
            System.out.println(lastNode.data);
            lastNode=lastNode.prev;
        }

    }
    public int size(DoubleLinkedList doubleLinkedList){
        int size=0;
        Node currNode=doubleLinkedList.head;
        while(currNode.next!=null){
            currNode=currNode.next;
            size+=1;
        }
        if(currNode.next==null){
            size+=1;
        }

        return size;
    }
    public void deleteAtPosition(int position,DoubleLinkedList doubleLinkedList){

        int size=doubleLinkedList.size(doubleLinkedList);
        if(position>size){
            System.out.println("Position Greater than Size of list which is :-  "+ size);
        }
        if(position==1)
        {
            doubleLinkedList.deleteAtHead(doubleLinkedList);
        }
        if(position<=size){
            int pos=0;
            Node currNode=head;
            while(currNode.next!=null){
                pos=pos+1;
                if (pos==(position+1)){
                    System.out.println(pos + "position "+position);
                    Node next_node=currNode;
                    System.out.println("Data.....1:- "+next_node.data);
                    Node prev_node=currNode.prev.prev;
                    System.out.println("Data.....2:- "+prev_node.data);
                    prev_node.next=next_node;
                    break;
                }
                currNode=currNode.next;
            }

        }
        if(position==size){
            doubleLinkedList.deleteAtEnd(doubleLinkedList);
        }

    }
    public static void main(String[] args) {
          DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
          doubleLinkedList.insertNode(1);
        doubleLinkedList.insertNode(2);
        doubleLinkedList.traversal(doubleLinkedList);
        doubleLinkedList.insertAtHead(10);
        doubleLinkedList.traversal(doubleLinkedList);
        doubleLinkedList.insertAtEnd(20);
        doubleLinkedList.traversal(doubleLinkedList);
        doubleLinkedList.inversetraversal(doubleLinkedList);
        doubleLinkedList.deleteAtHead(doubleLinkedList);
        doubleLinkedList.traversal(doubleLinkedList);
        doubleLinkedList.deleteAtEnd(doubleLinkedList);
        doubleLinkedList.traversal(doubleLinkedList);
        System.out.println(doubleLinkedList.size(doubleLinkedList));
        doubleLinkedList.insertNode(11);
        doubleLinkedList.insertNode(12);
        doubleLinkedList.traversal(doubleLinkedList);
        doubleLinkedList.deleteAtPosition(2,doubleLinkedList);
        doubleLinkedList.traversal(doubleLinkedList);


    }




}
