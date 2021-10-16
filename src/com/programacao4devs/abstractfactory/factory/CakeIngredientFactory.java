package com.programacao4devs.abstractfactory.factory;

import com.programacao4devs.abstractfactory.product.Dough;
import com.programacao4devs.abstractfactory.product.Topping;

public interface CakeIngredientFactory {
	
	public Dough createDough();
	public Topping createTopping();

}
