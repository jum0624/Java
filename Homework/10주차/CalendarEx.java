package JavaHw;
import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(Calendar cal) {
		int year = cal.get(Calendar.YEAR);  //�⵵

        int month = cal.get(Calendar.MONTH) + 1;  //��(��)
        int day = cal.get(Calendar.DAY_OF_MONTH);    //��
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);  //��(24�ð�)
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println(year + "�� " + month + "�� " + day + "��");
        System.out.println(hourOfDay + "�� " + minute + "�� " + second + "��");
	}
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printCalendar(cal);
	}
}
