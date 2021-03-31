package trigonometry;

/**
 *  It will handle Tan() Exception
 * @author Shravan Patel
 * @author Sneh Patel
 *
 */
public class TanException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * It will throw custom message
	 * @param message
	 */
	public TanException(String message) {
        super(message);
    }
}
