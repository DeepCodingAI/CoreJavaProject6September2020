package enumexample;

public class Week {

	public Day day;
	
	public Week() {}
	
	public Week(Day day) {
		this.day = day;
	}
	
	public void whatIsMyTask() {
		switch(day) {
		
		case Monday:
		     System.out.println("Monday is our first Class of the week");
		     break;
		case Tuesday:
			System.out.println("Tuesday, We start doing home work");
		     break;
		case Wednesday:     
		     System.out.println("Wednesday, we continue with home work and focus on Codelab");
		     break;
		case Thursday:     
		     System.out.println("Thursday, is our second class of the week");
		     break;   
		case Friday:     
		     System.out.println("Friday, we start doing the home work");
		     break;    
		case Saturday:     
		     System.out.println("Saturday, we continue with codelab");
		     break; 
		case Sunday:     
		     System.out.println("Sunday, we continue reading Java Book");
		     break;
		default:
			System.out.println("Not a valid day, try with valid day");
		}
	}
}
