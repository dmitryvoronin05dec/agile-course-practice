package ru.unn.agile.SquareCalculator.Model;

/**
 * Created by Дмитрий on 20.11.2016.
 */
public class SquareCalculator {
    public double getSphereSquare(double radius) {

        checkParams("Radius must not be negative!", radius);

        return SquareCalculatorConstants.SphereConst* Math.PI*radius*radius;

    }

    public double getConeSquare(double radius, double rulingofcone) {
        checkParams("Radius and Ruling Of Cone must not be negative!", radius , rulingofcone);
        return Math.PI*radius*(radius+rulingofcone);
    }

    public double getCubeSquare(double lenght) {
        checkParams("Lenght must not be negative!" , lenght);
        return SquareCalculatorConstants.CubeConst*lenght*lenght;
    }

    public double getCylinderSquare(double radius , double height) {
        checkParams("Radius and height must not be negative!", radius , height);
        return SquareCalculatorConstants.CylinderConst*Math.PI*radius*(radius+height);
    }

    public double getParallelepipedSquare(double height, double lenght, double width) {
        checkParams("height , lenght and width must not be negative!",height,lenght,width);
        return SquareCalculatorConstants.ParallelepipedConst*(height*lenght+height*width+lenght*width);
    }

    private void checkParams(final String message, final double... params) {
        for (double param : params) {
            if (param < 0) {
                throw new IllegalArgumentException(message);
            }
        }
    }
}

