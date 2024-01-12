package capsulation;

public class TimeTest {

	public static void main(String[] args) {
		
		Time t = new Time();
		t.setHour(44); //16시 
		t.setMinute(32); //32분 
		t.setSecond(18); //18초 

	}

}

class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		
		if(isNotValidHour(hour)) {
			System.out.println("hour 범위 부적절 ");
			return; //return은 그 자리에서 메서드 종료!!
		} else {			
			this.hour = hour;
			System.out.print(hour + "시");

		}
		
	}

	private boolean isNotValidHour(int hour) {
		return !(hour >= 0 && hour <= 23);
	}
	
	
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if(isNotValidMinute(minute)) {
			System.out.println("minute 범위 부적절 ");
			return; //return은 그 자리에서 메서드 종료!!
		} else {			
			this.minute = minute;
			System.out.print(" " + minute + "분");

		}
	}


	private boolean isNotValidMinute(int minute) {
		return !(minute >= 0 && minute <= 59);
	}
	
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(isNotValidSecond(second)) {
			System.out.println("second 범위 부적절 ");
			return; //return은 그 자리에서 메서드 종료!!
		} else {			
			this.second = second;
			System.out.println(" " + second + "초");

		}
	}

	private boolean isNotValidSecond(int second) {
		return !(second >= 0 && second <= 59);
	}
	
	
	
}
