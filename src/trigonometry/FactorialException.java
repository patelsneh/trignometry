package trigonometry;

/**
 *  It will handle Factorial Exception
 * @author Shravan Patel
 * @author Sneh Patel
 *
 */
public class FactorialException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	/**
	 * It will throw custom message
	 * @param message
	 */
	public FactorialException(String message) {
	        super(message);
	    }
}
