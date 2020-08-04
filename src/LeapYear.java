public class LeapYear {
    public static void main(String[] args) {

        System.out.println(isLeapYear(1800));
    }

    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) {
            return false;

        } else {
            int division4 = year % 4;
            int division100 = year % 100;
            int division400 = year % 400;

            if(division4 != 0) {
                return false;
            } else if (division4 == 0 && division100 != 0) {
                return true;
            } else if(division4 == 0 && division100 == 0 && division400 ==0) {
                return true;
            }
        }

        return false;
        }

    }

