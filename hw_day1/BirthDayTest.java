package calender;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay date1 = new BirthDay(2015, 2, 29);
		BirthDay date2 = new BirthDay(2100, 2, 29);
		BirthDay date3 = new BirthDay(2000, 2, 29);
			
		date1.checkValidity();
		date2.checkValidity();
		date3.checkValidity();
	}

}
