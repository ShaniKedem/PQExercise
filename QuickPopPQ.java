package PQExercise;

public class QuickPopPQ <T extends Comparable> {
    PqNode head = null;
    Object lock = new Object();


    private class PqNode <T extends Comparable>{
        T data = null;
        PqNode next = null;
        PqNode prev = null;

        public PqNode(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

    // O(1)
    public T pop(){
        T dataToReturn = null;
        synchronized (lock){
            if(head == null)
            {
                return null;
            }
            dataToReturn = (T) head.getData();
            head = head.next;
            if(head != null) {
                head.prev = null;
            }
        }

        return dataToReturn;
    }

    // O(n)
    public void push(T data) {
        synchronized (lock) {
            PqNode runner = head;
            PqNode prev = head;
            PqNode newNode = new PqNode(data);

            if (head == null) {
                head = newNode;
                return;
            }

            //Find the right place for the new node
            while ((runner != null) && (runner.getData().compareTo(data) > 0)) {
                prev = runner;
                runner = runner.next;
            }

            connectNewNode(runner, prev, newNode);
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

    private void connectNewNode(PqNode insertBefore, PqNode previous, PqNode newNode){
       //insert to the end of the list
        if (insertBefore == null) {
            previous.next = newNode;
            newNode.prev = previous;
        }
        //insert to the head of the list
        else if(insertBefore.prev == null)
        {
            newNode.next = insertBefore;
            insertBefore.prev = newNode;
            head = newNode;
        }
        //insert in the middle of the list
        else {
            insertBefore.prev.next = newNode;
            newNode.next = insertBefore;
            newNode.prev = insertBefore.prev;
            insertBefore.prev = newNode;
        }
    }


}
