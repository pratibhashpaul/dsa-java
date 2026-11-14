class LinkedStack 
{
    private static class Node 
	{
        int data;
        Node next;
    }

    private Node head = null;

    protected void push(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }
}