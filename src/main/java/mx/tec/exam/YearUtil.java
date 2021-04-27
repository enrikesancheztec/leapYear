package mx.tec.exam;

public class YearUtil {
	public boolean isLeap(int year) {
		boolean leapYear = false;
		
		if (year % 400 == 0) {
			leapYear = true;
		} else if (year % 100 == 0) {
			leapYear = false;
		} else if (year % 4 == 0 && year % 100 != 0) {
			leapYear = true;
		}
		
		return leapYear;
	}
}
