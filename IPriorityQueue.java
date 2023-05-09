package PQExercise;

public interface IPriorityQueue <T extends Comparable> {
    public T pop();
    public void push(T data);
}
