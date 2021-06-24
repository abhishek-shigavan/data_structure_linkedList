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
/**
 * In this method --
 * If new node is first node of LinkedList
 * then it will make it head & tail both
 * Else new node will be added to front of
 * head
 *
 * @param newNode
 *
 * @return No return
 */
    public void addNodeAtFront(INode<E> newNode) {

        if(this.tail == null) {
            //making new node as tail
            this.tail = newNode;
        }

        if(this.head == null) {
            //making new node as head
            this.head = newNode;
        }
        else {
            //storing current head node into temp node
            INode<E> tempNode = this.head;
            //making new node as a head
            this.head = newNode;
            //setting temp node next to head node
            this.head.setNext(tempNode);
        }
    }
/**
 * In this method --
 * If new node is first node of LinkedList
 * then it will make it head & tail both
 * Else new node will be added to next to
 * tail (i.e it will be the next tail)
 *
 * @param newNode
 *
 * @return No return
 */
    public void addNodeAtTail(INode<E> newNode){

        if(this.head == null){
            //making new node as head
            this.head = newNode;
        }
        if(this.tail == null){
            //making new node as tail
            this.tail = newNode;
        }
        else {
            //setting new node as next to tail
            this.tail.setNext(newNode);
            //setting new node as new tail
            this.tail = newNode;
        }
    }
/**
 * In this method first setting head &
 * tail if they are null
 * Then replacing node next to head with
 * new node & making old one next to new one
 *
 * @param newNode
 * @return No return
 */
    public void addNodeBetween(INode<E> newNode){

        if(this.head == null){
            //setting new node as head
            this.head = newNode;
        }
        else if(this.tail == null){
            //setting new node as tail
            this.tail = newNode;
        }
        else{
            //storing node next to head into temp
            INode<E> tempNode =this.head.getNext();
            //setting new node as next to start
            this.head.setNext(newNode);
            //setting temp node as next to new node
            newNode.setNext(tempNode);
        }
    }
}
