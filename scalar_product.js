/**
 * 
 */
var Double = Java.type("java.lang.Double");
var String = Java.type("java.lang.String");
var JOptionPane = Java.type("javax.swing.JOptionPane");

var sayHello = function(name) {
  print('Hello, ' + name + '!');
  return 'hello from javascript';
};

var multi01 = function(a, b) {
	var result = new Double(0.0);
	var i;
	for (i = 0; i < a.length; i++) {
		result += a[i] * b[i];
	}
	return result;
}

var multi02 = function(object, b) {
	var len = object.getA().length;
	var result = new Double(0.0);
	
	var i;
	for (i = 0; i < len; i++) {
		result += b[i] * object.getA()[i];
	}
	
	return result;
}

var multi03 = function(object) {	
	var input1 = JOptionPane.showInputDialog("Multi03: Input first double values array separated with commas");
	var input2 = JOptionPane.showInputDialog("Multi03: Input second double values array separated with commas");
	
	var stringInput1 = new String(input1);
	var array1 = stringInput1.split(',');
	var stringInput2 = new String(input1);
	var array2 = stringInput1.split(',');

	object.setA(array1);
	object.setB(array2);
	
	object.multi04();
}