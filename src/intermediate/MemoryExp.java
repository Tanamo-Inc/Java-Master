package intermediate;

import static core.MyCore.toastln;

public class MemoryExp {
    //Print Total  And Free Memory At Runtime To The Console.//

    public static void main(String[] args) {

        long total, free;

        total = Runtime.getRuntime().totalMemory();
        free = Runtime.getRuntime().freeMemory();

        toastln("Total Memory " + total);
        toastln("Free  Memory " + free);
    }

}
