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

public class Average {

    public static void main(String[] args) {
        int total = 0;
        int grade, average;
        int counter = 0;
        int length;

        toast("Finding the Average of Numbers \n");

        toastln("How many numbers ?");
        length = input.nextInt();

        toastln("Enter the numbers here:");

        while (counter < length) {
            grade = input.nextInt();
            total = total + grade;
            counter++;

        }

        average = total / length;
        toastln("THE AVERAGE OF THE ENTERED NUMBERERS IS " + average);
    }

}
