
public class Date {

	private int day;
	private int month;
	private int year;
	
	
	public Date(int day,int month, int year) {
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
		
	}
	public void setDay(int day) {
		if (day>1||day<this.getDayOfMonth()) {
			this.day=day;
		}
	}
	
	public int getDayOfMonth() {
		
		int numdias = 0;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numdias = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numdias = 30;
			break;
		case 2:
			numdias = 28;
			break;	
		}
		return numdias;
	}
	
	
	public void setMonth(int month) {
		if(month>0 && month<13) {
			this.month = month;
		}
		else {
			System.out.println("dato erroneo");
		}
	}
	public void setYear(int year) {
		this.year= year;
	}
	
	public boolean isSameYear() {
		if( ) {
			
		}
	}
	
}
