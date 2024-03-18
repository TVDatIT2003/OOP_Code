/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.mymap;

/* Name: Trần Văn Đạt
 IU Code: ITITIU21173
 Lab: Lab #5
 Date: 15/5/2023
 Purpose: Differences between Object, generic and generic raw
types 
*/

public class MapEntry <K, V>{
    protected K key; 	
    protected V value;  	
    MapEntry(K k, V v) {
        key = k;
        value = v; 	
    }  	
    public K getKey() {
        return key;
    } 	
}
