/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.binarysearchtest;

/**
 *
 * @author acer
 */
 import java.util.List; 
import java.util.Arrays; 
import java.util.Collections; 
import java.util.ArrayList;

public class BinarySearchTest {

    public static void main(String[] args) {
        // create an ArrayList< String > from the contents of colors array 
        String[] colors = { "red", "white", "blue", "black", "yellow", "purple", "tan", "pink" }; 
        List< String > list = new ArrayList< String >( Arrays.asList( colors ) );
     
        Collections.sort( list  ); // sort the ArrayList 
        System.out.printf( "Sorted ArrayList: %s\n", list ); 
        
        // search list for various values 
        printSearchResults( list, colors[ 3 ]);// first item
        printSearchResults( list, colors[ 0 ]);
        printSearchResults( list, colors[ 7 ]);
        printSearchResults( list, "aqua" ); 
        printSearchResults( list, "gray" ); 
        printSearchResults( list, "teal" );
    }// end main 
    
    // perform search and display result 
    private static void printSearchResults( List< String > list, String key ) { 
        int result = 0;
        
        System.out.printf( "\nSearching for: %s\n", key ); 
        result = Collections.binarySearch( list, key ); 
        
        if ( result >= 0 ) 
            System.out.printf( "Found at index %d\n", result ); 
        else System.out.printf( "Not Found (%d)\n",result ); 
    }// end method printSearchResults } }
}// end class BinarySearchTest 
