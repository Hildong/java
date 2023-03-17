package myutil;

public class MyList<E> {

    private Node<E> firstNode;

    private Node<E> getFirstNode() {
        return this.firstNode;
    }

    private void setFirstNode(Node<E> node) {
        this.firstNode = node;
    }

    public void add(E element) {
        //    Ska lägga till ett nytt element i listan
        this.setFirstNode(new Node<E>(element, this.getFirstNode()));
    }

    public E getElementAt(int i) {
        Node<E> currentNode = this.getFirstNode();
        for(int j = 0; j < i; j++) {
            if (currentNode == null) {
                throw new IndexOutOfBoundsException();
            }
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    public boolean isEmpty() {
        return this.getFirstNode() == null;
    }

    public int size() {
        int size = 0;
        Node<E> currentNode = this.getFirstNode();
        while (currentNode != null) {
            currentNode = currentNode.getNext();
            size++;
        }
        return size;
    }

}
