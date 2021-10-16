package com.programacao4devs.abstractfactory.factory.impl;

import com.programacao4devs.abstractfactory.factory.CakeIngredientFactory;
import com.programacao4devs.abstractfactory.ingredients.CoconutTopping;
import com.programacao4devs.abstractfactory.ingredients.WholeWheatDough;
import com.programacao4devs.abstractfactory.product.Dough;
import com.programacao4devs.abstractfactory.product.Topping;

public class CoconutCakeIngredientFactory implements CakeIngredientFactory {

	@Override
	public Dough createDough() {
		return new WholeWheatDough();
	}

	@Override
	public Topping createTopping() {
		return new CoconutTopping();
	}

}
