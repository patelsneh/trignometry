package trigonometry;

/**
 * Trigonometry library
 * @author Shravan Patel
 * @author Sneh Patel
 *
 */
public class Trigonometry {
	/**
	 * Value of PI
	 */
	  public static final double PI = 3.14159265358979323846; //PI Value

	    /**
	     * This method implement the trigonometry Sine function based on taylor series
	     * @param angle It must be radian
	     * @return return sin(angle)
	     */
	    public static double sin(double angle ) throws FactorialException{
	        double sin=0;
	        double normalizedAngle = normalizeRadian(angle);

	        for(int i=1;i<=11;i++)
	        {
	            sin = sin + (power(-1, i-1)*
	                    power(normalizedAngle, (2*i)-1)/fact((2*i)-1));
	        }

	        return roundOff(sin);
	    }

	    /**
	     * This method implement the trigonometry Cos function based on taylor series
	     * @param angle It must be radian
	     * @return return cos(angle)
	     */
	    public static double cos(double angle) throws FactorialException{
	    	double cos=0;
			double normAngle = normalizeRadian(angle);
					
			for(int i=0;i<=10;i++)
			{
				cos=cos+(power(-1,i)*power(normAngle,2*i))/(fact(2*i));
			}
			
			return roundOff(cos);
	    }

	    /**
	     * This method implement the trigonometry Tan function
	     * @param angle It must be radian
	     * @return return tan(angle)
	     */
	    public static double tan(double angle) throws FactorialException, TanException{
	      if(cos(angle)==0) {
	    	  throw new TanException("Not Defined");
	      }
	    	return roundOff(sin(angle) / cos(angle));
	    }

	    /**
	     *  This method implement Coversion of  Degree to Radian
	     * @param degree It must be degree
	     * @return return radian value of degree 
	     */
	    public static double degreeToRadian (double degree) {
	        return (degree * PI)/ 180 ;
	    }

	    /**
	     * This method implement Coversion of Radian to Degree
	     * @param radian It must be radian
	     * @return return degree value of radian 
	     */
	    public static double radianToDegree (double radian) {
	        return (radian * 180)/ PI ;
	    }
	    /**
	     * This method implements the normalization of angle value that allows functions to sound in all the quadrants
	     * @param angle It must be radian
	     * @return return normalized radian.
	     */
	    public static double normalizeRadian (double angle) {
	        return angle % (2*PI);
	    }

	    /**
	     * This function is used for finding Factorial of n
	     * @param number For finding the factorial of number
	     * @return it will return the calculated factorial of number
	     * @throws FactorialException throwing exception for negative numbers
	     */
	    public static double fact(int number) throws FactorialException
	    {
	        double value=1;

	        if(number < 0) {
	            throw new FactorialException("Factorial of negative number can't be found");
	        }
	        else {
	            for(int i=2; i<=number; i++)
	            {
	                value = value*i;
	            }
	        }

	        return value;
	    }

	    /**
	     * This function is for finding power of any value.
	     * @param base This is base.
	     * @param power This is power.
	     * @return Returns value in double
	     */
	    public static double power(double base, int power)
	    {
	        double value=1;

	        if(power == 0)
	            return 1;

	        for(int i=1; i<=power; i++)
	            value = value * base;

	        return value;

	    }
	    
	    /**
	     * It will round off number upto 5 decimals
	     * @param input value
	     * @return It returns round off value upto 5 decimals
	     */
	    public static double roundOff(double input)
	    {
	        double a = input;
	        double temp = power(10.0, 5);
	        a *= temp;
	        a = Math.round(a);
	        return (a / (double)temp);
	    }
}
