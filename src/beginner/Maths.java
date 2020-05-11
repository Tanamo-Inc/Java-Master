package beginner;

import static core.MyCore.toastln;
import java.util.Random;

public class Maths {

    public static Maths math = new Maths();

    public static void main(String[] args) {

        math.mathFun();

    }

    private void mathFun() {

        toastln("The absolute value of |-9| is " + Math.abs(-9));    //absolute value.
        toastln(Math.ceil(7.45)); // rounds up 
        toastln(Math.floor(7.45));// rounds down
        toastln(Math.max(4.5, 9.0)); // maximum value    
        toastln(Math.min(4.5, 9.0));  // minimum value
        toastln(Math.pow(5, 3));      // 5 rise to the power of 3 .     
        toastln("The square root of 16 is " + Math.sqrt(16));     //square root of 16.
        toastln();

        //************************************************//
        Random ran = new Random();

        for (int counter = 1; counter <= 10; counter++) {
            int number = ran.nextInt(7); //  the list of number will not exceed 7.
            toastln(number + "\n");
        }
        // when creating array table.
        toastln("Index\tValue");

        int tandoh[] = {32, 12, 18, 54, 2};

        for (int counter = 0; counter < tandoh.length; counter++) {
            toastln(counter + "\t" + tandoh[counter]); // creating the table.
        }

    }

}
