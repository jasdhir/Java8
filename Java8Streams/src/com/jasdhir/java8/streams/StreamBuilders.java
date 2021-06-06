package com.jasdhir.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilders 
{
     public static void main(String[] args)
     {
    	 //creating a stream of a fixed number of integers.
         Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
         stream.forEach(p -> System.out.println(p));
         
         // creating a stream from the array
         Stream<Integer> streamArr = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
         streamArr.forEach(p -> System.out.println(p));
         
         //creating a stream from the List
         List<Integer> list = new ArrayList<Integer>();
         
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
 
         Stream<Integer> streamList = list.stream();
         streamList.forEach(p -> System.out.println(p));
         
         //creating a stream from generated elements
         Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
     
             randomNumbers.limit(20).forEach(System.out::println);
            
             //creating a stream from the characters of a given string
             Stream<String> streamChars = Stream.of("A$B$C".split("\\$"));
             streamChars.forEach(p -> System.out.println(p));
         }
     }

