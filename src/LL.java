class Ll{
    Node head;
    int size;
    Ll(){
        this. size = 0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;

        }
    }
    // add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head= newNode;
            return;
        }
        newNode.next = head;
        head = newNode;


    }
    //add last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head= newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;


    }
    //delete first
    public void delFirst(){
        if(head == null){

            return;
        }

        head = head.next;
        size--;
    }

    //del Last
    public void delLast(){
        if(head == null){
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secLastNode = head;
            while(secLastNode.next.next != null){
                secLastNode = secLastNode.next;
        }
            secLastNode.next =null;

    }
    public int getSize(){
        return size;
    }
    //print list
    public void printLl(){
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    //reverse linklist
    public void reverseList(){
        if(head == null || head.next== null){
            return;
        }

        Node previous = head;                   // take three pointer previous, current, next node
        Node current = head.next;
        while(current != null){
            Node next = current.next;
            current.next = previous;
            //update
            previous = current;
            current = next;
        }
        head.next = null;
        head = previous;
    }

    // reverse list by recurrsively
    public Node reverseRecurrsive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecurrsive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;


    }




    public static void main(String args[]){
        Ll list = new Ll();
        list.addLast(12);
        list.addFirst(11);
        list.addFirst(10);
        list.addFirst(14);
        list.addFirst(15);
        list.printLl();
        list.head = list.reverseRecurrsive(list.head);



        list.printLl();
        System.out.println(list.getSize());


    }
}