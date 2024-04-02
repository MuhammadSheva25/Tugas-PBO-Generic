import java.util.ArrayList;
import java.util.ArrayDeque;

public class CollectionExample {
    public static void main(String[] args) {
        // Contoh penggunaan ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");

        System.out.println("Isi ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        // Contoh penggunaan ArrayDeque sebagai stack (tumpukan)
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("\nIsi ArrayDeque (sebagai stack):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Contoh penggunaan ArrayDeque sebagai queue (antrian)
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("\nIsi ArrayDeque (sebagai queue):");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
