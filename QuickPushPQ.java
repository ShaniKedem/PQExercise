package PQExercise;

public class QuickPushPQ  <T extends Comparable> implements IPriorityQueue{
    PqNode head = null;
    Object lock = new Object();


    private class PqNode <T extends Comparable>{
        T data;
        PqNode next = null;
        PqNode prev = null;

        public PqNode(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

    // O(n)
    @Override
    public T pop(){
        synchronized (lock) {
            PqNode max = null;
            if (head == null) {
                return null;
            }

            max = findMaxNode(head);
            deleteNodeFromPQ(max);

            return (T) max.getData();
        }
    }

    // O(1)
    @Override
    public void push(Comparable data) {
        synchronized (lock) {
            PqNode newNode = new PqNode(data);
            if (head == null) {
                head = newNode;
                return;
            }
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList(){
        PqNode runner = head;
        while (runner != null)
        {
            System.out.print(runner.getData() + ", ");
            runner = runner.next;
        }
        System.out.println("");
    }

    private PqNode findMaxNode(PqNode head){
        PqNode runner = head;
        PqNode max = null;
        max = runner;
        while (runner != null) {
            if (runner.getData().compareTo(max.getData()) > 0) {
                max = runner;
            }
            runner = runner.next;
        }
        return max;
    }

    private void deleteNodeFromPQ(PqNode max){
        if (max.next != null) {
            max.next.prev = max.prev;
        }
        if (max.prev != null) {
            max.prev.next = max.next;
        } else {
            head = max.next;
        }
    }





}
