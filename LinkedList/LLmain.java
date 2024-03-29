package LinkedList;

public class LLmain {
    int[] arr = {1,2,3,4};

    public void callLLFunctions(){
        Node head = LLBasics.convertArrayToLL(arr);
        LLBasics.printLL(head);
//        Node newHead= LLBasics.removeHead(head);
//        Node newNode = LLBasics.removeTail(head);
//        Node newHead = LLBasics.removeKthElement(head,4);
        Node newHead = LLBasics.removeByValue(head,3);
        LLBasics.printLL(newHead);

    }

}
