package com.abhi.linkedlist;

public class MyNode<E> implements INode<E>  {

    private E key;
    private INode<E> next;

    public MyNode(E key) {

        this.key = key;
        this.next = next;
    }

    @Override
    public E getKey() {

        return key;
    }

    @Override
    public void setKey(E key) {

        this.key = key;
    }

    @Override
    public INode<E> getNext() {

        return next;
    }

    @Override
    public void setNext(INode<E> next) {

        this.next = (MyNode<E>) next;
    }
}
