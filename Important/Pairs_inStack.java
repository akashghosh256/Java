import java.util.*;
//how to store pairs in stack in java--------------------------------------------------
// class Pair<K, V> {
//     private final K key;
//     private final V value;

//     public Pair(K key, V value) {
//         this.key = key;
//         this.value = value;
//     }

//     public K getKey() {
//         return key;
//     }

//     public V getValue() {
//         return value;
//     }
// }

// public class Pairs_inStack {
//     public static void main(String[] args) {
//         Stack<Pair<Integer, String>> stack = new Stack<>();

//         // Push pairs onto the stack
//         stack.push(new Pair<>(1, "One"));
//         stack.push(new Pair<>(2, "Two"));
//         stack.push(new Pair<>(3, "Three"));

//         // Pop and print pairs from the stack
//         while (!stack.isEmpty()) {
//             Pair<Integer, String> pair = stack.pop();
//             System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
//         }
//     }
// }


// easy way -------------------------------------------------------------------------------------------
class Pair{
   int key;
   int value;

    public Pair(int _key, int _value) {
        key = _key;
        value = _value;
    }
}

class Tuple {
    //TreeNode node;
    String name;
    int row;
    int col;
    public Tuple(String _name, int _row, int _col) {
        name = _name;
        row = _row;
        col = _col;
    }
}


public class Pairs_inStack {
    public static void main(String[] args) {
        Stack<Pair> st = new Stack<>();

        st.push(new Pair(80,2));
        st.push(new Pair(60,4));
        System.out.println(st.pop().key);
        System.out.println(st.pop().value);

        Queue<Tuple> q = new ArrayDeque<>();
        q.add(new Tuple("Ag",20,2));
        q.add(new Tuple("TOPG",24,2));
        System.out.println(q.poll().row);
         System.out.println(q.poll().name);









    }
}