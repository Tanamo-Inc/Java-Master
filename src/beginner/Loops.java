/*
 * Copyright 2016,Tanamo Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package beginner;

import static core.MyCore.*;

public class Loops {

    public static void main(String[] args) {
        loop();

    }

    //Creating a static method without a return type.
    private static void loop() {

        String txt[] = {"Welcome", "to", "Tanamo", "Inc"};

        // using the for/each loop.
        for (String entry : txt) {
            toastln(entry);
        }

        // using the for loop
        toastln("The values of numbers between 0 and  21 are as follows :");
        for (int x = 1; x <= 20; x++) {
            System.out.println(x);
        }

        // while loop
        int num = 10;
        toastln("This is a while loop");
        while (num <= 2) {
            toast(num);
        }

        //do while loop
        int t = 10;
        do {
            toastln("This is a do while loop");
        } while (t < 15);

    }

}
