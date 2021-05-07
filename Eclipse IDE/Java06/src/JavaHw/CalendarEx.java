package JavaHw;
import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(Calendar cal) {
		int year = cal.get(Calendar.YEAR);  //년도

        int month = cal.get(Calendar.MONTH) + 1;  //달(월)
        int day = cal.get(Calendar.DAY_OF_MONTH);    //일
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);  //시(24시간)
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(hourOfDay + "시 " + minute + "분 " + second + "초");
	}
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printCalendar(cal);
	}
}
