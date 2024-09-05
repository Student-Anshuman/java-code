public class QueueY {
    static int arr[];
    static int size;
    static int rear = -1;
    QueueY(int n){
        arr = new int[n];
        this.size = n;

    }
    public static boolean isEmpty(){
        return rear == -1;
    }
    //enqueue  O(1)
    public static void add(int data){
        if(rear == size-1){                    //cheak array is full
            System.out.println("queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    //dequeue          O(n)     not good array implementation of queue because stack take O(1)
    public static int remove() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];

        }
        rear--;
        return front;
    }
    public static int peek(){
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }

        return arr[0];

    }
    public static void main(String []args){
        QueueY q = new QueueY(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}




