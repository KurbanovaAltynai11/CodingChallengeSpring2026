package homeworkCB;

public class Altynaiwp1 {
    static void main() {

    }
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;


    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        return aSmile == bSmile;
    }
    public int sumDouble(int a, int b) {
        if (a == b){
            return (a + b) * 2;
        }
        return a + b;

    }
    public int diff21(int n) {
        if (n > 21){
            return (n - 21) * 2;
        }
        return 21 - n;

    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour == 7 || hour == 20)) {
            return true;

        }
        return false;
    }
    public boolean makes10(int a, int b) {

        return a == 10 || b == 10 || a + b == 10;
    }
    public boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        }
        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }
    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }
    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1);
        return front + back;
    }
    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }
    public String front3(String str) {
        String front;
        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }
        return front + front + front;
    }
    public String backAround(String str) {
        char last = str.charAt(str.length() - 1);
        return last + str + last;
    }
    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }
    public String front22(String str) {
        int take = 2;
        if (str.length() < 2) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }
    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }
    public boolean loneTeen(int a, int b) {
        boolean aIsTeen = (a >= 13 && a <= 19);
        boolean bIsTeen = (b >= 13 && b <= 19);
        return (aIsTeen && !bIsTeen) || (!aIsTeen && bIsTeen);
    }
    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }
    public boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        String ix = str.substring(1, 3);
        return ix.equals("ix");
    }
    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += "o";
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += "z";
        }
        return result;
    }
    public int intMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public int close10(int a, int b) {
        int distA = Math.abs(a - 10);
        int distB = Math.abs(b - 10);
        if (distA == distB) {
            return 0;
        }
        if (distA < distB) {
            return a;
        } else {
            return b;
        }
    }
    public boolean in3050(int a, int b) {
        boolean scenario1 = (a >= 30 && a <= 40) && (b >= 30 && b <= 40);
        boolean scenario2 = (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
        return scenario1 || scenario2;
    }
    public int max1020(int a, int b) {
        if (a < 10 || a > 20) {
            a = 0;
        }
        if (b < 10 || b > 20) {
            b = 0;
        }
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }
    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }
    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);
        return front + back.toUpperCase();
    }
    public String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i += n) {
            result += str.charAt(i);
        }
        return result;
    }


}

