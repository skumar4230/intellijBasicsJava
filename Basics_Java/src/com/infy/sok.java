package com.infy;





/*Implement the DivisorSum interface and Solution class here*/
/*Insert the appropriate import statements for the Scanner class*/
import java.util.*;
import java.util.stream.Collectors;

/*Don't place package name*/

import java.util.*;

 class sok {
    
    public static void main(String[] args) {
        
     
        /*remove print statement and start your code here*/
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        sc.close();
        String[] valArray = val.split(" ");
        for(int i = 0; i<valArray.length; i++){
            String actual = valArray[i];
            int actualLength = actual.length();
            if(actual.length()<=2){
                System.out.print(actual);
             
            }else{
                if(i % 2 ==0){
                    //odd position
                    Character[] arr = actual.chars().mapToObj(c ->(char)c).toArray(Character[]::new);
                    Arrays.sort(arr, 1, actualLength - 1, Comparator.reverseOrder());
                    System.out.print(Arrays.stream(arr).map(Object::toString).collect(Collectors.joining()));
                    
                }else{
                    //even
                    char[] evenArray = actual.toCharArray();
                    Arrays.sort(evenArray,1, actualLength - 1);
                    System.out.print(new String (evenArray));
                }
            }
            if(i !=valArray.length - 1){
                System.out.print(" ");
            }
        }
      
    }

}
