/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.listtest;

/**
 *
 * @author acer
 */
import java.util.List; 
import java.util.LinkedList; 
import java.util.ListIterator;

public class ListTest {

    public static void main(String[] args) {
        // add colors elements to listl 
        String[] colors = { "black", "yellow", "green", "blue", "violet", "silver" }; 
        List< String > list1 = new LinkedList< String >(); 
        
        for ( String color : colors ) 
            list1.add( color ); 
        
        // add colors2 elements to list2 
        String[] colors2 = { "gold", "white", "brown", "blue", "gray", "silver" }; 
        List< String > list2 = new LinkedList< String >();
 
        for ( String color : colors2 ) 
            list2.add( color ); 
        
        list1.addAll( list2 ); // concatenate lists 
        list2 = null; // release resources 
        printList( list1 ); // print list elements 
        
        convertToUppercaseStrings( list1 ); // convert to uppercase string 
        printList( list1 ); // print listl elements 
        
        System.out.print( "\nDeleting elements 4 to 6..." ); 
        removeItems( list1, 4, 7 ); // remove items 4-6 from list 
        printList( list1 ); // print listl elements 
        printReversedList( list1 ); // print list in reverse order 
    } // end main 
// output List contents 
    private static void printList( List< String > list ) { 
        System.out.println( "\nlist: " );
        
        for ( String color : list ) 
            System.out.printf( "%s ", color ); 
        
        System.out.println(); // end method printList 
    } 

// locate String objects and convert to uppercase 
    private static void convertToUppercaseStrings( List< String > list ){
        ListIterator< String > iterator = list.listIterator(); 
        
        while ( iterator.hasNext()) { 
            String color = iterator.next(); // get item 
            iterator.set( color.toUpperCase() ); // convert to upper case 
        }// end while 
    } // end method convertToUppercaseStrings 
// obtain sublist and use clear method to delete sublist items 
    private static void removeItems( List< String > list, int start, int end ) { 
        list.subList( start, end ).clear(); // remove items 
    } // end method removeltems 
    // print reversed list 
    private static void printReversedList( List< String > list ) {
        ListIterator< String > iterator = list.listIterator( list.size() ); 

        System.out.println( "\nReversed List:" ); 
        
        // print list in reverse order 
        while ( iterator.hasPrevious() ) 
            System.out.printf( "%s ", iterator.previous() );   
    }
}
