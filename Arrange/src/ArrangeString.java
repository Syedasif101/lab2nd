//Arrange  the String in ascending order

public class ArrangeString {
	  public static void main(String[] args) { 
	     String str="This is a easiest example";  //declaring given  string
	     String[] str1=str.split(" ");    //split the value of string
	     for(int i=0;i<str1.length;i++)     
	     { 
	         for(int j=i+1;j<str1.length;j++) 
	         { 
	           if(str1[i].length()>str1[j].length()) 
	           {        
	        	   //sorting the string in ascending order
	             String temp= str1[i];   
	              str1[i]=str1[j]; 
	              str1[j]=temp; 
	            } 
	         } 
	   } 
	     //printing  the value of string
	    for(int i=0;i<str1.length;i++) 
	    { 
	       System.out.print(str1[i]+"  ");  
	    } 
	  } 
}
