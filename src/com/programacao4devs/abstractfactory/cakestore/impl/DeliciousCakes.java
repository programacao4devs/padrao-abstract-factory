package com.programacao4devs.abstractfactory.cakestore.impl;

import com.programacao4devs.abstractfactory.cakes.ChocolateCake;
import com.programacao4devs.abstractfactory.cakes.CoconutCake;
import com.programacao4devs.abstractfactory.cakestore.CakeStore;
import com.programacao4devs.abstractfactory.factory.CakeIngredientFactory;
import com.programacao4devs.abstractfactory.factory.impl.ChocolateCakeIngredientFactory;
import com.programacao4devs.abstractfactory.factory.impl.CoconutCakeIngredientFactory;
import com.programacao4devs.abstractfactory.product.Cake;

public class DeliciousCakes extends CakeStore {

	@Override
	protected Cake createCake(String type) {
		
		Cake cake = null;
		CakeIngredientFactory ingredientFactory;
		
		if (type.equals("chocolate")) {
			
			ingredientFactory = new ChocolateCakeIngredientFactory();
			cake = new ChocolateCake(ingredientFactory);
			cake.setName("Chocolate Cake");
			
		} else if (type.equals("coconut")) {
			
			ingredientFactory = new CoconutCakeIngredientFactory();
			cake = new CoconutCake(ingredientFactory);
			cake.setName("Coconut Cake");
		}
		
		return cake;
	}

}
