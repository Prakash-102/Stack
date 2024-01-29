
//Find out the ArrayList form in stack ?:-oyo,amozone
import java.util.*;

public class StackB {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static void pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return;
        }

        // peek
        public static int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}

/*
 * Output:-
 * 3 2 1
 */
