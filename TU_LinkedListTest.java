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
}