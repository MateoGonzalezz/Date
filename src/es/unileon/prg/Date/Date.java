
package es.unileon.prg.Date;

public class Date {

	private int day;
	private int month;
	private int year;
	
	
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}


	public Date(int day,int month, int year) {
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
		
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
	
	
	public void setDay(int day) {
		if (day>1||day<this.getDayOfMonth()) {
			this.day=day;
		}
	}
	boolean isSameDay(Date otrodia) {
		boolean issameday= false;
		if (this.day==otrodia.day){
			issameday = true;
		}
		return issameday;
	}

	
	public void setMonth(int month) {
		if(month>0 && month<13) {
			this.month = month;
		}
		else {
			System.out.println("dato erroneo");
		}
	}
	boolean isSameMonth(Date otromes) {
		boolean issamemonth= false;
		if (this.month==otromes.month){
			issamemonth = true;
		}
		return issamemonth;
	}


	public void setYear(int year) {
		this.year= year;
	}
	boolean isSameYear(Date otroano) {
		boolean issameyear= false;
		if (this.year==otroano.year){
			issameyear = true;
		}
		return issameyear;
	}
	

	boolean void isSame( Date igual){
		if (this.day)
	}
	
	
	
}
