package com.rebel.demo;

public class Main 
{

	public static void main(String[] args) {
	
		System.out.println("this is lambda lessons");
		System.out.println();
		
		AddTwoi a = () -> System.out.println("this is first time using Lamda");
			
		a.hry();
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
		
		//again fetchgng through the lambda
		
		 
		

	}

}
