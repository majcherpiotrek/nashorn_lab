package com.piotrmajcher.jsinjava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
    
    	try {
    		engine.eval(new FileReader("scalar_product.js"));
			ScalarProduct scalarProduct = new ScalarProduct((Invocable) engine);
			
			Double[] a = {1.0, 2.0, 3.0};
			Double[] b = {4.0, 5.0, 6.0};
			Double res = scalarProduct.multi01(a, b);
			System.out.println("multi01: " + "\na " + Arrays.toString(a) + "\nb " + Arrays.toString(b) + "\nres " +res);
			
			Double[] a2 = {10.0, 11.0, 12.0};
			scalarProduct.setA(a2);
			res = scalarProduct.multi02(b);
			System.out.println("multi02: "+ "\na " + Arrays.toString(scalarProduct.getA()) + "\nb " + Arrays.toString(b) + "\nres "+ res);
			scalarProduct.setB(b);
			scalarProduct.multi03();
			System.out.println("multi03: " + Arrays.toString(scalarProduct.getA()) + "\nb " + Arrays.toString(scalarProduct.getB()) + "\nres " + scalarProduct.getC());
			
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
