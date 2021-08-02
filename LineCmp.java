package com.linecmp;

import java.util.Scanner;

public class LineCmp {
		public static void main (String[] args) {
			System.out.println("Welcome to the line comparison program");
			
			Scanner scanner = new Scanner (System.in);
			 System.out.print("Enter x co-ordinate of first point::");
			 double	x1 = scanner.nextDouble();
			 System.out.print("Enter y co-ordinate of first point::");
			 double y1 = scanner.nextDouble();
			 System.out.print("Enter x co-ordinate of second  point::");
			 double x2 = scanner.nextDouble();
			 System.out.print("Enter y co-ordinate of second  point::");
			 double y2 = scanner.nextDouble(); 
			  double lengthOfLine1 = Math.sqrt(Math.pow((x2-x1),2)) + Math.pow((y2-y1), y2) ;
			  System.out.println("Length of the line 1:" +lengthOfLine1);
			  
			  System.out.print("Enter x co-ordinate of third point::");
			  double p3 = scanner.nextInt();
	         	  System.out.print("Enter y co-ordinate of third  point::");
	          	double q3 = scanner.nextInt();
	          	System.out.print("Enter x co-ordinate of fourth  point::");
	          	double p4 = scanner.nextInt();
	          	System.out.print("Enter y co-ordinate of fourth  point::");
	          	double q4 = scanner.nextInt();
	     	  	double lengthOfLine2 = Math.sqrt(Math.pow((p4-p3),2)) + Math.pow((q4-q3), 2) ;
			  System.out.println("Length of the line 2:" +lengthOfLine2);
			  
			  Integer a = new Integer((int)lengthOfLine1);
			  Integer b = new Integer((int)lengthOfLine2);
			  		if(a.equals (b))
			  			System.out.println("Both Lines are eaqual");
			  		else 
			  			System.out.println("Both lines are not equal");
			
			 int value =(a.compareTo(b));
				  if(value == 0)
		         	  System.out.println("Both lines are equal");
		          else if (value == 1)
		         	 System.out.println("Length of line 1 is greater than line 2 ");
		          else
		        	  System.out.println("Length of line 2 is greater than line 1 ");

			  
			
		}
	}
