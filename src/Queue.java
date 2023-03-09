public class Queue {
    Node head;
    Node tail;

    public boolean isNotEmpty() {
        return head != null; // no need to check for tail
    }

    public void enQueue(int d) {
        Node newNode = new Node(d);
        if (head == null) head = newNode;
        else tail.next = newNode;
        tail = newNode;
    }

    public int deQueue() throws Exception {
        if (isNotEmpty()) {
            int d = head.data;
            head = head.next;
            return d;
        } else {
            throw new Exception("Queue is empty.");
        }
    }

    public void printQueue() {
        if (isNotEmpty()) {
            Node temp = head;
            System.out.print("Head <- ");
            while (temp != null) {
                System.out.print(temp.data + " <- ");
                temp = temp.next;
            }
            System.out.println("Tail");
        } else {
            System.out.println("Queue is empty");
        }
    }
}
