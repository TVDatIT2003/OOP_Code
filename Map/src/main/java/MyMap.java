/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
/* Name: Trần Văn Đạt
 IU Code: ITITIU21173
 Lab: Lab #5
 Date: 15/5/2023
 Purpose: Differences between Object, generic and generic raw types
*/

import java.util.*;

public class MyMap <K, V> implements MapMethods<K, V> { 	
    protected ArrayList<MapEntry<K, V>> map;
    public MyMap() { 		
        map = new ArrayList<>();
        }  	
    public MyMap(int initCapacity) {
        map = new ArrayList<MapEntry<K, V>>(initCapacity);
        }  	
    public V put(K k, V v) { 		
        if (k == null)  			
            throw new IllegalArgumentException("Maps do not allow null keys.");
    MapEntry<K, V> entry = new MapEntry(k, v);  		
    MapEntry<K, V> temp;  		
    Iterator<MapEntry<K, V>> search = map.iterator(); // Arraylist iterator  		
    while (search.hasNext()){
        temp = search.next();
        if (temp.getKey().equals(k)){  				
            search.remove();
            map.add(entry);  				
            return temp.getValue(); // k found, exits method  			
        }  		
    }// No entry is associated with k.  		
    map.add(entry);  		
    return null; 	
    }  	
    public V get(K k) { 
        if (k == null)  			
            throw new IllegalArgumentException("Maps do not allow null keys.");
        for (MapEntry<K, V> temp : map) // uses ArrayList iterator  			
            if (temp.getKey().equals(k))  				
                return temp.getValue(); // k found, exits method  		
            // No entry is associated with k.  		
            return null;}  	
    public V remove(K k) { 
        if (k == null)  			
            throw new IllegalArgumentException("Maps do not allow null keys.");
        MapEntry<K, V> temp;  		
        Iterator<MapEntry<K, V>> search = map.iterator();  		
        while (search.hasNext()) { temp = search.next(); 			
        if (temp.getKey().equals(k)) { 
            search.remove();
            return temp.getValue(); // k found, exits method 			
            } 		
        } 		
        return null; 	
    }  	
    public boolean contains(K k) { 
        if (k == null)  			
            throw new IllegalArgumentException("Maps do not allow null keys.");
        for (MapEntry temp : map)  			
            if (temp.getKey().equals(k))  				
                return true; // k found, exits method 		
        return false; 	
    }  	
    public boolean isEmpty() { 		
        return (map.size() == 0); // uses ArrayList size 	
    }  	
    public boolean isFull() {
        return false;// An ArrayListMap is never full 	
    }  	
    public int size() { 
        return map.size(); // uses ArrayList size 	
    }  	
    public Iterator iterator() { 
        return map.iterator(); // returns ArrayList iterator 	
    }  
}
