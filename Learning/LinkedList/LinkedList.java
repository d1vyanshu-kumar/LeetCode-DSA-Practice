public class LinkedList {

    // now for creating a double linked list...

    private Node head;   // this will point which only on a very first node...

    public void insertFirstELement(int val){
        //The very first task is to make a box which contains that val....

        Node node = new Node(val);
        // we need to take two condition here for that what if there is already a linked list exist and what if we are going to embed a new element:

        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node; // only if the head is not is equal to null if not then it is going to give null pointer exception...
        }

        head = node;  // this if for the very first element...
    }


    public void display(){
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("end ");
    }


    public static void main(String[] args) {
        
        LinkedList node = new LinkedList();
        node.insertFirstELement(3);
        node.insertFirstELement(4);
        node.insertFirstELement(5);
        node.insertFirstELement(6);
        node.insertFirstELement(7);
        node.insertEnd(1000);

        node.display();
    }


    public void insertEnd(int val){
        // same here we are going to take two condition the one is empty and the other one have there are provided ll...
        // we need to create a very first box;
        Node node = new Node(val);
        // after creating a new box we are going to look for the next and previous

        Node last = head;
        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }





    // our dl have a val and which is given by the user and the next and the pervious have a nul value...
    private class Node{
        int val;
        Node prev;
        Node next;

        

        public Node(int val) {
            this.val = val;
        }



        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

    }
}
