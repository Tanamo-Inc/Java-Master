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
import static core.MyCore.*;

public class Users {

    public static void main(String args[]) {

        mySetterAndGetter();

    }

    private static void mySetterAndGetter() {

        MyCore user1 = new MyCore();

        user1.setName("Tandoh Anthony Nwi-Ackah. ");

        user1.setLevel("400");

        user1.setCountry("Ghana");

        MyCore user2 = new MyCore();

        user2.setName("Woode Theodore. ");

        user2.setLevel("400");

        user2.setCountry("Ghana");

        MyCore user3 = new MyCore();

        user3.setName("Yankey Godwin");

        user3.setLevel("100");

        user3.setCountry("China");

        MyCore user4 = new MyCore();

        user4.setName("Peter");

        user4.setLevel("200");

        user4.setCountry("U.S.A");

        MyCore user5 = new MyCore();

        user5.setName("Yaba");

        user5.setLevel("300");

        user5.setCountry("England");

        //Displaying Users using the Getter and Setter Model
        toastln("***Displaying Users using the Getter and Setter Model***" + "\n");

        toastln("Name    : " + user1.getName() + "\n" + "Level   : " + user1.getLevel() + "\n" + "Country : " + user1.getCountry() + "\n");

        toastln("Name    : " + user2.getName() + "\n" + "Level   : " + user2.getLevel() + "\n" + "Country : " + user2.getCountry() + "\n");

        toastln("Name    : " + user3.getName() + "\n" + "Level   : " + user3.getLevel() + "\n" + "Country : " + user3.getCountry() + "\n");

        toastln("Name    : " + user4.getName() + "\n" + "Level   : " + user4.getLevel() + "\n" + "Country : " + user4.getCountry() + "\n");

        toastln("Name    : " + user5.getName() + "\n" + "Level   : " + user5.getLevel() + "\n" + "Country : " + user5.getCountry() + "\n");

    }

}
