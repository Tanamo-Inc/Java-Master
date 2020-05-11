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

public class Statements {

    public static void main(String[] args) {

        stat();

    }

    public static void stat() {
        int x, y, z, tony;
        x = 10;
        y = 20;
        z = 30;
        tony = 5;

        if (x > y) {
            toastln("False");
        } else {
            toastln("True");
        }

        if (x > y || y > z) {
            toastln("This is True");
        } else {
            toastln("This is False");
        }

        if (x == z && x >= y) {
            toastln("It can't Be");
        } else {
            toastln("It can Be");
        }

        // if the condition is true , the first ans comes out.
        toastln(x == z ? "Yes" : "No");

        //Switch  statements
        switch (tony) {

            case 5:
                toastln("Welcome Dear");
            // break;

            case 6:
                toastln("Hope you Enjoying ?");
            // break;

            case 8:
                toastln("Do you UnderStand?");
                break;

            default:
                toastln("Tanamo Inc ");
                break;

        }

    }

}
