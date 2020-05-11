/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginner;

/**
 *
 * @author mac
 */


//The two most primitive Array operations are writing elements into them, and reading elements from them.
//All other Array operations are built on top of these two primitive operations.

// The actual code for creating an Array to hold DVD's.
//DVD[] dvdCollection = new DVD[15];

// A simple definition for a DVD.
public class DVD {
    public String name;
    public String releaseYear;
    public String director;
    

   public DVD(String name, String releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    @Override
   public String toString() {
        System.out.println( this.name + ", directed by " + this.director + ", released in " + this.releaseYear);
        return null;
    }
    
    
}