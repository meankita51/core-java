package com.be.streamapi.entitiies.pincode;

import java.util.Arrays;
//import java.util.Comparator;
import java.util.stream.IntStream;
//import java.util.stream.Stream;

//import com.be.streamapi.entitiies.Student;

public class PinCode {
	
	public static void main(String[] args) {
	int[] intArray= {410,876,234,954,432};
	
	 IntStream intStream=Arrays.stream(intArray);
	 
	 intStream.filter(no->no%2==0)
	  .filter(number->number>2)
      .filter(no->no>4)
      .forEach(no->System.out.println(no));
	 
	 
	}
}
