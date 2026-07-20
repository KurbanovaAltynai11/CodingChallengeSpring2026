package homeworkCB;

public class Altynaiay1 {
    static void main() {
    }


    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;

    }
    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];

    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        return nums;
    }

    public int sum2(int[] nums) {
        int sum = 0;
        for (int i = 0; i < Math.min(nums.length, 2); i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};

    }

    public boolean has23(int[] nums) {
        for (int n : nums) {
            if (n == 2 || n == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean no23(int[] nums) {
        return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
    }

    public int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

    public boolean double23(int[] nums) {
        if (nums.length != 2) {
            return false;
        }
        return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        return (b[0] + b[1]) > (a[0] + a[1]) ? b : a;
    }
    public int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid]};
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
    }

    public int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        return Math.max(first, Math.max(middle, last));
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        return new int[]{nums[0], nums[1]};
    }

    public boolean unlucky1(int[] nums) {
        int len = nums.length;
        if (len >= 2 && nums[0] == 1 && nums[1] == 3) return true;
        if (len >= 3 && nums[1] == 1 && nums[2] == 3) return true;
        if (len >= 2 && nums[len - 2] == 1 && nums[len - 1] == 3) return true;
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int count = 0;
        for (int i = 0; i < a.length && count < 2; i++) {
            result[count] = a[i];
            count++;
        }
        for (int i = 0; i < b.length && count < 2; i++) {
            result[count] = b[i];
            count++;
        }
        return result;
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};
        }
        if (a.length > 0) {
            return new int[]{a[0]};
        }
        if (b.length > 0) {
            return new int[]{b[0]};
        }
        return new int[0];
    }

    public int[] plusTwo(int[] a, int[] b) {
        return new int[] {a[0], a[1], b[0], b[1]};
    }



}

