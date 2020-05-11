
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
package core;

import java.util.Scanner;

public class MyCore {

    private String name;
    private String level;
    private String country;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    Generating getter and setter for Tandoh Class.
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show() {
        toast("%s is your name. \n", getName());
    }

    public static void toast() {
        System.out.println();
    }

    /**
     *
     * @param message
     */
    public static void toast(String message) {
        System.out.printf(message);
    }

    public static void toast(Integer message) {
        System.out.println(message);
    }

    public static void toastln() {
        System.out.println();
    }

    public static void toastln(String message) {
        System.out.println(message);
    }

    public static void toastln(Double message) {
        System.out.println(message);
    }

    public static void toastln(int message) {
        System.out.println(message);
    }

    public static void toastln(char message) {
        System.out.println(message);
    }

    
    
      public static void toastln(String message1, String message2) {
        System.out.printf(message1, message2);
    }
    
    /**
     *
     * @param message1
     * @param message2
     */
    public static void toast(String message1, String message2) {
        System.out.printf(message1, message2);
    }

    public static void toast(String message1, String message2, String message3) {
        System.out.printf(message1, message2, message3);
    }

    /**
     *take input from users.
     */
    public static Scanner input = new Scanner(System.in);
    
    
    
}
