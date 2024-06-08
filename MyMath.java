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
     * power() accepts a baseInput double and an int
     * xponenetInput to calculate the exponential value of 
     * the base raised to the exponent. 
     * @param baseInput Primative double representing the base of an
     * exponential calculation
     * @param exponentInput Primative int representing the 
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
        }//if exponent is positive
        else {
            return (1 / powerResults);
        }//else exponent negative
    }//end power()

    /**
     * root() accepts a double radicandInput and an int
     * rootInput to determin the root of the radicand.
     * Recursively calculates probable root using
     * Newton's Method
     * <p>Utilizes {@link #newtonsRecursion(double, int, double)} helper
     * to calculate the estimated root value.
     * @param radicandInput Primitive double that holds the base radicand
     * @param rootInput Primitive int that holds the root value
     * @return Primitive double holding the root solution
     */
    public static double root(double radicandInput, int rootInput) {
        //g' = g(1) -  ((g(1) ^ root) - radicand  /  rootInput * g(1) ^ (rootInput - 1)))
        double initialGuess = 1;
        double estimatedRoot = newtonsRecursion(radicandInput, rootInput, initialGuess);
        return estimatedRoot;
    }//end root()

    /**
     * newtonsRecursion drives the recursion in implementing
     * Newton's Method to estimate root values.<p>Calls Helper methods
     * {@link #newtonsHelper(double, int, double)} and {@link #newtonsChecker(double, double)}
     * @param radicandInput Primitive double holding base radicand value
     * @param rootInput Primitive int holding root index value
     * @param currentGuess Primitive double holding current estimated root
     * @return Primitive double holding the current esitmated root
     */
    private static double newtonsRecursion(double radicandInput, int rootInput, double currentGuess) {
        double estimatedRoot = newtonsHelper(radicandInput, rootInput, currentGuess);
        boolean rootFound = newtonsChecker(currentGuess, estimatedRoot);
        if (rootFound) {
            return estimatedRoot;
        }//if root found
        else {
            return newtonsRecursion(radicandInput, rootInput, estimatedRoot);
        }//else root not found - recurse
    }//end newtonsRecursion()

    /**
     * newtonsHelper() performs the essential calculation to implement 
     * Newton's Method. Calculates the number for the sequence of convergence
     * to determine the value of the desired root.
     * @param radicandInput Primitive double value holding base radicand
     * @param rootInput Primitive int value holding root index
     * @param currentGuess Primitive double value holding the current guess for root
     * @return Primitive double holding the calculated guess for the root
     */
    private static double newtonsHelper(double radicandInput, int rootInput, double currentGuess) {
        double topNumber, bottomNumber, calculatedGuess;
        topNumber = power(currentGuess, rootInput) - radicandInput;
        bottomNumber = rootInput * power(currentGuess, (rootInput - 1));
        calculatedGuess = currentGuess - (topNumber / bottomNumber);
        return calculatedGuess;
    }//end newtonsHelper()

    /**
     * newtonsChecker() performs the boolean check to determine
     * if the estimated root is significantly close to the
     * current guess.
     * @param currentGuess Primitive double that holds the current root guess
     * @param estimatedRoot Primitive double that holds the current
     * calculated root estimate
     * @return Boolean whether estimatedRoot is significantly close to
     * currentGuess
     */
    private static boolean newtonsChecker(double currentGuess, double estimatedRoot) {
        if (absoluteValue(estimatedRoot - currentGuess) < power(10, -10)){
            return true;
        }//end if estimated root likely
        else {
            return false;
        }//end else estimated root unlikely
    }//end newtonsChecker()

    /**
     * gcd() accepts two arbitrary int values to determine
     * the greatest common divisor.<p>If one parameter is zero,
     * other parameter is returned. Recursively calculates
     * the gcd(value2, value1%value2)
     * @param value1 Primitive int holding arbitrary value
     * @param value2 Primitive int holding arbitrary value
     * @return Primitive int holding greatest common divisor
     */
    public static int gcd(int value1, int value2) {
        if (value2 == 0){
            return value1;
        }
        else if (value1 == 0) {
            return value2;
        }
        else {
            return gcd(value2, value1 % value2);
        }
    }//end gcd()

}//end MyMath