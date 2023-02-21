package strings;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Each instance of this class represents a sequence of characters.
 * 
 * @immutable
 */
public class String {
	
	/**
	 * @post | result != null
	 * @inspects | this
	 * @creates | result
	 */
	public char[] toCharArray() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @inspects | this
	 * @post | result == toCharArray().length
	 */
	public int length() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | 0 <= index && index < length()
	 * @inspects | this
	 * @post | result == toCharArray()[index]
	 */
	public char charAt(int index) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | characters != null
	 * @inspects | characters
	 * @post | Arrays.equals(toCharArray(), characters)
	 */
	public String(char[] characters) { throw new RuntimeException("Not yet implemented"); }

}
