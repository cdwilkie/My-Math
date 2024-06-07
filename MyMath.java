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
}