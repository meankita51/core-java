package com.be.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.be.streamapi.entitiies.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {2,5,4,3,8,9,1,6,7,2};
		
		 IntStream intStream=Arrays.stream(intArray);
		 
		 intStream.filter(no->no%2==0)
		 .map(no->no+1)
		 .max();
		 
//		 if(max.isEmpty())
//		 System.out.println()
			 
//    	 .filter(number->number>2)
//		 .filter(no->no>4)
//		 .forEach(no->System.out.println(no));
		 
//		 intStream.Closed();
		 
		 Student[] studentArray=new Student[5];
		 
		 studentArray[0]=new Student (0,"Megha",20);
		 studentArray[1]=new Student (1,"Ankita",21);
		 studentArray[2]=new Student (2,"Laxmi",23);
		 studentArray[3]=new Student (3,"Vishal",22);
		 studentArray[4]=new Student (4,"Rahul",21);
		 
		 Stream<Student>studentStream=Arrays.stream(studentArray);
		 
		 studentStream.map(e->e.getName())
		 .filter(name->name.charAt(1)=='a')
		 .forEach(name->System.out.println(name));
		 
		 studentStream.close();
		 
		 Stream<Student>studentStream1=Arrays.stream(studentArray);
		
		 studentStream1
		 .map(obj->obj.getAge())
//		 .map(Student::getAge)
		  .distinct()
		    .sorted(Comparator.reverseOrder())
		      .filter(e->e>20);
//		      .skip(2)
//		        .forEach(e->System.out.println(e));
//		         .count();
		 
//			if(!max1.isEmpty())
//		    	  System.out.println(max1.get());
		 
//		 System.out.println(count);
		 
//		 studentStream1.close();
		 
		 
		 Stream<Student>studentStream2=Arrays.stream(studentArray);
				 
				 String[]nameArray=studentStream2
				 .map(Student::getName)
				 .peek(System.out::println)
				 .filter(str->str.charAt(1)=='a')
				 .peek(System.out::print)
				 .toArray(String[]::new);
				 .collect(Collector.asList());
		 
		 
		 for(String name:nameArray)
			 System.out.println(name);
		 
	}

}
