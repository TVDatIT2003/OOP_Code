/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.lab5_1;

/* Name: Trần Văn Đạt
 IU Code: ITITIU21173
 Lab: Lab #5
 Date: 15/5/2023
 Purpose: Get familiar with generic types
*/

public class MyPair<T, U>  {
    public final T Fst; 
        public final U Snd;
        public MyPair(T fst, U snd) {
        this.Fst = fst; 
        this.Snd= snd;
        }
        public String toString() { return "(" +Fst + ", " + Snd + ")"; }
        
        //h. swap
        @SuppressWarnings({ "unchecked", "rawtypes" })
        public MyPair<U, T> swap(MyPair<T, U>myPair){
            return new MyPair(myPair.Fst, myPair.Snd);
        }
}
