public class MathTest {
    public static void main(String[] args) {
            
             
        
             // sine test
            
            testDisplay("sine", (MyMath.sine(0) == 0.0));
            testDisplay("sine", (MyMath.sine(MyMath.PI/6) <= 0.49997 &&
                MyMath.sine(MyMath.PI/6) >= 0.4994));
            System.out.println(MyMath.sine(MyMath.PI/6));
            testDisplay("sine", (MyMath.sine(MyMath.PI/4) <= 0.7046529 &&
                MyMath.sine(MyMath.PI/4) >= 0.7046521));
            System.out.println(MyMath.sine(MyMath.PI/4));
        
            
            //lcm
            testDisplay("lcm", (MyMath.lcm(3,5) == 15));
            testDisplay("lcm", (MyMath.lcm(3,4) == 12));
            testDisplay("lcm", (MyMath.lcm(1,6) == 6));
            
            // gcd
            testDisplay("gcd", (MyMath.gcd(12,15) == 3));
            testDisplay("gcd", (MyMath.gcd(125,150) == 25));
            testDisplay("gcd", (MyMath.gcd(125,0) == 125));
            testDisplay("gcd", (MyMath.gcd(0,150) == 150));
              
            // root test
            testDisplay("root", (MyMath.root(35,5) <= 2.0361680046465517 &&
                MyMath.root(35,5) >= 2.0361680046465515));
            System.out.println(MyMath.root(35,5));
            testDisplay("root", (MyMath.root(16.5,2) <= 4.062019202318068 &&
                MyMath.root(16.5,2) >= 4.062019202318066));
            System.out.println(MyMath.root(16.5, 2));
            testDisplay("root", (MyMath.root(16,2) <= 4.000000009 &&
                MyMath.root(16,2) >= 3.999999999999));
             
            // power test
            testDisplay("power", (MyMath.power(3,0) <= 1));
            testDisplay("power", (MyMath.power(3,1) <= 3));
            testDisplay("power", (MyMath.power(3,3) <= 27));
            testDisplay("power", (MyMath.power(3.3,3) <= 35.938 &&
                MyMath.power(3.3,3) >= 35.936));
          
            // maximum test
            testDisplay("maximum", (MyMath.maximum(1.999999,2) <= 2));
            testDisplay("maximum", (MyMath.maximum(2,1.999999) <= 2));
            testDisplay("maximum", (MyMath.maximum(2,2) <= 2.0));
            
            // minimum test
            testDisplay("minimum", (MyMath.minimum(1.999999,2) <= 1.999999));
            testDisplay("minimum", (MyMath.minimum(2,1.999999) <= 1.999999));
            testDisplay("minimum", (MyMath.minimum(2,2) <= 2.0));
            
            // absoluteValue test
            testDisplay("absoluteValue", (MyMath.absoluteValue(0) <= 0.0));
            testDisplay("absoluteValue", (MyMath.absoluteValue(-2.3) <= 2.3));
            testDisplay("absoluteValue", (MyMath.absoluteValue(5.5) <= 5.5));
            
            // toRadians test
            testDisplay("toRadians", (MyMath.toRadians(57.2957795) <= 1.0 &&
                MyMath.toRadians(57.2957795) >= 0.9999999));
            testDisplay("toRadians", (MyMath.toRadians(180) <= 3.141599 &&
                MyMath.toRadians(180) >= 3.141590));
            testDisplay("toRadians", (MyMath.toRadians(360) <= 6.283189 &&
                MyMath.toRadians(360) >= 6.2831850));
            
            // toDegrees test
            testDisplay("toDegrees", (MyMath.toDegrees(1) <= 57.2957796 &&
                MyMath.toDegrees(1) >= 57.2957795000000000));
            testDisplay("toDegrees", (MyMath.toDegrees(3.141592) <= 180.0 &
                MyMath.toDegrees(3.141592) >= 179.99990));
            testDisplay("toDegrees", (MyMath.toDegrees(3.141592 * 2) <= 360.0 &&
                MyMath.toDegrees(3.141592 * 2) >= 359.9990));
            
          }
          
          public static void testDisplay(String test, Boolean testPass) {
            System.out.println("MyMath."+test+ (testPass ? " Pass" : " FAIL" ));
          }
        
        
    
}
