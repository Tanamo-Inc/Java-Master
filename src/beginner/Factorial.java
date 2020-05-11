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

public class Factorial {

    public static void main(String[] args) {

        fact();

    }

    private static void fact() {
        toastln("Finding The Factorial Of A Number.");

        toastln("Enter The Number Here :");

        int num = input.nextInt();

        long result = 1;

        if (num <= 0) {
            result = 1;
        } else {
            for (int i = 1; i <= num; i++) {
                result = result * i;
            }
        }

        toastln("The factorial is given as  " + result);

    }

}
