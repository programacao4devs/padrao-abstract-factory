package com.programacao4devs.abstractfactory.product;

public abstract class Cake {

	protected String name;
	protected Dough dough;
	protected Topping topping;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 40 minutes at 180");
	}
	
	public void cut() {
		System.out.println("Cutting the cake into square slices");
	}
	
	public void box() {
		System.out.println("Place cake in official CakeStore box");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
