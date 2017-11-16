package com.piotrmajcher.jsinjava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.jar.JarInputStream;

import javax.script.*;
import javax.swing.JDialog;
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
			System.out.println("multi01: " + res);
			scalarProduct.setA(a);
			res = scalarProduct.multi02(b);
			System.out.println("multi02: " + res);
			scalarProduct.setB(b);
			scalarProduct.multi03();
			System.out.println("multi03: " + scalarProduct.getC());
			
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
        System.out.println( "Hello World!" );
    }
}
