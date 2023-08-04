public class removeduplicate {
    public static void duplicate(String str, int idx, StringBuilder newstr, boolean[] map) {
        // Base Case
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        // Working
        char currchar = str.charAt(idx);
        if (map[currchar - 'a']) {
            // Duplicate
            duplicate(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            duplicate(str, idx + 1, newstr.append(currchar), map);
        }
    }

    public static void main(String args[]) {
        String str = "anubhab";
        duplicate(str, 0, new StringBuilder(), new boolean[26]);
    }
}
