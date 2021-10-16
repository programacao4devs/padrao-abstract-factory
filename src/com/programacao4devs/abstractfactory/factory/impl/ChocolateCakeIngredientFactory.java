package com.programacao4devs.abstractfactory.factory.impl;

import com.programacao4devs.abstractfactory.factory.CakeIngredientFactory;
import com.programacao4devs.abstractfactory.ingredients.ChocolateTopping;
import com.programacao4devs.abstractfactory.ingredients.ConventionalDough;
import com.programacao4devs.abstractfactory.product.Dough;
import com.programacao4devs.abstractfactory.product.Topping;

public class ChocolateCakeIngredientFactory implements CakeIngredientFactory {

	@Override
	public Dough createDough() {
		return new ConventionalDough();
	}

	@Override
	public Topping createTopping() {
		return new ChocolateTopping();
	}

}
