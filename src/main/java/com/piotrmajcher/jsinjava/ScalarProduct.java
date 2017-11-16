package com.piotrmajcher.jsinjava;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.*;

public class ScalarProduct {

	private Invocable invocable;
	private Double[] a;
	private Double[] b;
	private Double c;
	
	public ScalarProduct(Invocable invocable) {
		this.invocable = invocable;
	}


	public Double[] getA(){
		return a;
	}

	public Double[] getB(){
		return b;
	}

	public double getC(){
		return c;
	}

	public void setA(Double[] a){
		this.a = a;
	}

	public void setB(Double[] b){
		this.b = b;
	}

	public void setC(double c){
		this.c = c;
	}

	public Double multi01(Double[] aArg, Double[] bArg) throws ScriptException, NoSuchMethodException {
		return (Double) invocable.invokeFunction("multi01", aArg, bArg);
	}

	public Double multi02(Double[] bArg) throws ScriptException, NoSuchMethodException {
		return (Double) invocable.invokeFunction("multi02", this, bArg);
	}
	
	public void multi03() throws ScriptException, NoSuchMethodException {
		invocable.invokeFunction("multi03", this);
	}

	public void multi04(){ // mnoży a i b, wynik wpisuje do c
		Double result = 0.0;
		for (int i = 0; i < a.length; i ++) {
			result += a[i] * b[i];
		}
		c = result;
	}
}