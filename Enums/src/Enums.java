import java.util.Calendar;
import java.util.Random;

/**
 * See more about Enums here:
 * http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 */

/**
 * @author samjr
 *
 */
public class Enums {
	 
	public enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY 
	}
	
	public enum Month {
		JAN(1, 31), FEB(2, 28), MAR(3, 31), APR(4, 30), MAY(5, 31), JUN(6, 30), JUL(7, 31), AUG(8, 31), SEP(9, 30), OCT(10, 31), NOV(11, 30), DEC(12, 31);
		
        final private int monthNumber;
        private int days;

        private Month(int monthNumber, int days) {
                this.monthNumber = monthNumber;
                this.days = days;
        }

		/**
		 * @return the value
		 */
		public int getMonthNumber() {
			return monthNumber;
		}

		/**
		 * @return the days
		 */
		public int getDays() {
			
			// Check for leap year
			if (this.getMonthNumber() == 2) {
				float yearsDivided = ((Calendar.YEAR - 1900) / 400) % 100;
				if (yearsDivided == 0) {
					return days = 29;
				}
			}
			return days;
		}
        
    }



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Day.MONDAY has value: " + Day.MONDAY);
		System.out.println("Day.MONDAY has ordinal value: " + Day.MONDAY.ordinal());
		System.out.println("Month.FEB has value: " + Month.FEB);
		System.out.println("Month FEB has ordianl value: " + Month.FEB.ordinal());
		System.out.println("Month FEB has month number: " + Month.FEB.getMonthNumber());
		System.out.println("Month FEB has days: " + Month.FEB.getDays());
		
		
		// Doing things based on the enum value
		
		// Print the enum values and their ordinal values
		for (Day day : Day.values()) {
			System.out.print(day + " - " + day.ordinal() + "\n");
		}
		
		// Get a random favorite day and then switch on it.
		int whichRandomDay = new Random().nextInt(Day.values().length);
		Day myFavoriteDay = Day.values()[whichRandomDay];
		System.out.println("My Favorite Day is: " + myFavoriteDay);
		
		switch (myFavoriteDay) {
		case MONDAY:
			System.out.println("Mondays are such a new beginning");
			break;
			
		case THURSDAY:
			System.out.println("Thursdays bring hope of a weekend just a day away!");
			break;
		
		case FRIDAY:
		case SATURDAY:
		case SUNDAY:
			System.out.println("Glorious Weekend");
			break;
			
		default:
			System.out.println("This day is nothing special");
			break;
		}
		
	}

}
