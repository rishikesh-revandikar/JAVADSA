package LinkedList;

public class LLmain {
    int[] arr = {1,2,3,4};

    public void callLLFunctions(){
        Node head = LLBasics.convertArrayToLL(arr);
        LLBasics.printLL(head);
    }

}
