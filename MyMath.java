/**
 * MyMath reimplements a portion of functionality
 * of the Java Math class {@link java.lang.Math}<p>
 * Functions include
 * @see java.lang.Math
 */
public class MyMath {
    /**Pi representation for MyMath class */
    static final double PI_CONSTANT = 3.141592653589793d;

    /**
     * toDegrees() takes a double value representing an angle
     * expressed in radians and returns that same angle's representation
     * in degrees.<p>Calculated using ratio 360 degrees = 2 * pi radians,
     * where pi has value {@value #PI_CONSTANT}.
     * @param angleRadians Double value representing angle in radians
     * @return Double primitive value of angle expressed in degrees
     */
    public static double toDegrees(double angleRadians) {
        double angleDegrees = (180 / PI_CONSTANT) * angleRadians;
        return angleDegrees;
    }//end toDegrees()

    /**
     * toRadians() accepts a double representing the measured degrees
     * of an angle. Value is converted into radians using the ratio:<p>
     * 360 degrees = 2 * pi radians<p>Where pi is represented as {@value #PI_CONSTANT}
     * @param angleDegree Primitive double that represents the degrees of an angle
     * @return Primitive double that represents the radians of converted degrees.
     */
    public static double toRadians(double angleDegree) {
        double angleRadians = (PI_CONSTANT / 180) * angleDegree;
        return angleRadians;
    }//end toRadians()

    /**
     * absoluteValue() accepts as input a double that represents
     * any arbitrary value. The absolute value is returned as a double.
     * @param inputValue Double primitive representing any arbitrary value
     * @return Double primitive representing the absolute value of the input.
     */
    public static double absoluteValue(double inputValue) {
        if (inputValue < 0) {
            return inputValue * -1;
        }//end if value negative
        else {
            return inputValue;
        }//end else absolute = input
    }//end absoluteValue()

    /**
     * minium() accepts as parameters two arbitrary double values and then
     * returns the smaller value of the two as a double. If the values are the
     * same, the first parameter is returned.
     * @param inputValue1 Primative double representing any arbitrary value
     * @param inputValue2 Primative double representing any arbitrary value
     * @return Primative double that is the minium of the passed parameters.
     */
    public static double minimum(double inputValue1, double inputValue2) {
        if (inputValue1 <= inputValue2) {
            return inputValue1;
        }//end if inputValue1 Smallest
        else {
            return inputValue2;
        }//end else inputValue2 smallest
    }//end minimum()

    /**
     * maximum() accepts any two arbitrary double values and returns the
     * larger value of the two, as a double. If the values are the same,
     * the first parameter is returned.
     * @param inputValue1 Primative double representing any arbitrary value
     * @param inputValue2 Any arbitrary double value.
     * @return Maximum value of two passed parameters, as a double.
     */
    public static double maximum(double inputValue1, double inputValue2) {
        if (inputValue1 >= inputValue2) {
            return inputValue1;
        }//end if inputValue 1 max
        else {
            return inputValue2;
        }//end else inputValue2 max
    }//end maximum()

    /**
     * power() accepts two double parameters, a baseInput and
     * an exponenetInput to calculate the exponential value of 
     * the base raised to the exponent. Expects baseInput to be
     * greater than or equal to zero.
     * @param baseInput Primative double representing the base of an
     * exponential calculation
     * @param exponentInput Primative double representing the 
     * exponent in an exponential calculation
     * @return Primative double representing the calculated exponential
     * value of the baseInput and exponentInput.
     */
    public static double power(double baseInput, int exponentInput) {
        double powerResults = 1;
        //a^0 = 1
        //a^1 = a
        //loop through to calculate results
        // a^b. for loop 0 -> size
        for (int i = 1; i <= absoluteValue(exponentInput); ++i) {
            powerResults *= baseInput;
        }//for iterating to exponentInput
        if (exponentInput >= 0) {
            return powerResults;
        }
        else {
            return (1 / powerResults);
        }
    }//end power()

    public static double root(double radicandInput, int rootInput) {
        //g' = g(1) -  g(1)^root - radicand  /  rootInput * g(1) ^ rootINput -1
        double initialGuess = 1, guessPrime = 1;
        //helper vars
        double topNum, botNum;
        
        while (true) {
            topNum = power(initialGuess, rootInput) - radicandInput;
            botNum = rootInput * power(initialGuess,(rootInput - 1));
            guessPrime = initialGuess - (topNum/botNum);
            if (absoluteValue(guessPrime - initialGuess) < power(10, -10)) {
                return guessPrime;
            }
            else {
                initialGuess = guessPrime;
                continue;
            }
        }
    }
    
}//end MyMath