public class LeapYear {

    public static void main(String[] args) {

        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        isLeapYear(-1200);
    }

    public static boolean isLeapYear(int year) {

        boolean answer;

        if (year < 1 || year > 9999) {
            answer = false;
            System.out.println(year + " is an invalid Output");
        }
        else if (year >= 1 && year <= 9999 && year % 4 ==0 && year % 100 !=0 || year % 400 == 0) {
            answer = true;
            System.out.println(year + " is a Leap Year");
        }
        else {
            answer = false;
            System.out.println(year + " is not a Leap Year");
            }
        return answer;
    }


}
