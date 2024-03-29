package LinkedList;

public class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    public DLLNode(){
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    public DLLNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public DLLNode(int data, DLLNode next, DLLNode prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
