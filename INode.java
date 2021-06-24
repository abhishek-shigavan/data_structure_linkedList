package com.abhi.linkedlist;

public interface INode<E> {

    //generic key
    E getKey();
    void setKey(E key);

    //To get next node
    INode <E> getNext();
    void setNext(INode<E> next);
}
