package LinkedList;

public class LLBasics {

    public static Node convertArrayToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void printLL(Node head){
        Node temp = head;
        System.out.print("The elements in LL are :: ");
        while (temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    //Deletion in Linked List
    public static Node removeHead(Node head){
        if(head==null) return head;
        head = head.next;
        return head;
    }

    public static Node removeTail(Node head){
        if(head==null || head.next==null) return null;
        Node temp = head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    public static Node removeKthElement(Node head,int k){
        if(head==null) return head;
        if(k==1){
            head = head.next;
            return head;
        }
        int counter = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null){
            counter++;
            if(k == counter){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node removeByValue(Node head, int val){
        if(head==null) return head;
        if(head.data == val){
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null){

            if(temp.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // Insertion in Linked List
    public static Node insertAtHead(Node head,int val){
        return new Node(val,head);
    }

    public static Node insertAtTail(Node head, int val){
        if(head == null) return new Node(val);

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(val);
        return head;
    }

    public static Node insertAtKthPosition(Node head, int val, int k){
        if(head == null){
            if(k==1){
                return new Node(val);
            }
            return null;
        }

        if(k==1){
            return new Node(val,head);
        }

        int counter = 0;
        Node temp = head;

        while (temp != null){
            counter++;

            if(counter == k - 1){
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }

            temp = temp.next;
        }

        return head;
    }

    public static Node insertBeforeValue(Node head, int val, int target){
        boolean flag = false;
        if(head == null){
            return null;
        }

        if(head.data == target){
            flag = true;
            return new Node(val,head);
        }


        Node temp = head;

        while (temp.next != null){

            if(temp.next.data == target){
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                flag = true;
                break;
            }

            temp = temp.next;
        }
        if(!flag){
            System.out.println("Target element not found");
        }
        return head;
    }

}
