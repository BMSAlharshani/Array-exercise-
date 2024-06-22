/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayex;

import java.util.Arrays;

/**
 *
 * @author mczo4
 */
public class ArrayEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String [] school = {"Grade " , "Class" , "techer "} ; 
//      
//       
//        for (int i = 0 ; i<school.length; i++){ 
//           
//            System.out.println(school[i].substring(0, 1));
            

          int []arr = {1,2,3, 5}; 
          int []arr2 = new int [4]; 
          int sum = 0; 
          for (int i = 0 ; i < arr.length ; i++ ){ 
              sum = arr[i]+sum; 
              arr2[i] = sum; 
              
              if (arr[i] == 4){ 
                  System.out.println("amr is correct "); 
                  
              }
          }
          System.out.println(Arrays.toString(arr2)); 
        }
    }
    

