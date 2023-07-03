import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Calendar c=new GregorianCalendar(2023,07,03);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month=c.get(Calendar.MONTH);
        int year=c.get(Calendar.YEAR);
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
    }
}

/* output
  3
  7
  2023
*/
