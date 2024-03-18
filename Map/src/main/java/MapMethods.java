/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 

/* Name: Trần Văn Đạt
 IU Code: ITITIU21173
 Lab: Lab #5
 Date: 15/5/2023
 Purpose: Differences between Object, generic and generic raw types
*/
public interface MapMethods <K, V> extends Iterable{
    V put(K k, V v); 	
    V get(K k); 	
    V remove(K k); 	
    boolean contains(K k); 	
    boolean isEmpty(); 	
    boolean isFull(); 	
    int size(); 
}
