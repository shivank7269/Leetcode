class MinStack {
    private Node head;

    private class Node {
        int value;
        int min;
        Node next;

        Node(int value, int min, Node next) {
            this.value = value;
            this.min = min;
            this.next = next;
        }
    }

    public MinStack() {
        head = null;
    }

    public void push(int val) {
        if (head == null) {
            head = new Node(val, val, null);
        } else {
            head = new Node(val, Math.min(val, head.min), head);
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        int val=0;
        if (head != null) {
            val= head.value;
        }
        return val;
    }

    public int getMin() {
        int min=0;
        if (head != null) {
            min= head.min;
        }
        return min;
    }
}