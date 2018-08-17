package com.hsbc.form.numbers.largest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNumberCreator
{
    static String printLargest(List<Integer> numList){
    	return numList.stream().map(Object::toString).sorted((x,y)->(y+x).compareTo(x+y)).collect(Collectors.joining());
    }
     
    public static void main (String[] args) {
    	
    	List<Integer> numList = Arrays.asList(54, 546, 548, 60);
    	
    	List<Integer> numList1 = Arrays.asList(10,2);
    	
    	List<Integer> numList2 = Arrays.asList(3,30,34,5,9);
    	
    	List<Integer> numList3 = Arrays.asList(1,34,3,98,9,76,45,4);
    	
        System.out.println("Largest Number: " + printLargest(numList)  + " Expected Output = " + "6054854654");
        
        System.out.println("Largest Number: " + printLargest(numList1)  + " Expected Output = " + "210");
        
        System.out.println("Largest Number: " + printLargest(numList2)  + " Expected Output = " + "9534330");
        
        System.out.println("Largest Number: " + printLargest(numList3)  + " Expected Output = " + "998764543431");

    }
}
