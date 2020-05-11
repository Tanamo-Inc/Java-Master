package beginner;

import static core.MyCore.*;

public class Even_Num {

    public static void main(String[] args) {

        toastln("\t Checking For Even Numbers");

        toastln("Enter a number to check below:");

        long number = input.nextLong();

        boolean isEven = true;

        //Even number checker    
        if (number % 2 != 0) {
            isEven = false;
        }

        if (isEven) {
            toastln("The number " + number + "  is an Even Number. !!");
        } else {
            toastln("The number " + number + "  is not an Even number. !!");
        }

        input.close();
    }
}
