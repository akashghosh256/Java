import java.util.*;
//how to store pairs in stack in java--------------------------------------------------
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
public class Pairs_inStack {
    public static void main(String[] args) {
        Stack<Pair<Integer, String>> stack = new Stack<>();

        // Push pairs onto the stack
        stack.push(new Pair<>(1, "One"));
        stack.push(new Pair<>(2, "Two"));
        stack.push(new Pair<>(3, "Three"));

        // Pop and print pairs from the stack
        while (!stack.isEmpty()) {
            Pair<Integer, String> pair = stack.pop();
            System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
        }
    }
}

