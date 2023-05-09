package PQExercise;

public interface IQuickPushPQ <T extends Comparable> {
    public T pop();
    public void push(T data);
}
