package LinkedList;

public class DLLBasics {

    public static DLLNode convertArrayToDLL(int[] arr){
        DLLNode head = new DLLNode(arr[0]);
        DLLNode prev = head;

        for(int i= 1; i < arr.length; i++){
            DLLNode temp = new DLLNode(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    public static void printDLL(DLLNode head){
        DLLNode temp = head;
        System.out.print("The elements in DLL are :: ");
        while (temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    //Deletion in Doubly LL

    public static DLLNode removeHead(DLLNode head){
        if(head == null || head.next == null) return null;
        DLLNode prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;
        return head;
    }

    public static DLLNode removeTail(DLLNode head){
        if(head == null || head.next == null) return null;
        DLLNode tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        DLLNode newTail = tail.prev;
        tail.prev = null;
        newTail.next = null;
        return head;
    }

    public static DLLNode removeKthElement(DLLNode head, int k){
        DLLNode temp = head;
        int counter = 0;
        while (temp != null){
            counter++;
            if(counter == k) break;
            temp = temp.next;
        }

        DLLNode back = temp.prev;
        DLLNode front = temp.next;

        if(back == null && front == null) return null;
        else if (back == null) return removeHead(head);
        else if(front == null){
            DLLNode tail = temp.prev;
            temp.prev = null;
            tail.next = null;
        }
        else{
            back.next = front;
            front.prev = back;
            temp.next = null;
            temp.prev = null;
        }
        return head;
    }

    public static DLLNode removeByValue(DLLNode head, int val){
        DLLNode temp = head;
        boolean flag = false;
        while (temp != null){
            if(temp.data == val) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(!flag) {
            System.out.println("Value not found");
            return head;
        }
        DLLNode back = temp.prev;
        DLLNode front = temp.next;

        if(back == null && front == null) return null;
        else if (back == null) return removeHead(head);
        else if(front == null){
            DLLNode tail = temp.prev;
            temp.prev = null;
            tail.next = null;
        }
        else{
            back.next = front;
            front.prev = back;
            temp.next = null;
            temp.prev = null;
        }

        return head;
    }

    // Insertion in DLL

    public static DLLNode insertAtHead(DLLNode head,int val){
        DLLNode newNode = new DLLNode(val,head,null);
        head.prev = newNode;
        return newNode;
    }

    public static DLLNode insertAfterHead(DLLNode head, int val){
        if(head == null) return null;
        DLLNode newNode = new DLLNode(val);
        newNode.next = head.next;
        newNode.prev = head;
        head.next = newNode;
        return head;
    }

    public static DLLNode insertAtTail(DLLNode head, int val){
        if(head == null) return null;
        DLLNode newNode = new DLLNode(val);
        if(head.next == null){
            newNode.prev = head;
            head.next = newNode;
            return head;
        }
        DLLNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        newNode.prev = temp;
        temp.next = newNode;
        return head;
    }

    public static DLLNode insertBeforeTail(DLLNode head, int val){
        if(head == null) return null;
        DLLNode newNode = new DLLNode(val);
        if(head.next == null){
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            return newNode;
        }
        DLLNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        newNode.next = temp;
        newNode.prev = temp.prev;
        temp.prev.next = newNode;
        temp.prev = newNode;
        return head;
    }

    public static DLLNode insertAtKthPosition(DLLNode head, int val, int k) throws NullPointerException{

        DLLNode temp = head;
        int counter = 0;
        while (temp != null){
            counter++;
            if(counter == k) break;
            temp = temp.next;
        }

        DLLNode back = temp.prev;
        DLLNode front = temp.next;

        if(back == null && front == null) return null;
        else if(back  == null) return insertAtHead(head,val);
        else if(front == null) return insertAtTail(head, val);
        else{
            DLLNode newNode = new DLLNode(val,temp,back);
            back.next = newNode;
            temp.prev = newNode;
        }

        return head;

    }

    public static void insertBeforeNode(DLLNode node, int val){
        DLLNode back = node.prev;
        DLLNode newNode = new DLLNode(val,node,back);
        back.next = newNode;
        node.prev = newNode;

    }
}
