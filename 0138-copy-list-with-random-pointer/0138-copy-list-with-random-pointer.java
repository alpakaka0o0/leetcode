/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = new Node(0);
        Node answer= dummy;
        HashMap<Node, Node> nodeMap = new HashMap<>();

        while (head != null){
            if (!nodeMap.containsKey(head)){
                nodeMap.put(head, new Node(head.val));
            }
            answer.next = nodeMap.get(head);

            if (head.random != null){
                if (!nodeMap.containsKey(head.random)){
                    nodeMap.put(head.random, new Node(head.random.val));
                }
                answer.next.random = nodeMap.get(head.random);
            }

            answer = answer.next;
            head = head.next;
        }
        return dummy.next;
    }
}