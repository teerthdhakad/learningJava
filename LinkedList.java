public class LinkedList {
    Node head;

    public LinkedList(int data) {
        this.head = new Node(data);
    }

    public void insert(Node temp) {
        if (this.head == null) {
            this.head = temp;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }
    }

    public void printList() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void delete(int data) {
        if (this.head == null) {
            return;
        }
        Node current = this.head;
        Node prev = null;
        while (current.data != data && current != null) {
            prev = current;
            current = current.next;
        }
        if (current.next == null) {
            prev.next = null;
        } else {
            prev.next = current.next;
        }
    }

    public void insertAtStart(Node temp){
        if(this.head == null){
            head = temp;
        }
        else{
            temp.next = this.head;
            this.head = temp;
        }
    }
    public void insertAt(int idx,Node temp){
        Node current = this.head;
        Node prev = null;
        while(idx-- > 0 && current != null){
            prev = current;
            current = current.next;
        }
        if(prev == null){
            temp.next = this.head;
            this.head = temp;
        }else if(current == null){
            prev.next = temp;
        }
        else{
            prev.next = temp;
            temp.next = current;
        }
    }
}
