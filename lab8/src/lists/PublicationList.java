package lists;

import classes.PrintedPublication;

public final class PublicationList{
    private static Node<PrintedPublication> startNode = new Node<>(null);
    private static Node<PrintedPublication> currentNode = startNode;

    public static void add(PrintedPublication value) {
        Node<PrintedPublication> cur = startNode;
        while (cur.hasNext()) {
            cur = cur.getNext();
        }
        cur.setNext(new Node<>(value));
    }

    public static boolean hasNext() {
        return currentNode.hasNext();
    }

    public static PrintedPublication getNext() throws Exception {
        if(currentNode.hasNext()) {
            currentNode = currentNode.getNext();
            return currentNode.getValue();
        }
        else {
            throw new Exception("У списка нет следующего значения");
        }
    }

    public static void refresh() {
        currentNode = startNode;
    }

    public static int size() {
        Node<PrintedPublication> cur = startNode;
        int count = 0;
        while(cur.hasNext()) {
            count++;
            cur = cur.getNext();
        }
        return count;
    }

    public static void clear() {
        startNode = new Node<>(null);
        currentNode = startNode;
    }

}