package com.programacao4devs.abstractfactory.cakes;

import com.programacao4devs.abstractfactory.factory.CakeIngredientFactory;
import com.programacao4devs.abstractfactory.product.Cake;

public class ChocolateCake extends Cake {
	
	CakeIngredientFactory ingredientFactory;
	
	public ChocolateCake(CakeIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		topping = ingredientFactory.createTopping();
	}

}
