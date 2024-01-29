
//Next greater Element code ?:-
import java.util.*;

public class Nextgreater {

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGreger[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2 if-else
            if (s.isEmpty()) {
                nextGreger[i] = -1;
            } else {
                nextGreger[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < nextGreger.length; i++) {
            System.out.print(nextGreger[i] + " ");
        }
        System.out.println();
    }
}

/*
 * Output:-
 * 8 -1 1 3 -1
 */
