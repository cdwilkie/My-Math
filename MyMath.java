/**
 * MyMath reimplements a portion of functionality
 * of the Java Math class.<p>
 * Functions include
 */
public class MyMath {
    /**Pi representation for class */
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

}