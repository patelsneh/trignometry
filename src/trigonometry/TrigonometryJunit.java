package trigonometry;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Junit for Trigonometry library
 * @author Shravan Patel
 * @author Sneh Patel
 *
 */
class TrigonometryJunit {

	public double decimalPoints = 0.0001;
	public double pi = 3.14159265358979323846;

	/**
	 * It will test sin(x) value compare to Math.sin(x)
	 * 
	 * @throws FactorialException
	 */
	@Test
	public void testSin() throws FactorialException {

		/* test all the axis value */
		assertEquals(Trigonometry.sin(0), Math.sin(0), decimalPoints);
		assertEquals(Trigonometry.sin(pi / 2), Math.sin(pi / 2), decimalPoints);
		assertEquals(Trigonometry.sin(pi), Math.sin(pi), decimalPoints);
		assertEquals(Trigonometry.sin((3 * pi) / 2), Math.sin((3 * pi) / 2), decimalPoints);
		assertEquals(Trigonometry.sin(2 * pi), Math.sin(2 * pi), decimalPoints);

		/* test other value across all 4 quadrants */
		assertEquals(Trigonometry.sin(pi / 4), Math.sin(pi / 4), decimalPoints);
		assertEquals(Trigonometry.sin((3 * pi) / 4), Math.sin((3 * pi) / 4), decimalPoints);
		assertEquals(Trigonometry.sin((5 * pi) / 4), Math.sin((5 * pi) / 4), decimalPoints);
		assertEquals(Trigonometry.sin((7 * pi) / 4), Math.sin((7 * pi) / 4), decimalPoints);

	}

	/**
	 * This test will test normalization of sin
	 * 
	 * @throws FactorialException
	 */
	@Test
	public void testSinNormalization() throws FactorialException {

		assertEquals(Trigonometry.sin(12), Math.sin(12), decimalPoints);
		assertEquals(Trigonometry.sin(pi * 6), Math.sin(pi * 6), decimalPoints);
		assertEquals(Trigonometry.sin((5 * pi) / 2), Math.sin((5 * pi) / 2), decimalPoints);
		assertEquals(Trigonometry.sin(10 / pi), Math.sin(10 / pi), decimalPoints);

	}

	/**
	 * It will test sin(-x) value compare to Math.sin(-x)
	 * 
	 * @throws FactorialException
	 */
	@Test
	public void testSinNegative() throws FactorialException {

		assertEquals(Trigonometry.sin(-2 * pi), Math.sin(-2 * pi), decimalPoints);
		assertEquals(Trigonometry.sin((-3 * pi) / 4), Math.sin((-3 * pi) / 4), decimalPoints);

	}

	/**
	 * It will test cos(x) value compare to Math.cos(x)
	 * 
	 * @throws FactorialException
	 */
	@Test
	public void testCos() throws FactorialException {

		/* test all the axis value */
		assertEquals(Trigonometry.cos(0), Math.cos(0), decimalPoints);
		assertEquals(Math.round(Trigonometry.cos((pi) / 2)),Math.round(Math.cos((pi) / 2)), decimalPoints);
		assertEquals(Trigonometry.cos(pi), Math.cos(pi), decimalPoints);
		assertEquals(Trigonometry.cos((3 * pi) / 2), Math.cos((3 * pi) / 2), decimalPoints);
		assertEquals(Trigonometry.cos(2 * pi), Math.cos(2 * pi), decimalPoints);

		/* test other value across all 4 quadrants */
		assertEquals(Trigonometry.cos(pi / 4), Math.cos(pi / 4), decimalPoints);
		assertEquals(Trigonometry.cos((3 * pi) / 4), Math.cos((3 * pi) / 4), decimalPoints);
		assertEquals(Trigonometry.cos((5 * pi) / 4), Math.cos((5 * pi) / 4), decimalPoints);
		assertEquals(Trigonometry.cos((7 * pi) / 4), Math.cos((7 * pi) / 4), decimalPoints);

	}
	
	

	/**
	 * It will test normalization of cos
	 * 
	 * @throws FactorialException
	 */
	@Test
	public void testCosNormalization() throws FactorialException {

		assertEquals(Trigonometry.cos(12), Math.cos(12), decimalPoints);
		assertEquals(Trigonometry.cos(pi * 6), Math.cos(pi * 6), decimalPoints);
		assertEquals(Trigonometry.cos((5 * pi) / 2), Math.cos((5 * pi) / 2), decimalPoints);
		assertEquals(Trigonometry.cos(10 / pi), Math.cos(10 / pi), decimalPoints);

	}

	/**
	 * It will test cos(-x) value compare to Math.cos(-x)
	 * 
	 * @throws FactorialException
	 */
	@Test
	public void testCosNegative() throws FactorialException {

		assertEquals(Trigonometry.cos(-2 * pi), Math.cos(-2 * pi), decimalPoints);
		assertEquals(Trigonometry.cos((-3 * pi) / 4), Math.cos((-3 * pi) / 4), decimalPoints);

	}

	/**
	 * It will test tan(x) value compare to Math.tan(x)
	 * 
	 * @throws FactorialException
	 */
	@Test
	public void testTan() throws FactorialException, TanException {

		/* test all the axis value */
		assertEquals(Trigonometry.tan(0), Math.tan(0), decimalPoints);
		assertEquals(Trigonometry.tan(pi), Math.tan(pi), decimalPoints);
		assertEquals(Trigonometry.tan(2 * pi), Math.tan(2 * pi), decimalPoints);

		/* test other value across all 4 quadrants */
		assertEquals(Trigonometry.tan(pi / 4), Math.tan(pi / 4), decimalPoints);
		assertEquals(Trigonometry.tan((3 * pi) / 4), Math.tan((3 * pi) / 4), decimalPoints);
		assertEquals(Trigonometry.tan((5 * pi) / 4), Math.tan((5 * pi) / 4), decimalPoints);
		assertEquals(Trigonometry.tan((7 * pi) / 4), Math.tan((7 * pi) / 4), decimalPoints);

	}

	/**
	 * It will test not defined value of 
	 */
	@Test
	public void testTanException()  {
	 Throwable exception = assertThrows(
	            TanException.class, () -> {
	            	Trigonometry.tan((pi / 2));
	            }
	    );
	 assertEquals("Not Defined", exception.getMessage());
	}
	
	/**
	 * It will test normalization of tan
	 * 
	 * @throws FactorialException
	 */
	@Test
	public void testTanNormalization() throws FactorialException {

		assertEquals(Trigonometry.cos(12), Math.cos(12), decimalPoints);
		assertEquals(Trigonometry.tan(pi * 6), Math.tan(pi * 6), decimalPoints);
	}

	/**
	 * It will test tan(-x) value compare to Math.tan(-x)
	 * 
	 * @throws FactorialException
	 */
	@Test
	public void testTanNegative() throws FactorialException {

		assertEquals(Trigonometry.tan(-2 * pi), Math.tan(-2 * pi), decimalPoints);
		assertEquals(Trigonometry.tan((-3 * pi) / 4), Math.tan((-3 * pi) / 4), decimalPoints);

	}
	
	/**
	 * It will test degree to radian value coversion
	 */
	@Test
	 public void testDegreeToRadian() {
		
		assertEquals(Trigonometry.degreeToRadian(90), pi/2, 0.001);
		assertEquals(Trigonometry.degreeToRadian(60), pi/3, 0.001);
		assertEquals(Trigonometry.degreeToRadian(30), pi/6, 0.001);
		assertEquals(Trigonometry.degreeToRadian(-180), -pi, 0.001);
		assertEquals(Trigonometry.degreeToRadian(-60), -1*pi/3, 0.001);
	}

	/**
	 * It will test radian to degree value conversion
	 */
	@Test
	 public void testRadianToDegree() {
		
		assertEquals(Trigonometry.radianToDegree(pi/2), 90, 0.001);
		assertEquals(Trigonometry.radianToDegree(pi/3), 60, 0.001);
		assertEquals(Trigonometry.radianToDegree(pi/6), 30, 0.001);
		assertEquals(Trigonometry.radianToDegree(-1*pi), -180, 0.001);
		assertEquals(Trigonometry.radianToDegree(-1*pi/3), -60, 0.001);
	}

}
