package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = (float) 5 / 3f; //you can also use f at the end to verify the type
        double myDoubleValue = 5d / 3d; //don't need to really use d at the end
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);
        //because the integer is always a whole number the value will be a whole number for calculations

        double numberOfPounds = 200d;
        double ConvertedKilos = numberOfPounds * 0.45359237d;
        System.out.println(ConvertedKilos);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}