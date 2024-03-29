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


}
