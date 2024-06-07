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
     * where pi {@link #PI_CONSTANT} has value {@value #PI_CONSTANT}.
     * @param angleRadians Double value representing angle in radians
     * @return Double primitive value of angle expressed in degrees
     */
    public static double toDegrees(double angleRadians) {
        //360 degrees = 2 * pi radians
        // 360/2pi = 1 radian
        //180/pi = 1 radian
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
     * * same, the second parameter is returned.
     * @param inputValue1 Primative double representing any arbitrary value
     * @param inputValue2 Primative double representing any arbitrary value
     * @return Primative double that is the minium of the passed parameters.
     */
    public static double minimum(double inputValue1, double inputValue2) {
        if (inputValue2 <= inputValue1) {
            return inputValue2;
        }//end if inputValue2 Smallest
        else {
            return inputValue1;
        }//end else inputValue1 smallest
    }//end minimum()
    
}