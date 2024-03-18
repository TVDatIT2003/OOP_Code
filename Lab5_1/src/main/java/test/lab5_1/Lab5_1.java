/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.lab5_1;

/* Name: Trần Văn Đạt
 IU Code: ITITIU21173
 Lab: Lab #5
 Date: 15/5/2023
 Purpose: Get familiar with generic types
*/
public class Lab5_1 {
    
    public static void main(String[] args) {
        //b.declare MyPair<String,Integer>
        MyPair<String, Integer> pair1 = new MyPair<String, Integer>("Anders", 13);
        
        //C.Declare MaPair<String, Double>
        MyPair<String, Double> pair2 = new MyPair<String, Double>("Phoenix", 39.7);
        
        //d.Assigning MyPair<String,Double> to MyPair<String,Integer>
        //pair1=pair2;  //Invalid assignment
        
         //e.declare MyPair<String,Integer>
        MyPair<String, Integer> grades[] = new MyPair[5];
        grades[0] = new MyPair<String, Integer>("Frist", 1);
        grades[1] = new MyPair<String, Integer>("Second", 2);
        grades[2] = new MyPair<String, Integer>("Third", 3);
        
        //f. Use foreach statement
        for (MyPair<String, Integer> pair : grades){
            System.out.println(pair.toString());
        }
      
        //g. create appointment type
        //MyPair<MyPair<Integer, Integer>, String>
        MyPair<MyPair<Integer, Integer>, String> appointment = new MyPair<MyPair<Integer, Integer>, String>(new MyPair(1,2), "one");
        /*The below statement, that prints the second argument in the first generic type MyPair
         * The second argument in 2 in MyPair .*/
        System.out.println(appointment.Fst.Snd);
    }
}
