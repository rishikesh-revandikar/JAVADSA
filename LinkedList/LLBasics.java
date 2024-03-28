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


}
