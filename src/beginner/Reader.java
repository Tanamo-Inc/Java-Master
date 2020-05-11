package beginner;
import static core.MyCore.toastln;

import java.io.* ;
   public class Reader
   { 
     public static void main(String[] args) 
     { 
       //create file object 
       File file = new File("C://Users//TANDOH//Desktop//file.txt" ); 
       BufferedInputStream bin = null; 
       
       try 
       { 
         //create FileInputStream object 
         FileInputStream fin = new FileInputStream(file); 
         
         //create object of BufferedInputStream 
         bin = new BufferedInputStream(fin); 
         
         
         //read file using BufferedInputStream 
         while( bin.available() > 0 ) 
         { 
         
         toastln((char)bin.read()); 
         } 
         
       } 
       catch(FileNotFoundException e) 
       { 
          toastln("File not found" + e); 
       } 
       catch(IOException ioe) 
       { 
           toastln("Exception while reading the file " + ioe); 
       } 
       finally 
       { 
         //close the BufferedInputStream using close method 
         try 
         { 
           if(bin != null) 
             bin.close(); 
         }catch(IOException ioe) 
         { 
           toastln("Error while closing the stream : " + ioe); 
         } 
       } 
     } 
   } 