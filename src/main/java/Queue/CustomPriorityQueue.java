package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class CustomPriorityQueue<T> {
    private Queue<T> elements = new java.util.PriorityQueue<T>();

    public CustomPriorityQueue{

    }

    public CustomPriorityQueue(Comparator comparator) {
        elements = new PriorityQueue<T>(comparator);
    }

    public void push(T element) {
        elements.add(element);
    }

    public T poll() {
        return elements.poll();
    }

    public T peek() {
        return elements.peek();
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public void clear() {
        while (!elements.isEmpty()) {
            T element = elements.poll();
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        CustomPriorityQueue<Integer> queue1 = new CustomPriorityQueue<Integer>(getNumberComparator1());

        for(int i = 0; i < 10; i++) {
            queue1.push(rand.nextInt(10));
        }
        queue1.clear();

        CustomPriorityQueue<String> queue2 = new CustomPriorityQueue<String>();
        queue2.push("Zaluzje to najepsze co spotkalo ludzkosc");
        queue2.push("Argentyna to deszczowy kraj");
        queue2.push("Polaki to pijaki");
        queue2.clear();

    }

    private static Comparator<Integer> getNumberComparator1() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if(o1 % 2 == o2 % 2) {
                    return o1 < o2 ? -1 : 1;
                }
                if(o2 % 2 == 0) {
                    return 1;
                }
                if(o1 % 2 == 0 ) {
                    return -1;
                }
                return 0;
            }
        };
    }

}
