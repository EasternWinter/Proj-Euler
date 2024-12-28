public class Euler19 {
    public static boolean leapYear (int year)
    {
        if (year % 4 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int sun1900 = 52;

    public static int sundayCounter ()
    {
        int count = 0;
        int i = 1901;

        int Jan = 31;
        int Feb;
        if (leapYear(i))
            Feb = 29;
        else
            Feb = 28;
        
        int Mar = 31;
        int Apr = 30;
        int May = 31;
        int Jun = 30;
        int Jul = 31;
        int Aug = 31;
        int Sep = 30;
        int Oct = 31;
        int Nov = 30;
        int Dec = 31;
        
        int days = Jan + 29 + Mar + Apr + May + Jun + Jul + Aug + Sep + Oct + Nov + Dec;
        
        while (i < 2001)
        {
            days += Jan;
            if (days % 7 == 0)
            {
                count++;
            }
            days += Feb;
            if (days % 7 == 0)
            {
                count++;
            }
            days += Mar;
            if (days % 7 == 0)
            {
                count++;
            }
            days += Apr;
            if (days % 7 == 0)
            {
                count++;
            }
            days += May;
            if (days % 7 == 0)
            {
                count++;
            }
            days += Jun;
            if (days % 7 == 0)
            {
                count++;
            }
            days += Jul;
            if (days % 7 == 0)
            {
                count++;
            }
            days += Aug;
            if (days % 7 == 0)
            {
                count++;
            }
            days += Sep;
            if (days % 7 == 0)
            {
                count++;
            }
            days += Oct;
            if (days % 7 == 0)
            {
                count++;
            }
            days += Nov;
            if (days % 7 == 0)
            {
                count++;
            }
            days += Dec;
            if (days % 7 == 0)
            {
                count++;
            }
            i++;
        }
        return (count);
    }
}