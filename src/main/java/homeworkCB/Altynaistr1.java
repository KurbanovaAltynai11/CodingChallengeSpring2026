package homeworkCB;

public class Altynaistr1 {
    static void main() {

    }
    public String atFirst(String str) {
        if (str.length() == 0) {
            return "@@";
        }
        if (str.length() == 1) {
            return str + "@";
        }
        return str.substring(0, 2);
    }
    public String lastChars(String a, String b) {
        String first = "@";
        String last = "@";
        if (a.length() > 0) {
            first = a.substring(0, 1);
        }
        if (b.length() > 0) {
            last = b.substring(b.length() - 1);
        }
        return first + last;
    }
    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String front = str.substring(0, str.length() - 2);
        char last = str.charAt(str.length() - 1);
        char prev = str.charAt(str.length() - 2);
        return front + last + prev;
    }
    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }
    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        String front = str.substring(0, 2);
        String back = str.substring(str.length() - 2);
        return front.equals(back);
    }
    public String minCat(String a, String b) {
        int minLen = Math.min(a.length(), b.length());
        String cutA = a.substring(a.length() - minLen);
        String cutB = b.substring(b.length() - minLen);
        return cutA + cutB;
    }
    public String extraFront(String str) {
        String front;
        if (str.length() < 2) {
            front = str;
        } else {
            front = str.substring(0, 2);
        }
        return front + front + front;
    }
    public String without2(String str) {
        if (str.length() == 2) {
            return "";
        }
        if (str.length() < 2) {
            return str;
        }
        String front = str.substring(0, 2);
        String back = str.substring(str.length() - 2);
        if (front.equals(back)) {
            return str.substring(2);
        }
        return str;
    }
    public String deFront(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'a') {
            result += "a";
        }
        if (str.length() >= 2 && str.charAt(1) == 'b') {
            result += "b";
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;

    }
    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }
        String strMatchPart = str.substring(1, word.length());
        String wordMatchPart = word.substring(1);
        if (strMatchPart.equals(wordMatchPart)) {
            return str.substring(0, word.length());
        }
        return "";
    }
    public String withoutX(String str) {
        if (str.length() >= 1 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() >= 1 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }
    public String withoutX2(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) != 'x') {
            result += str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) != 'x') {
            result += str.charAt(1);
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;
    }
}
