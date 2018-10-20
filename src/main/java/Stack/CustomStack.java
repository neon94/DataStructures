package Stack;

import java.util.LinkedList;

public class CustomStack<T> {

    private LinkedList<T> elements = new LinkedList<T>();

    public void push(T element) {
        elements.addFirst(element);
    }

    public T pop() {
        return elements.removeFirst();
    }

    public T pick() {
        return elements.getFirst();
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void clear() {
        while(!elements.isEmpty()) {
            T element = elements.pop();
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<Integer>();
        CustomStack<String> stackString = new CustomStack<String>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.clear();
        stackString.push("Lubie jajuwe");
        stackString.push("Lubie ryz");
        stackString.push("Lubie mizerie");
        stackString.clear();




    }


}
