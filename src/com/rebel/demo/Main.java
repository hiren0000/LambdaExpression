package com.rebel.demo;

public class Main 
{

	public static void main(String[] args) {
	
		System.out.println("this is lambda lessons");
		System.out.println();
		
		AddTwoi ab = () -> System.out.println("this is first time using Lamda");
			
		ab.hry();
		System.out.println();
		
		AddTwoi at = new AddTwoi() {
			
			@Override
			public void hry() {
				System.out.println("this is annoymous fetching interface");
				
			}
		};
		
		at.hry();
		System.out.println();
		
		Impl i = new Impl();
		i.hry();
		
		System.out.println();
		
		//again fetching through the lambda with int param
		
		Second s = ((a , b) -> a+b);
		
		 System.out.println(s.add(4, 5));
		 
		//lambda with String param
		 
		  Third th = name -> name.length();
		  
		  System.out.println(th.len("Hiren Devmurari"));
		

	}

}
