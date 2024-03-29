package LinkedList;

public class LLmain {
    int[] arr = {1,2,3,4};

    public void callLLFunctions(){
        //LL

//        Node head = LLBasics.convertArrayToLL(arr);
//        Node head = null;
//        LLBasics.printLL(head);
//        Node newHead= LLBasics.removeHead(head);
//        Node newNode = LLBasics.removeTail(head);
//        Node newHead = LLBasics.removeKthElement(head,4);
//        Node newHead = LLBasics.removeByValue(head,3);
//        Node newHead = LLBasics.insertAtHead(head,0);
//        Node newHead = LLBasics.insertAtTail(head,9);
//        Node newHead = LLBasics.insertAtKthPosition(head, 9, 5);
//        Node newHead = LLBasics.insertBeforeValue(head,9, 6);
//        LLBasics.printLL(newHead);

        //DLL

        DLLNode head = DLLBasics.convertArrayToDLL(arr);
        DLLBasics.printDLL(head);
//        DLLNode newHead = DLLBasics.removeHead(head);
//        DLLNode newHead = DLLBasics.removeTail(head);
//        DLLNode newHead = DLLBasics.removeKthElement(head,3);
        DLLNode newHead = DLLBasics.removeByValue(head,6);
        DLLBasics.printDLL(newHead);

    }

}
