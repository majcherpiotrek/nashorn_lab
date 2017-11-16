/**
 * 
 */
var sayHello = function(name) {
  print('Hello, ' + name + '!');
  return 'hello from javascript';
};

var multi01 = function(a, b) {
	var Double = Java.type("java.lang.Double");
	var result = new Double(0.0);
	
	var i;
	for (i = 0; i < a.length; i++) {
		result += a[i] * b[i];
	}
	print('result: ' + result);
	return result;
}

var multi02 = function(object, b) {
	var Double = Java.type("java.lang.Double");
	
	var len = object.getA().length;
	var result = new Double(0.0);
	
	var i;
	for (i = 0; i < len; i++) {
		result += b[i] * object.getA()[i];
	}
	
	return result;
}

var multi03 = function(object) {
	var Double = Java.type("java.lang.Double");
	// Pobrać dane z okna od użytkownika
	object.multi04();
}