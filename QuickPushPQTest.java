package PQExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuickPushPQTest {
    QuickPushPQ<Integer> pq = new QuickPushPQ<>();
    Integer num3 = 3;
    Integer num6 = 6;
    Integer num7 = 7;
    Integer num2 = 2;
    Integer num4= 4;
    Integer num1 = 1;

    @Test
    void pop() {
    }

    @Test
    void push() {
        pq.push(num3);
        pq.push(num6);
        pq.push(num7);
        pq.push(num2);
        pq.push(num4);
        pq.push(num1);

        /* 7 6 4 3 2 1 */
        /*******/

        assertEquals(7, pq.pop());
        assertEquals(6, pq.pop());
        assertEquals(4, pq.pop());
        assertEquals(3, pq.pop());
        assertEquals(2, pq.pop());
        assertEquals(1, pq.pop());

        /* in: 1 4 7 3 6 2 */
        /* out: 7 6 4 3 2 1 */


        pq.push(num1);
        pq.push(num4);
        pq.push(num7);
        pq.push(num3);
        pq.push(num6);
        pq.push(num2);


        assertEquals(7, pq.pop());
        assertEquals(6, pq.pop());
        assertEquals(4, pq.pop());
        assertEquals(3, pq.pop());
        assertEquals(2, pq.pop());
        assertEquals(1, pq.pop());
    }

    @Test
    void testPop() {
    }

    @Test
    void testPush() {
    }
}