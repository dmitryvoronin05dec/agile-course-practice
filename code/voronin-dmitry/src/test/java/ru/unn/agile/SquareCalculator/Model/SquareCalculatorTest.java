package ru.unn.agile.SquareCalculator.Model;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import static org.junit.Assert.assertEquals;

/**
 * Created by Дмитрий on 20.11.2016.
 */
public class SquareCalculatorTest {
    @Test
    public void calculSquareSphereWhenRad0(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getSphereSquare(0);
        assertEquals(0,result,0.00000001);
    }

    @Test
    public void calculSquareSphereWhenRad5Dot1(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getSphereSquare(5.1);
        assertEquals(326.851299679482 , result , 0.00000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculSquareSphereWhenRadiusNegative(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getSphereSquare(-5.1);
    }

    @Test
    public void calculSquareConeWhenRadius0AndRulOfCone5(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getConeSquare(0,5);
        assertEquals(0 , result ,0.00000001 );
    }

    @Test
    public void calculSquareConeWhenRad5AndRulOfCone0(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getConeSquare(5,0);
        assertEquals(78.53981633974483 , result ,0.00000001 );
    }

    @Test
    public void calculSquareConeWhenRad0AndRulOfCone0(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getConeSquare(0,0);
        assertEquals(0 , result ,0.00000001 );
    }

    @Test
    public void calculSquareConeWhenRad1Dot1AndRulOfCone10Dot1(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getConeSquare(1.1 , 10.1);
        assertEquals(38.70442149222625 , result ,0.00000001 );
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculSquareConeWhenRadNegativeAndRulOfCone5(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getConeSquare(-1 , 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculSquareConeWhenRad5AndRulOfConeNegative(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getConeSquare(5 , -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculSquareConeWhenRaAndRulOfConeNegative(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getConeSquare(-1 , -1);
    }

    @Test
    public void calculSquareCubeWhenLenght0(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getCubeSquare(0);
        assertEquals(0 , result ,0.00000001 );
    }

    @Test
    public void calculSquareCubeWhenLenght5(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getCubeSquare(5);
        assertEquals(150 , result , 0.00000001);
    }

    @Test (expected = IllegalArgumentException.class)
    public  void calculSquareCubeWhenLenghtNegative(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getCubeSquare(-5);
    }

    @Test
    public void calculSquareCylinderWhenRad0AndHeght0(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getCylinderSquare(0,0);
        assertEquals(0, result ,0.00000001 );
    }

    @Test
    public void calculSquareCylinderWhenRad0AndHeight5(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getCylinderSquare(0,5);
        assertEquals(0 , result , 0.00000001);
    }

    @Test
    public  void calculSquareCylinderWhenRad5AndHeight0(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getCylinderSquare(5,0);
        assertEquals(157.07963267948966 , result , 0.00000001);
    }

    @Test
    public  void calculSquareCylinderWhenRad5AndHeight5(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getCylinderSquare(5,5);
        assertEquals(314.1592653589793 , result , 0.00000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public  void calculSquareCylinderWhenRadNegativeAndHeight1(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getCylinderSquare(-1,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public  void calculSquareCylinderWhenRad1AndHeightNegative(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getCylinderSquare(1,-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public  void calculSquareCylinderWhenRadAndHeightNegative(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getCylinderSquare(-1,-1);
    }

    @Test
    public void calculSquareParallelepipedWhenHeight0Lenght0Width0(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getParallelepipedSquare(0,0,0);
        assertEquals(0, result , 0.00000001);
    }

    @Test
    public void calculSquareParallelepipedWhenHeight0Lenght2Width2(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getParallelepipedSquare(0,2,2);
        assertEquals(8, result , 0.00000001);
    }

    @Test
    public void calculSquareParallelepipedWhenHeight2Lenght0Width2(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getParallelepipedSquare(2,0,2);
        assertEquals(8, result , 0.00000001);
    }

    @Test
    public void calculSquareParallelepipedWhenHeight2Lenght2Width0(){
        SquareCalculator calculator = new SquareCalculator();
        double result = calculator.getParallelepipedSquare(2,2,0);
        assertEquals(8, result , 0.00000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculSquareParallelepipedWhenHeightNegativeLenght2Width2(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getParallelepipedSquare(-2,2,2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculSquareParallelepipedWhenHeight2eLenghtNegativeWidth2(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getParallelepipedSquare(2,-2,2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculSquareParallelepipedWhenHeight2Lenght2WidthNegative(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getParallelepipedSquare(2,2,-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculSquareParallelepipedWhenHeighAndLenghtNegativeWidth2(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getParallelepipedSquare(-2,-2,2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculSquareParallelepipedWhenHeight2LenghtAndWidthNegative(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getParallelepipedSquare(2,-2,-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculSquareParallelepipedWhenHeightAndWidthNegativeLenght2(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getParallelepipedSquare(-2,2,-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculSquareParallelepipedWhenHeightLenghtWidthNegative(){
        SquareCalculator calculator = new SquareCalculator();
        calculator.getParallelepipedSquare(-2,-2,-2);
    }
}

