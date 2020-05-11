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

public class Palindrome {

    public static Palindrome pal = new Palindrome();

    public static void main(String args[]) {

        pal.compute();

    }

    public void compute() {
        int i;
        int len;

        String input_num;
        String str;

        toastln("Enter the number: ");

        input_num = input.nextLine();

        len = input_num.length();

        str = "";

        for (i = len - 1; i >= 0; i--) {
            str = str + input_num.charAt(i);
        }

        if (!str.equals(input_num)) {
            toastln("The number " + input_num + " is not a Palindrome.");
        } else {
            toastln("The number " + input_num + " is a Palindrome.");
        }

        input.close();

    }

}
