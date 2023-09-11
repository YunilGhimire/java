package Class2;

public class GravityoftheEarth {
    public static void main(String[] args) {
        double G = 6.67*10e-11; //
        double m = 5.972*10e24; // in kg
        double r = 6.37*10e6; // in meter

        double gravityofearth = (G * m) / (r* r);

        System.out.println("Gravity of the earth is: " + gravityofearth + " m/s^2" );
    }
}
