package com.jasdhir.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParalelStream {
	public static void main(String[] args){
		 
        List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
          
        //Here creating a parallel stream
         Stream<Integer> stream = list.parallelStream();  
 
         List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0)
                 .collect(Collectors.toList());
         System.out.print(evenNumbersList);
         
        
     }
}
