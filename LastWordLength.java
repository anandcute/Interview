public class LastWordLength {
    public int lastWordOfLength(String s) {
        int length = 0;
        boolean counting = false;
        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                if (!counting) {
                    counting = true;
                    length = 1;
                } else {
                    length++;
                }
            } else {
                counting = false;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String s = " Anandkumar is a Software Developer  ";
        LastWordLength l = new LastWordLength();
        System.out.println(l.lastWordOfLength(s));

    }
}
