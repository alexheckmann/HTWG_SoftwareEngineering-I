package collections.examples.linkedlist;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class LList<T> implements Iterable<T> {

    private Node<T> head;

    public int size() {

        if (head == null) {
            return 0;
        } else {

            Node<T> currentNode = head;
            int length = 1;
            for (; currentNode.getNextNode() != null; length++) {
                currentNode = currentNode.getNextNode();
            }
            return length;
        }
    }

    public void insert(T content) {

        Node<T> newNode = new Node<>(content);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }

            currentNode.setNextNode(newNode);
            newNode.setPreviousNode(currentNode);
        }
    }

    // task03
    public void insert(int i, T content) {

        if (i >= size()) { // if the index is bigger than the size of the list, an exception will be thrown
            throw new IndexOutOfBoundsException();
        } else if (i < 0) { // if the index is a negative number, an exception will be thrown
            throw new IndexOutOfBoundsException();
        }

        Node<T> newNode = new Node<>(content);
        Node<T> currentNode = head;

        if (i == 0) {
            currentNode.setPreviousNode(newNode);
            newNode.setNextNode(currentNode);
            head = newNode;
        }


        for (int j = 0; j < i; j++) {
            currentNode = currentNode.getNextNode();
        }

        currentNode.getPreviousNode().setNextNode(newNode);
        newNode.setNextNode(currentNode);
        newNode.setPreviousNode(currentNode.getPreviousNode());
        currentNode.setPreviousNode(newNode);

    }


    // task01
    public boolean contains(T content) {
        for (T tmp : this) {
            if (tmp.equals(content)) {
                return true;
            }
        }
        return false;
    }

    public T get(int i) {

        if (i >= size()) { // if the index is bigger than the size of the list, an exception will be thrown
            throw new IndexOutOfBoundsException();
        } else if (i < 0) { // if the index is a negative number, an exception will be thrown
            throw new IndexOutOfBoundsException();
        }

        Node<T> currentNode = head;
        for (int j = 0; j < i && currentNode.getNextNode() != null; j++) {
            currentNode = currentNode.getNextNode();
        }

        return currentNode.getContent();
    }

    // task02
    public void put(int i, T newContent) {

        //Node<T> newNode = new Node<>(newContent);

        if (i >= size() && size() != 0) { // if the index is bigger than the size of the list, an exception will be thrown
            throw new IndexOutOfBoundsException();
        } else if (i < 0) { // if the index is a negative number, an exception will be thrown
            throw new IndexOutOfBoundsException();
        }

        if (i == 0) {

            head.setContent(newContent);

        } else {

            Node<T> currentNode = head;

            for (int j = 0; j < i; j++) {
                currentNode = currentNode.getNextNode();
            }

            currentNode.setContent(newContent);
        }
    }

    public void remove(int i) {

        if (i >= size()) { // if the index is bigger than the size of the list, an exception will be thrown
            throw new IndexOutOfBoundsException();
        } else if (i < 0) { // if the index is a negative number, an exception will be thrown
            throw new IndexOutOfBoundsException();
        }

        if (i == 0) {
            head = head.getNextNode();
            return;
        }

        Node<T> currentNode = head;
        for (int j = 0; j < i; j++) {
            currentNode = currentNode.getNextNode();
        }

        currentNode.getPreviousNode().setNextNode(currentNode.getNextNode());

        if (currentNode.getNextNode() != null) {
            currentNode.getNextNode().setPreviousNode(currentNode.getPreviousNode());
        }
    }

    // task04
    public boolean remove(T object) {

        int index = 0;

        if (head.getContent().equals(object)) {
            remove(index);
            return true;
        }

        Node<T> currentNode = head;

        while (currentNode.getNextNode() != null) {
            index++;
            currentNode = currentNode.getNextNode();

            if (currentNode.getContent().equals(object)) {
                remove(index);
            }

        }

        return false;
    }

    // task05
    @Override
    public @NotNull Iterator<T> iterator() {

        return new LListIterator<T>(head);
    }

    private class LListIterator<T> implements Iterator<T> {

        private Node<T> currentNode;

        public LListIterator(Node<T> currentNode) {

            Node<T> dummyNode = new Node<>(null);
            this.currentNode = dummyNode;
            this.currentNode.setNextNode(currentNode);
        }

        @Override
        public boolean hasNext() {
            return currentNode.getNextNode() != null;
        }

        @Override
        public T next() {
            currentNode = currentNode.getNextNode();
            return (T) currentNode.getContent();
        }
    }
}
