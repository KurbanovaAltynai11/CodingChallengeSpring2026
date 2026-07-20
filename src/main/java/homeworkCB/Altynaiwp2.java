package homeworkCB;

public class Altynaiwp2 {
    static void main() {
    }
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }
    public String frontTimes(String str, int n) {
        int frontLen = 3;
        if (str.length() < 3) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            String match = str.substring(i, i + 2);
            if (match.equals("xx")) {
                count++;
            }
        }
        return count;
    }
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) {
            return false;
        }
        if (i + 1 >= str.length()) {
            return false;
        }
        return str.substring(i + 1, i + 2).equals("x");

    }
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i); // Добавляем символ в результат
        }
        return result;
    }

    public String stringSplosion(String str) {
        String result = "";
        for (int i = 1; i <= str.length(); i++) {
            result += str.substring(0, i);
        }
        return result;
    }
    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        String end = str.substring(str.length() - 2);

        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) {
                count++;
            }
        }
        return count;
    }
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n == 9) {
                count++;
            }
        }
        return count;
    }
    public boolean arrayFront9(int[] nums) {
        int end = 4;
        if (nums.length < 4) {
            end = nums.length;
        }
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) {
                return true; //
            }
        }
        return false;
    }
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
                return true;
            }
        }
        return false;
    }
    public int stringMatch(String a, String b) {
        int minLen = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < minLen - 1; i++) {
            String subA = a.substring(i, i + 2);
            String subB = b.substring(i, i + 2);
            if (subA.equals(subB)) {
                count++;
            }
        }

        return count;
    }
    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current != 'x' || i == 0 || i == str.length() - 1) {
                result += current;
            }
        }

        return result;
    }
    public String altPairs(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i += 4) {
            if (i < str.length()) {
                result += str.charAt(i);
            }
            if (i + 1 < str.length()) {
                result += str.charAt(i + 1);
            }
        }

        return result;
    }
    public String stringYak(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length()
                    && str.charAt(i) == 'y'
                    && str.charAt(i + 2) == 'k') {
                i += 2;
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
    public int array667(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }

        return count;
    }
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            if (nums[i+1] == val + 5) {
                if (Math.abs(nums[i+2] - (val - 1)) <= 2) {
                    return true;
                }
            }
        }
        return false;
    }

}
