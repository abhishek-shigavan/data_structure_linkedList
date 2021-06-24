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
/**
 * In this method storing head node
 * into temp node &
 * Assigning node next to head as
 * new head node
 *
 * @return Pop Node
 */
    public INode<E> popAtFirst(){
       
	//storing head node into temp node
        INode<E> tempNode = this.head;
        
	//setting node next ot head as new head
        this.head = this.head.getNext();
        
	//returning old head
        return tempNode;
    }
/**
 * In this method head will be storing
 * into tempNode &
 * iterate through loop till tail is reached
 * tempNode will get replaced with next node
 * when goes through loop
 * At last tempNode having value of node previous
 * to tails
 * making tempNode as tail & returning node next to it
 *
 * @return old tail
 */
    public INode<E> popAtLast(){

        //setting tempNode as head
        INode tempNode = this.head;

        //loop will break as it reaches tail
        while (!tempNode.getNext().equals(tail))
        {
            //replacing temp node with next node
            tempNode = tempNode.getNext();
        }

        //setting previous node of tail as new tail
        this.tail = tempNode;

        //storing old tail into tempNode
        tempNode = tempNode.getNext();

        //returning old tail
        return tempNode;
    }
/**
 * This method matches key of each
 * node with given key &
 * when key matches returns node of that key
 *
 * @param key
 * @return Node of given key
 */
    public INode<E> findNode(E key){
        //storing head into tempNode
        INode tempNode = this.head;

        boolean flag = true;
        //matching each node key with given key
        while (flag) {
            if (tempNode.getKey().equals(key)) {

                flag = false;
                //returning node
                return tempNode;
            } else {
                //storing next node into tempNode for further iteration
                tempNode = tempNode.getNext();
            }
        }
        return null;
    }
 /**
  * This method insert new node next
  * to node of given key
  *
  * @param key
  * @param newNode
  */
    public void insertAt(E key, INode<E> newNode){

        //getting node of given key
        INode<E> keyNode = findNode(key);

        //storing node next to node of key into tempNode
        INode<E> tempNode = keyNode.getNext();

        //setting new node as next node to given node
        keyNode.setNext(newNode);

        //setting old next of given node as a next to new node
        newNode.setNext(tempNode);
    }
 /**
  * This method deletes node of given
  * key
  * Method will find previous & next node of key node
  * & set next node as next to previous node
  *
  * @param key
  * @return No return
  */
    public INode<E> deleteAt(E key){

        //getting node of given key
        INode<E> keyNode = findNode(key);

        //setting tempNode as head
        INode tempNode = this.head;

        //getting front node of key node
        while (!tempNode.getNext().equals(keyNode))
        {
            //replacing temp node with next node
            tempNode = tempNode.getNext();
        }

        INode<E> previousToKey= tempNode;
        INode<E> nextToKey = keyNode.getNext();

        previousToKey.setNext(nextToKey);
        //returning deleted node
        return keyNode;
    }
}
