package com.java.test.program1;

import java.util.LinkedList;
import java.util.List;

public class JavaAssessmentProgram1 {
   public static void main(String[] args) {
	LinkedList<Integer> list1=new LinkedList<Integer>();
  list1.add(1);
  list1.add(4);
  list1.add(8);
  list1.add(10);
  list1.add(19);
  list1.add(20);
  System.out.println("list = "+list1);
  
  Integer sum=0;
  for (Integer integer : list1) {

	  sum+=integer;
}
  System.out.println("sum = "+sum);
  
  //to Delete the node at the end
  list1.remove(list1.size()-1);
  System.out.println("After Delete the node at the end = "+list1);
  
  for(Integer i=0;i<list1.size();i++)
  {
	  if(i%2==0)
	  {
		 System.out.print("print odd elements"+list1.get(i)+" ");
	  }
  }
}
   
   
   
}
