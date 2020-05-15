package com.practice.datastructure.LinkedList;

public class SinglyList<T> {

    Node head;
    class Node<T>{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public  void insert(int data){
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

    public void deleteHead(SinglyList singlyList){
        Node head=singlyList.head;
        Node next_head=singlyList.head.next;
        head.next=null;
        singlyList.head=next_head;
    }
    public void deleteEnd(SinglyList singlyList){
        Node curNode=singlyList.head;
        Node last_Node=null;
        while (curNode.next!=null){
            last_Node=curNode;
            curNode=curNode.next;

        }
        last_Node.next=null;
    }

    public void insertHead(int data,SinglyList singlyList) {
        Node head_node=new Node(data);
        System.out.println(head_node.data+"List Head"+singlyList.head.data);
        if(head==null){
            head=head_node;
            head_node.next=null;
            System.out.println("dsad");
        }
        if(head!=null){
            Node next_Head=head;
            head=head_node;
            head.next=next_Head;

            System.out.println(head.data +"AFTER");
        }

    }
    public void insertAtposition(int data,int position,SinglyList singlyList){

        int size=singlyList.size(singlyList);
        if(position>size){
            System.out.println("Position Greater than Size of list which is :-  "+ size);
        }
        if(position==1)
        {
            singlyList.insertHead(data,singlyList);
        }
        if(position<=size){
            int pos=0;
            Node pos_Node=new Node(data);
            Node currNode=head;
            while(currNode.next!=null){
                pos=pos+1;
                if (pos==(position-1)){
                    System.out.println("Node 1    " + currNode.data);
                    Node next_node=currNode.next;
                    Node pre_node=currNode;
                    pre_node.next=pos_Node;
                    pos_Node.next=next_node;
                    break;
                }
                currNode=currNode.next;
            }

        }
        if(position==size){
            singlyList.insert(data);
        }

    }
    public void deleteAtPosition(int position,SinglyList singlyList){

        int size=singlyList.size(singlyList);
        if(position>size){
            System.out.println("Position Greater than Size of list which is :-  "+ size);
        }
        if(position==1)
        {
            singlyList.deleteHead(singlyList);
        }
        if(position<=size){
            int pos=0;
            Node currNode=head;
            while(currNode.next!=null){
                pos=pos+1;
                if (pos==(position-1)){
                    System.out.println("Node 1    " + currNode.data);
                    Node prevNode=currNode;
                    Node nextNode=currNode.next.next;
                    prevNode.next=nextNode;
                    break;
                }
                currNode=currNode.next;
            }

        }
        if(position==size){
            singlyList.deleteEnd(singlyList);
        }

    }
    public int size(SinglyList singlyList){
        int size=0;
        Node currNode=singlyList.head;
        while(currNode.next!=null){
            currNode=currNode.next;
            size+=1;
        }
        if(currNode.next==null){
            size+=1;
        }

        return size;
    }
    public void traversal(SinglyList singlyList){
        Node currNode=singlyList.head;
        while (currNode!=null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }

    public static void main(String[] args) {
        SinglyList singlyList=new SinglyList();
        singlyList.insert(1);
        singlyList.insert(2);
        singlyList.insert(3);
        singlyList.traversal(singlyList);
        singlyList.insertHead(4,singlyList);
        singlyList.traversal(singlyList);
        System.out.println( "Size Of List:- "+singlyList.size(singlyList));
        singlyList.insertAtposition(10,2 ,singlyList);
        singlyList.traversal(singlyList);
        singlyList.insertAtposition(11,1 ,singlyList);
        singlyList.traversal(singlyList);
        System.out.println( "Size Of List:- "+singlyList.size(singlyList));
        singlyList.insertAtposition(12,6,singlyList);
        singlyList.traversal(singlyList);
        System.out.println( "Size Of List:- "+singlyList.size(singlyList));
        singlyList.deleteHead(singlyList);
        singlyList.traversal(singlyList);
        System.out.println( "Size Of List:- "+singlyList.size(singlyList));
        singlyList.deleteEnd(singlyList);
        singlyList.traversal(singlyList);
        System.out.println( "Size Of List:- "+singlyList.size(singlyList));
        singlyList.deleteAtPosition(2,singlyList);
        singlyList.traversal(singlyList);
        System.out.println( "Size Of List:- "+singlyList.size(singlyList));


    }




}
