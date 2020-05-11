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

public class SimpleInterest {

    public static void main(String[] args) {

        si();
    }

    private static void si() {

        toastln("***SIMPLE INTEREST & AMOUNT***");

        toastln("Principal Value Here :");
        double principal = input.nextDouble();

        toastln("Rate Value Here :");
        double rate = input.nextDouble();

        toastln("Time Value Here :");
        double time = input.nextDouble();

        double SimpleInterest = principal * rate * time / 100;

        toast();

        toastln("SimpleInterest  = " + SimpleInterest + "\n");

        double Amount = principal + SimpleInterest;

        toastln("The  Amount = " + Amount);
    }
}
