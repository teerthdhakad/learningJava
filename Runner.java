public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(10);
        list.insert(new Node(22));
        list.insert(new Node(11));
        list.insert(new Node(30));
        list.insert(new Node(15));

        System.out.println("Original List:");
        list.printList();

        list.delete(11);
        list.delete(15);

        System.out.println("List after deletion:");
        list.printList();

        Node newNode = new Node(5);
        list.insertAtStart(newNode);
        list.printList();

        Node insertAtNode = new Node(25);
        list.insertAt(10, insertAtNode);
        System.out.println("List after inserting at index 2:");
        list.printList();
    }
}
