package sample;

import java.util.Scanner;

public class Sort_int {

	
	    static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	  
	    }  
	    public static void main(String[] args) {  
	    	System.out.println("Enter the no of element");
			Scanner s =new Scanner(System.in);
			
			int a=s.nextInt();
			int[] arr=new int[a];
			System.out.println("Enter the array element to be sorted:");
			for(int k=0;k<a;k++)
			{
				arr[k]=s.nextInt();
				
			} 
	                 
	                System.out.println("Array Before Bubble Sort");  
	                for(int i=0; i < arr.length; i++){  
	                        System.out.print(arr[i] + " ");  
	                }  
	                System.out.println();  
	                  
	                bubbleSort(arr);//sorting array elements using bubble sort  
	                 
	                System.out.println("Array After Bubble Sort");  
	                for(int i=0; i < arr.length; i++){  
	                        System.out.print(arr[i] + " ");  
	                }  
	   
	        }  
	} 

