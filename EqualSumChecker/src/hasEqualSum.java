public class hasEqualSum {

    public static void main(String[] args) {

        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);
    }

    public static boolean hasEqualSum(int sum1, int sum2, int sum3) {

        boolean answer = false;

        if (sum3 == sum1 + sum2) {
            answer = true;
            System.out.println(sum1 + " + " + sum2 + " equals " + sum3 + " which is correct");
        }
        else {

            answer = false;
            System.out.println(sum1 + " + " + sum2 + " not equal to " + sum3 + " which is not correct");
        }
        return answer;
    }
}
