
public class MyLinkedList {
    private int numNodesSize = 0;
    private Node head;
    public MyLinkedList(Object data){
        head = new Node(data);
    }
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, Object data){
        Node tem = head;
        Node holder;
        for (int i = 0; i < index-1&&tem.next!=null; i++) {
            tem = tem.next;
        }
        holder = tem.next;
        tem.next = new Node(data);
        tem.next.next = holder;
        numNodesSize++;
    }
    public void addFirst(Object data){
        Node tem = head;
        head = new Node(data);
        head.next = tem;
        numNodesSize++;
    }
    public Node get(int index){
        Node tem = head;
        for (int i = 0; i < index; i++) {
            tem = tem.next;
        }
        return tem;
    }
    public void printList() {
        Node tem = head;
        while (tem!=null){
            System.out.println(tem.data);
            tem=tem.next;
        }
    }

}
