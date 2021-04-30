package com.te.factoryassignment;

public abstract class Plan {
	double rate;
    abstract void getRate();
 
 public float generateBill(float units)
 {
	 return (float) (rate*units);
 }
}
