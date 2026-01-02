package Lab5;

import Lab4.StackObj;

public class FuckassPalindrome {

    public static boolean isPalindrome(String str) {
        StackObj firstHalf = new StackObj(str.length() / 2);
        QueueObj secondHalf = new QueueObj(str.length() / 2);
        // private Comparable[] queArray;

        int i;

        for (i = 0; i < str.length() / 2; i++) {
            firstHalf.push(new Character(str.charAt(i)));
        }

        for (i = i + str.length() % 2; i < str.length(); i++) {
            secondHalf.enqueue(new Character(str.charAt(i)));
        }

        while (!firstHalf.isEmpty()) {
            char c1 = ((Character) firstHalf.pop()).charValue();
            char c2 = ((Character) secondHalf.dequeue()).charValue();
            if (c1 != c2) {
                return false;
            }

        }
        return true;
    }

}
