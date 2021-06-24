package com.abhi.linkedlist;
/**
 * LinkedList -- Performing LinkedList Operations
 *
 * @author Abhishek Shigavan
 *
 */
public class MyLinkedList <E> {

    //defining head & tail
    public INode<E> head;
    public INode<E> tail;

    public MyLinkedList() {

        this.head = null;
        this.tail = null;
    }
/**
 * In this method if head & tail are
 * null then assign new node as head & tail
 * Else setting it as next to tail 
 * & make new node as tail 
 *
 * @param newNode
 * @return No return
 */
    public void addNode(INode<E> newNode){

        if(this.head == null){
            //setting new node as head
            this.head = newNode;
        }
        if(this.tail == null){
            //setting new node as tail
            this.tail = newNode;
        }
        else{
            //storing tail into temp node
            INode<E> tempNode = this.tail;
            //setting new tail next to old tail
            tempNode.setNext(newNode);
            //setting new node as tail
            this.tail = newNode;
        }
    }
}
