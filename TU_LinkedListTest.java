package com.abhi.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TU_LinkedListTest {
     //creating linked list
    @Test
    void when3NumbersAddedToLinkedListLastNodeShouldBeTail() {

        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(myFirstNode);
        myLinkedList.addNode(mySecondNode);
        myLinkedList.addNode(myThirdNode);
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
    //for add node at front
    @Test
    void when3NumbersAddedToLinkedListLastNoShouldBeAddedFront() {

        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNodeAtFront(myFirstNode);
        myLinkedList.addNodeAtFront(mySecondNode);
        myLinkedList.addNodeAtFront(myThirdNode);
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }
    //for append
    @Test
    void when3NumbersAddedToLinkedListLastNoShouldBeAtTail() {

        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNodeAtTail(myFirstNode);
        myLinkedList.addNodeAtTail(mySecondNode);
        myLinkedList.addNodeAtTail(myThirdNode);
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
    //for add node in betweem
    @Test
    void when3NumbersAddedToLinkedListLastNoShouldBeInBetween() {

        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(70);
        MyNode<Integer> myThirdNode = new MyNode<>(30);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNodeBetween(myFirstNode);
        myLinkedList.addNodeBetween(mySecondNode);
        myLinkedList.addNodeBetween(myThirdNode);
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(myThirdNode) &&
                myLinkedList.tail.equals(mySecondNode);
        Assertions.assertTrue(result);
    }
}