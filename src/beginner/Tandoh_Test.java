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

import core.MyCore;
import java.util.Scanner;

public class Tandoh_Test {

    public static void main(String[] args) {

        //Use Scanner for taking input values.
        try (Scanner input = new Scanner(System.in)) {

            //Calling Tandoh Class.
            MyCore obj = new MyCore();

            MyCore.toast("What is your Name ? \n");
            String temp = input.nextLine();
            obj.setName(temp);
            obj.show();
        }

    }
}
