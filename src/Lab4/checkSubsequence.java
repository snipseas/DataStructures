package Lab4;

import java.util.Stack;

public class checkSubsequence {
    static boolean checkForSubsequence(String S, String target) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<target.length(); i++){
            s.push(target.charAt(i));

        }
        for(int i = (int) S.length()-1; i>=0;i--){
            if(s.empty()){
                return true;
            }
            if(S.charAt(i) == s.peek()){
                s.pop();
            }
        }

        return s.empty();

    }


}
