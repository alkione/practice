public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonth(2, 2020));
    }

    public static boolean isLeapYear (int year)  {
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

    public static int getDaysInMonth (int month, int year) {
        int bigMonth = 31;
        int smallMonth = 30;
        int bigFeb = 29;
        int smallFeb = 28;

        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return -1;
        } else if (isLeapYear(year) == true) {
            switch (month) {
                case 2:
                    return bigFeb;
                        //break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return bigMonth;
                        //break;
                case 4: case 6: case 9: case 11:
                    return smallMonth;
                        //break;
            }

        } else {
            switch (month) {
                case 2:
                    return smallFeb;
                       // break;
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return bigMonth;
                //break;
                case 4: case 6: case 9: case 11:
                    return smallMonth;
                        //break;
            }

        } return -1;

    }

    }

