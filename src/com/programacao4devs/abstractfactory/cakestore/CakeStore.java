package com.programacao4devs.abstractfactory.cakestore;

import com.programacao4devs.abstractfactory.product.Cake;

public abstract class CakeStore {

	protected abstract Cake createCake(String type);
	
	public Cake orderCake(String type) {
		Cake cake;
		
		cake = createCake(type);
		
		cake.prepare();
		cake.bake();
		cake.cut();
		cake.box();
		
		return cake;
	}
}
