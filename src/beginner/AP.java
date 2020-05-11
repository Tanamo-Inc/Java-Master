package beginner;

import static core.MyCore.toastln;

   //Arithmetic Progression Class
public class AP {
 
    public static void main(String[] args) {

        toastln("Arithmetic Progression :");

        double firstTerm = 24;
        double commonDifference = 7.5;
        int numberOfTerms = 15;

        toastln("first term : " + firstTerm);
        toastln("common difference : " + commonDifference);
        toastln("number of terms : " + numberOfTerms);
        toastln();

        toastln("Arithmetic Progression : ");
        for (int i = 0; i < numberOfTerms; i++) {
            double ith = firstTerm + i * commonDifference;
            toastln(ith);
        }
    }
}
