package LinkedList;


public class main {
    public static void main(String[] args) {
    SinglyLinkedList<Integer> list= new SinglyLinkedList<Integer>();
        list.addfirst(10);
        list.addfirst(20);
        list.addLast(50);
        list.removeLast();
        list.addAtPosition(80,3);
        list.addLast(40);
        list.display();
    CircularleyLinkedList<String> clist=new CircularleyLinkedList<>();
        clist.addFirst("A");
        clist.addFirst("B");
        clist.addFirst("C");
        clist.addLast("D");
        clist.addLast("E");
        clist.removeFirst();
        clist.removeLast();
        clist.display();
    DoublyLinkedList<Integer> dlist=new DoublyLinkedList<Integer>();
        dlist.addFirst(10);
        dlist.addFirst(20);
        dlist.addFirst(60);
        dlist.addFirst(50);
        dlist.display();
        dlist.addLast(40);
        dlist.addLast(30);
        dlist.removeFirst();
        dlist.removeLast();
        dlist.display();
}}
