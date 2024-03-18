/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.usingtoarray;

/**
 *
 * @author acer
 */
import java.util.LinkedList; 
import java.util.Arrays;

public class UsingToArray {

    public static void main(String[] args) {
        String[] colors = { "black", "blue", "yellow" }; 
         
        LinkedList< String > links = new LinkedList< String >( Arrays.asList( colors ) );
        
        links.addLast( "red" ); // add as last item IT 
        links.add( "pink" ); // add to the end 
        links.add( 3, "green" ); // add at 3rd index 
        links.addFirst( "cyan" ); // add as first item 
        
        // get LinkedList elements as an array 
        colors = links.toArray( new String[ links.size() ] ); 
        
        System.out.println( "colors: " ); 
        
        for ( String color : colors ) 
            System.out.println( color ); 
    } // end main 
} // end class UsingToArray 
 

