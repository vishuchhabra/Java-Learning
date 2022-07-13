import java.text.NumberFormat;
import java.util.Scanner;

// import java.util.Date;
// import java.awt.*;
// import java.util.Arrays;

// public class Types {
// 	public static void main(String [] args) {

// 		// // Primitive  Types in Java - Int,short, Float, dobule ,long, boolean, byte ,char 

// 		// int age = 45;
// 		// int herAge = age;
// 		// System.out.println(age);
// 		// System.out.println(herAge);
// 		// boolean isDecided = (35==345);
// 		// System.out.println(isDecided);
// 		// int viewCount = 123_456_789; 
// 		// System.out.println(viewCount);
// 		// long temp =23443443454334L; // by default , it will try to read it as Int , so  that;s why type cast is required here 
// 		// float value = 234.34F; // by default , it will try to read it as Double, that;s why typecasting to float here.
// 		// byte age1 = 23;


// 		// // Reference Types in Java 
// 		// Date now = new Date();
// 		// System.out.println(now);
// 		// System.out.println(now.getTime());

// 		// // Point class to understand bit more about java refernce variable
// 		// Point first = new Point(455,4234);
// 		// Point second = first;
// 		// System.out.println(second);
// 		// // if we change value of one variable , it will effect value of other too, as they are using the reference variable
// 		// second.x = 45;
// 		// System.out.println(first);

// 		// // String in java  - In actual String are referece time in java 
// 		// String message = new String("This is first time writing java");
// 		// System.out.println(message);

// 		// String message1 = "This is first time , when i am writing java";
// 		// System.out.println(message1);

// 		// String tempStr = "Vishuu  chhabra is learning" + "java programming";
// 		// System.out.println(tempStr.endsWith("sdg"));
// 		// System.out.println(tempStr.startsWith("Vis"));
// 		// System.out.println(tempStr.indexOf("V"));
// 		// System.out.println(tempStr.indexOf("Vsdf")); // -1 in case , if we are unable to find element in string
// 		// System.out.println(tempStr.length());

// 		// String tempReplace = tempStr.replace("v", "c");
// 		// System.out.println(tempReplace);
// 		// System.out.println(tempStr.toUpperCase());
// 		// System.out.println(tempStr.toLowerCase());
// 		// System.out.println(tempStr.trim());

// 		// // String with quotes
// 		// String tempQ = "vishu \"sdff";
// 		// String tempQ1 = "\"visuu \\chha \n br \t a\"";
// 		// System.out.println(tempQ);
// 		// System.out.println(tempQ1);


// 		// // Array in Java 
// 		// int [] numbers = new int [3];
// 		// for(int i=0;i<3;i++){
// 		// 	numbers[i] = 3-i;
// 		// }
// 		// for(int i=0;i<3;i++){
// 		// 	System.out.println(numbers[i]);
// 		// }

// 		// // Arrays class in java
// 		// Arrays.sort(numbers);
// 		// System.out.println("After sorting the array ,values are");
// 		// for(int i=0;i<3;i++){
// 		// 	System.out.println(numbers[i]);
// 		// }

// 		// System.out.println(Arrays.toString(numbers));
		
// 		// int [] arr = {1,2,3,4,5};
// 		// System.out.println(arr.length);

// 		// // multidmensonal array
// 		// int [][] numbersMulti = new int[3][5];

// 		// // method to print multidimensional array
// 		// System.out.println(Arrays.deepToString(numbersMulti));

// 		// boolean [][] boolTemp = {{true,true,false},{false,false,false},{true, true,false}};
// 		// boolean [] byteTemp  = {true,false,true,false,false};

// 		// System.out.println(byteTemp);
// 		// System.out.println(boolTemp.length);

// 		// for(int i=0;i<byteTemp.length;i++){
// 		// 	System.out.println(byteTemp[i]);
// 		// }

// 		// float tempFloat = 45.24F;
// 		// System.out.println(tempFloat);

// 		// long tempIntWithComma = 123_34_245_34_45L;
// 		// System.out.println(tempIntWithComma);
		 
// 		// Date newDate = new Date();
// 		// System.out.println(newDate);
// 		// long timeActual = newDate.getTime();
// 		// System.out.println(timeActual);

// 		boolean [] boolTemp = {true, false, true, false, false, true};
// 		String boolTempString = Arrays.toString(boolTemp);
// 		System.out.println(boolTempString);

// 		int [] intTemp = {1,2,3,4,5};
// 		System.out.println(Arrays.toString(intTemp));

// 		// Const variable
// 		final float PI = 3.14F; // Way to declare const variable - By convention , Every letter of constant should be capital
// 		System.out.println(PI);

// 		// Arithmatic expression
// 		int resultOfMod = 34%4;
// 		System.out.println(resultOfMod);
		
// 		// typeCasting in Java 
// 		double floatDiv = (double)45/(double)34;
// 		System.out.println(floatDiv);

// 		int x = 34;
// 		int y = x++;
// 		System.out.println(x);
// 		System.out.println(y);
// 		y = ++x;
// 		System.out.println(x);
// 		System.out.println(y);

// 		y+=45;
// 		System.out.println(y);

// 		// Order of operatos 
// 		int temp = 1* 15 / 5 ;
// 		System.out.println(temp); // () > * / > + -  // Priority Level of Operators 
		
// 		short tempShort = 34;
// 		int valInt = tempShort +1;
// 		System.out.println(valInt); // Two types of casting is there - implicit casting and explicit casting
// 		double tempDo = 2.34;
// 		valInt = (int)tempDo +2;
// 		System.out.println(valInt);

// 		double tempDouble = 4;
// 		double tempDoubleRes = tempDouble + 2.0F;
// 		System.out.println(tempDoubleRes);

// 		// parsing Int from string
// 		String tempString = "123254";
// 		int resString = Integer.parseInt(tempString);
// 		System.out.println(resString);
// 		long longString  = Long.parseLong(tempString);
// 		System.out.println(longString);
		
// 	}
// }


// Math class
// public class Types{
// 	public static void main(String []args){
		
// 		System.out.println(Math.round(2.4));
// 		System.out.println(Math.round(3.5));
// 		System.out.println(Math.max(34,56));
// 		System.out.println((int)(Math.random()*100));
// 	}
// }


// // Number Format class in Java
// public class Types {

// 	public static void main(String [] args){

// 		NumberFormat currency = NumberFormat.getCurrencyInstance(); // we can't use new here , as its abstract class
// 		String currencyValue = currency.format(2452544.244);
// 		System.out.println(currencyValue);

// 		// percentage
// 		NumberFormat percentage = NumberFormat.getPercentInstance();
// 		String presult = percentage.format(0.34);
// 		System.out.println(presult);

// 	}
// }

// // Reading Input from the user
// public class Types {
// 	public static void main(String [] args){
		
// 		Scanner scanner = new Scanner(System.in);
// 		// int x = scanner.nextInt();
// 		// System.out.println(x);
// 		String y = scanner.nextLine();
// 		System.out.println("Your name is " + y.trim());
// 	}
// }


// Control Flow 
public class Types {
	public static void main(String [] args){
		// boolean result = (!(true && true ) || (false && true) ) || true;
		// System.out.println(result);
		// Scanner scanner = new Scanner(System.in);
		// // if statement 
		// String tempScanner = scanner.nextLine();

		// if(temp>=30)
		// 	System.out.println("Hot Day");
		// else if(temp<30 && temp>=15)
		// 	System.out.println("Beautiful Day");
		// else 
		// 	System.out.println("Cold  Day");

		// boolean value = (temp> 100 ? true : false); // Ternarry  operator 
		// System.out.println(value);


		// Switch Case in Java 
		// switch(temp){
		// 	case 34 : 
		// 		System.out.println("This is 34");
		// 		break;
		// 	case 45 :
		// 		System.out.println("This is 45");
		// 		break;
		// 	default :
		// 		System.out.println("This is default case");

		// }


		// For Loop
		// for(int i=0, j=5; j<56 && i<10;i++,j++){
		// 	System.out.println(
		// 		"Hello World"
		// 	);
		// }

		// while loop in java
		// int i =0;
		// while(i<10){
		// 	System.out.println(i);
		// 	i++;
		// }
		// int x = 45;
		// System.out.println(x ==45);

		// System.out.println(tempScanner);
		// System.out.println((tempScanner.equals("vishu"))); // String is not primitive data type , so we can;t use == for checking equality
		 
		// do while loop
		// int i =0;
		// do{
		// 	System.out.println("Hello world");
		// }
		// while(i<0);

		// foreach loop in java 

		String [] arr ={"vishu","chhabra","is","good","boy"};
		// for(String i: arr){
		// 	System.out.println(i);
		// }
	}
}