package com.programacao4devs.abstractfactory;

import com.programacao4devs.abstractfactory.cakestore.CakeStore;
import com.programacao4devs.abstractfactory.cakestore.impl.DeliciousCakes;
import com.programacao4devs.abstractfactory.product.Cake;

public class ApplicationCakeStore {

	public static void main(String[] args) {
		CakeStore cakeStore = new DeliciousCakes();
		
		Cake cake = cakeStore.orderCake("coconut");
		System.out.println("Order placed for a " + cake.getName() );

	}

}
