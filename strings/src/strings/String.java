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
	 * @invar | characters != null
	 */
	private char[] characters;
	
	/**
	 * @post | result != null
	 * @inspects | this
	 * @creates | result
	 */
	public char[] toCharArray() {
		return characters.clone();
	}
	
	/**
	 * @inspects | this
	 * @post | result == toCharArray().length
	 */
	public int length() { return characters.length; }
	
	/**
	 * @pre | 0 <= index && index < length()
	 * @inspects | this
	 * @post | result == toCharArray()[index]
	 */
	public char charAt(int index) { return characters[index]; }
	
	/**
	 * @pre | characters != null
	 * @inspects | characters
	 * @post | Arrays.equals(toCharArray(), characters)
	 */
	public String(char[] characters) {
		this.characters = characters.clone();
	}

}
