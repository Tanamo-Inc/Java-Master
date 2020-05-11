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

public class HelloWorld {

    public static void main(String[] args) {

        // Calling static method.
        intro();

    }

    //Creating a static method without a return type.
    private static void intro() {

        toastln("***HELLO WORLD***");

        toastln("What your name ? ");
        String name = input.nextLine();

        toast("Welcome to the Java Programming Tutorials %s by Tanamo Limited. \n", name);

        toastln("Please enter your Level here ");
        String level = input.nextLine();

        toastln("Please enter your Email here ");
        String email = input.nextLine();

        toastln("Please enter your Phone Number here ");
        String number = input.nextLine();

        toastln("****User Profile***");
        toastln("Name :" + name);
        toastln("Level :" + level);
        toastln("Email Address: " + email);
        toastln("Phone Number : " + number);

        String text1 = "Congrat Dear !!!";
        String text2 = " For Help ";
        String text3 = " email tanamoinc@gmail.com";
        toast("%s\n ", text1);
        toast("%s%s%n", text2, text3);

    }

}
