class VowelReverse {

    public boolean isVowel(char c) {
        return c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }

    public void swapper(char[] ch, int x, int y) {
        char temp = ch[x];
        ch[x] = ch[y];
        ch[y] = temp;
    }

    public String reverseVowels(String s) {

        int start = 0;
        int end = s.length() - 1;

        char[] ch = s.toCharArray();
        while (start < end) {
            while (start < s.length() && isVowel(ch[start])) {
                start++;
            }
            while (end >= 0 && isVowel(ch[end])) {
                end--;
            }
            if (start < end) {
                swapper(ch, start++, end--);

            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        VowelReverse vowelReverse = new VowelReverse();
        String str = "leetCode";
        String newstr = vowelReverse.reverseVowels(str);
        System.out.println(newstr);
    }

}