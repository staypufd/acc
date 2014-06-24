import java.util.ArrayList;

/**
 * 
 */

/**
 * @author samjr
 *
 */
public class BaseTypeArrayHelper {
	
    /**
     * Don't let anyone instantiate this class.
     */
    private BaseTypeArrayHelper() {}

	static public ArrayList<String> copyArrayToArrayList(String[] arr) {
		ArrayList<String> arrayListLikeA = new ArrayList<>();
		for (String string : arr) {
			String stringCopy = new String(string);
			arrayListLikeA.add(stringCopy);
		}
		
		return arrayListLikeA;
	}
	
}
