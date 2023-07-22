//Write a function that reverses a string. The input string is given as an array of characters s.
//
//You must do this by modifying the input array in-place with O(1) extra memory.
//
//        Example 1:
//
//        Input: s = ["h","e","l","l","o"]
//        Output: ["o","l","l","e","h"]
//        Example 2:
//
//        Input: s = ["H","a","n","n","a","h"]
//        Output: ["h","a","n","n","a","H"]
public class ReverseString {

    public void reverseString(char[] s) {

        char[] news = new char[s.length];
        for(int i = 0;  i< (s.length); i++){
            news[s.length-i-1] = s[i];
        }
        for(int i = 0;  i< (s.length); i++){
            s[i] = news[i];
        }
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] ch = {'a','v','g','r'};
        reverseString.reverseString(ch);
System.out.println(ch);
    }
}
