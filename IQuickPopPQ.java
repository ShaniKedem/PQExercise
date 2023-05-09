package PQExercise;

public interface IQuickPopPQ <T extends Comparable> {
    public T pop();
    public void push(T data);
}
