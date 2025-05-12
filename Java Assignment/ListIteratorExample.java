import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Initialize ArrayList and LinkedList
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Add 10 elements to each list
        for (int i = 1; i <= 10; i++) {
            String element = "Element " + i;
            arrayList.add(element);
            linkedList.add(element);
        }

        // Display elements of ArrayList using ListIterator
        System.out.println("ArrayList elements:");
        ListIterator<String> arrayListIterator = arrayList.listIterator();
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        // Display elements of LinkedList using ListIterator
        System.out.println("\nLinkedList elements:");
        ListIterator<String> linkedListIterator = linkedList.listIterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }
    }
}
