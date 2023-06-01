// Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).

//двухсвязный список
package Sem3_Alg_HW;

public class ReversingLinkedList {
    Node head;
    Node tail;

    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;

        }
    }
}

// односвязный список

// public class ReversingLinkedList {
//     Node head;

//     public void revert() {
//         if (head != null && head.next != null) {
//             revert(head.next, head);
//         }
//     }

//     private void revert(Node currentNode, Node previousNode){
//         if (currentNode.next==null){
//             head = currentNode;
//         }else{
//             revert(currentNode.next, currentNode);   
//         }
//         currentNode.next=previousNode;
//         previousNode.next=null;
//     }
// }

